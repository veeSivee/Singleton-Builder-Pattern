package com.vi.singlebuilderpattern.main;

/**
 * Created by taufiqotulfaidah on 12/13/16.
 */

public interface MainContract {

    interface Presenter {

        void singleButtonClicked();

        void builderButtonClicked();

    }

    interface View {

        void setPresenter(Presenter presenter);

        void gotoSingleActivity();

        void gotoBuilderActivity();

    }
}
