package by.nca.it_academy.presentation.screen.list;

import android.view.ViewGroup;

import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.presentation.base.BaseAdapter;
import by.nca.it_academy.presentation.base.BaseItemViewHolder;


public class UserAdapter extends BaseAdapter<UserEntity, UserItemViewModel> {

    @Override
    public UserItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return UserItemViewHolder.create(parent, new UserItemViewModel());
    }
}
