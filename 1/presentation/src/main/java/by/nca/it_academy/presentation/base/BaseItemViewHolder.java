package by.nca.it_academy.presentation.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.android.databinding.library.baseAdapters.BR;

public abstract class BaseItemViewHolder<Model,
        ViewModel extends BaseItemViewModel,
        Binding extends ViewDataBinding> extends RecyclerView.ViewHolder{

    private Binding binding;
    private ViewModel viewModel;

    public BaseItemViewHolder(Binding binding, ViewModel viewModel) {
        super(binding.getRoot());
        this.binding = binding;
        this.viewModel = viewModel;
        this.viewModel.init();
        initViewModel();
    }

    public ViewModel getViewModel() {
        return viewModel;
    }

    protected void initViewModel() {
        binding.setVariable(BR.viewModel, viewModel);
    }

    public void bindTo(Model model, int position) {
        viewModel.setItem(model, position);
        binding.executePendingBindings();
    }

    public void release() {
        this.viewModel.release();
    }
}