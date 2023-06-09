package br.com.twoas.baseproject.domain.interactors.impl;

import br.com.twoas.baseproject.domain.executor.Executor;
import br.com.twoas.baseproject.domain.executor.MainThread;
import br.com.twoas.baseproject.domain.interactors.SampleInteractor;
import br.com.twoas.baseproject.domain.interactors.base.AbstractInteractor;
import br.com.twoas.baseproject.domain.repository.UserRepository;

/**
 * This is an interactor boilerplate with a reference to a model repository.
 * <p/>
 */
public class SampleInteractorImpl extends AbstractInteractor implements SampleInteractor {

    private SampleInteractor.Callback mCallback;
    private UserRepository mRepository;

    public SampleInteractorImpl(Executor threadExecutor,
                                MainThread mainThread,
                                Callback callback, UserRepository repository) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mRepository = repository;
    }

    @Override
    public void run() {
        // TODO: Implement this with your business logic
    }
}
