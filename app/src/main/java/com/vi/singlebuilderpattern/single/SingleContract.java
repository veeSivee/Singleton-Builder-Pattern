package com.vi.singlebuilderpattern.single;


/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public interface SingleContract {

    interface Presenter {

        void buttonSingletonClicked(String currentPid);

        void buttonNonSingletonClicked(String currentPid);

    }

    interface View {

        void setPresenter(Presenter presenter);

        void onGetPidSingletonSuccess(String pidClass);

        void onGetPidSingletonFailed(String message);

        void onGetPidNonSingletonSuccess(String pidClass);

        void onGetPidNonSingletonFailed(String message);
    }
}
