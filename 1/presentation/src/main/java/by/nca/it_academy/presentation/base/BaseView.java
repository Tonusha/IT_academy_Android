package by.nca.it_academy.presentation.base;

/**
 * Created by user on 09.04.2018.
 */

public interface BaseView {

    void showProgress();
    void dismissProgress();
    void showError(Exception e);


}
