package by.nca.it_academy.presentation.screen.usermvp;

import by.nca.it_academy.presentation.base.BasePresenter;
import by.nca.it_academy.work.cw6.UserAdapter;


public abstract class UserPresenter extends BasePresenter<UserView, UserRouter>{

    public abstract void onUserClic();
    public abstract UserAdapter getUserAdapter();

}
