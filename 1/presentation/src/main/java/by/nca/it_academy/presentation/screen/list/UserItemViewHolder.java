package by.nca.it_academy.presentation.screen.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.databinding.ItemUserBinding;
import by.nca.it_academy.presentation.base.BaseItemViewHolder;


public class UserItemViewHolder extends BaseItemViewHolder<UserEntity,
        UserItemViewModel,
        ItemUserBinding> {

    public UserItemViewHolder(ItemUserBinding buinding, UserItemViewModel viewModel) {
        super(buinding, viewModel);
    }

    public static UserItemViewHolder create(ViewGroup parent, UserItemViewModel viewModel){
        ItemUserBinding binding = ItemUserBinding.inflate(
                LayoutInflater.from(parent.getContext()),parent,false);
        new UserItemViewModel();

        return new UserItemViewHolder(binding, viewModel);
    }
}
