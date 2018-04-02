package by.nca.it_academy.presentation.screen.list;

import android.view.ViewGroup;

import com.nca.domain.entity.UserEntity;
import com.nca.presentation.base.BaseAdapter;
import com.nca.presentation.base.BaseItemViewHolder;

/**
 * Created by user on 02.04.2018.
 */

public class UserAdapter extends BaseAdapter<UserEntity, UserItemViewModel{

    @Override
    public BaseItemViewHolder<UserEntity, UserItemViewModel, ?> onCreateViewHolder(ViewGroup parent, int viewType) {

        return UserItemViewHolder.create(parent, new UserItemViewModel());
    }
}
