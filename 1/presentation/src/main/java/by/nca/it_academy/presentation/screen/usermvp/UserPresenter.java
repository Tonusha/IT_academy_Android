package by.nca.it_academy.presentation.screen.usermvp;

import by.nca.it_academy.presentation.base.BasePresenter;


public abstract class UserPresenter extends BasePresenter<UserView, UserRouter>{

    public abstract void onUserClic();
    public abstract by.nca.it_academy.presentation.screen.list.UserAdapter getUserAdapter();

}
