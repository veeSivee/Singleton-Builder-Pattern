package com.vi.singlebuilderpattern.single;

/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public class SingletonPresenter implements SingleContract.Presenter {

    private SingleContract.View view;
    private int numberOfClick = 0;
    private int numberNonOfClick = 0;

    public SingletonPresenter(SingleContract.View view){
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void buttonSingletonClicked(String currentPid) {
        numberOfClick++;
        currentPid = currentPid + "\n" + numberOfClick + ". " + SingletonClass.getInstance().hashCode();
        view.onGetPidSingletonSuccess(currentPid);
    }

    @Override
    public void buttonNonSingletonClicked(String currentPid) {
        numberNonOfClick++;
        currentPid = currentPid + "\n" + numberNonOfClick + ". " + NonSingletonClass.getInstance().hashCode();
        view.onGetPidNonSingletonSuccess(currentPid);

    }
}
