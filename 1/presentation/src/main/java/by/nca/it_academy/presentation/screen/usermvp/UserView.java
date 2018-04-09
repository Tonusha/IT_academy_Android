package by.nca.it_academy.presentation.screen.usermvp;

import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.presentation.base.BaseView;

/**
 * Created by user on 09.04.2018.
 */

public interface UserView extends BaseView {

    void showUser(UserEntity userEntity);
}
