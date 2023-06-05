package br.com.twoas.baseproject.presentation.presenters.impl;

import br.com.twoas.baseproject.domain.executor.Executor;
import br.com.twoas.baseproject.domain.executor.MainThread;
import br.com.twoas.baseproject.domain.interactors.SampleInteractor;
import br.com.twoas.baseproject.presentation.presenters.MainPresenter;
import br.com.twoas.baseproject.presentation.presenters.base.AbstractPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}
