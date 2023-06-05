package br.com.twoas.baseproject.presentation.ui.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import br.com.twoas.baseproject.R;
import br.com.twoas.baseproject.presentation.presenters.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }
}
