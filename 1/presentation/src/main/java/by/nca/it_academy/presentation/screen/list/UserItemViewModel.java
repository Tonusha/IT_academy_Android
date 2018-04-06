package by.nca.it_academy.presentation.screen.list;

import android.databinding.ObservableField;

import by.nca.data.entity.User;
import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.presentation.base.BaseItemViewModel;

public class UserItemViewModel extends BaseItemViewModel<UserEntity>{

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> age = new ObservableField<>("");

    @Override
    public void setItem(UserEntity user, int position) {
        name.set(user.getUsername());
        age.set(String.valueOf(user.getAge()));
    }
}
