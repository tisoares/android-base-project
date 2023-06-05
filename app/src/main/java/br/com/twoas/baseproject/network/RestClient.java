package br.com.twoas.baseproject.network;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import br.com.twoas.baseproject.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by TIAGO SOARES on 16/07/2019.
 */
public class RestClient {

    /**
     * This is our main backend/server URL.
     */
    public static final String REST_API_URL = BuildConfig.SERVER_BASE_URL;

    private static final Retrofit s_retrofit;


    static {

        // enable logging
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            Request original = chain.request();

            Request request = original.newBuilder()
                    .addHeader("Accept", "application/json")
                    //.header("User-Agent", "Your-App-Name")
                    //.header("Accept", "application/vnd.yourapi.v1.full+json") // TODO: Add Token
                    .method(original.method(), original.body())
                    .build();

            return chain.proceed(request);
        });
        httpClient.addInterceptor(interceptor);
        httpClient.addNetworkInterceptor(new StethoInterceptor());

        OkHttpClient client = httpClient.build();

        s_retrofit = new Retrofit.Builder()
                .baseUrl(REST_API_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(client)
                .build();
    }

    public static <T> T getService(Class<T> serviceClass) {
        return s_retrofit.create(serviceClass);
    }
}
