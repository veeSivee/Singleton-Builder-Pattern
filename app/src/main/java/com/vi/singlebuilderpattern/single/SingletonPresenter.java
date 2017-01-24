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
        SingletonClass singletonClass = SingletonClass.getInstance();
        
        if(isSingletonNull(singletonClass)){
            view.onGetPidSingletonFailed("Singleton is null");
        }else {
            currentPid = currentPid + "\n" + numberOfClick + ". " + singletonClass.hashCode();
            view.onGetPidSingletonSuccess(currentPid);
        }
    }

    @Override
    public void buttonNonSingletonClicked(String currentPid) {
        numberNonOfClick++;
        NonSingletonClass nonSingleton = NonSingletonClass.getInstance();

        if(isNonSingletonNull(nonSingleton)){
            view.onGetPidNonSingletonFailed("The class is null");
        }else {
            currentPid = currentPid + "\n" + numberNonOfClick + ". " + nonSingleton.hashCode();
            view.onGetPidNonSingletonSuccess(currentPid);
        }
    }

    private boolean isSingletonNull(SingletonClass singleton){
        return singleton==null;
    }

    private boolean isNonSingletonNull(NonSingletonClass nonSingleton){
        return nonSingleton==null;
    }

}
