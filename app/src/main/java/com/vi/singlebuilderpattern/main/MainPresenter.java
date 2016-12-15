package com.vi.singlebuilderpattern.main;

/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    public MainPresenter(MainContract.View view){
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void singleButtonClicked() {
        view.gotoSingleActivity();
    }

    @Override
    public void builderButtonClicked() {
        view.gotoBuilderActivity();
    }
}
