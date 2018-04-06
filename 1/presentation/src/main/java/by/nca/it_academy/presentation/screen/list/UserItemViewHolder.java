package by.nca.it_academy.presentation.screen.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.databinding.ItemUserBinding;
import by.nca.it_academy.presentation.base.BaseItemViewHolder;


public class UserItemViewHolder
        extends BaseItemViewHolder<UserEntity,
        UserItemViewModel, ItemUserBinding> {

    public UserItemViewHolder(ItemUserBinding binding, UserItemViewModel viewModel) {
        super(binding, viewModel);
    }

    public static UserItemViewHolder create(ViewGroup parent, UserItemViewModel viewModel) {

        ItemUserBinding bindind
                = ItemUserBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );

        return new UserItemViewHolder(bindind, viewModel);
    }
}
