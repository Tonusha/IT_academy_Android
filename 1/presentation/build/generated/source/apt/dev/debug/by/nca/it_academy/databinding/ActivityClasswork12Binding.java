package by.nca.it_academy.databinding;
import by.nca.it_academy.R;
import by.nca.it_academy.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityClasswork12Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerView, 4);
    }
    // views
    @NonNull
    public final android.widget.TextView age;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    @NonNull
    public final android.support.v7.widget.RecyclerView recyclerView;
    @NonNull
    public final android.widget.TextView username;
    // variables
    @Nullable
    private by.nca.it_academy.presentation.screen.UserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClasswork12Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.age = (android.widget.TextView) bindings[2];
        this.age.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[4];
        this.username = (android.widget.TextView) bindings[1];
        this.username.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((by.nca.it_academy.presentation.screen.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable by.nca.it_academy.presentation.screen.UserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public by.nca.it_academy.presentation.screen.UserViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeViewModelUsername((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelProgressVisible((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAge(android.databinding.ObservableInt ViewModelAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(android.databinding.ObservableField<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProgressVisible(android.databinding.ObservableBoolean ViewModelProgressVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean viewModelProgressVisibleGet = false;
        int viewModelProgressVisibleViewVISIBLEViewGONE = 0;
        android.databinding.ObservableInt viewModelAge = null;
        java.lang.String stringValueOfViewModelAge = null;
        android.databinding.ObservableField<java.lang.String> viewModelUsername = null;
        android.databinding.ObservableBoolean viewModelProgressVisible = null;
        int viewModelAgeGet = 0;
        java.lang.String viewModelUsernameGet = null;
        by.nca.it_academy.presentation.screen.UserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.age
                        viewModelAge = viewModel.age;
                    }
                    updateRegistration(0, viewModelAge);


                    if (viewModelAge != null) {
                        // read viewModel.age.get()
                        viewModelAgeGet = viewModelAge.get();
                    }


                    // read String.valueOf(viewModel.age.get())
                    stringValueOfViewModelAge = java.lang.String.valueOf(viewModelAgeGet);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.username;
                    }
                    updateRegistration(1, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.get()
                        viewModelUsernameGet = viewModelUsername.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progressVisible
                        viewModelProgressVisible = viewModel.progressVisible;
                    }
                    updateRegistration(2, viewModelProgressVisible);


                    if (viewModelProgressVisible != null) {
                        // read viewModel.progressVisible.get()
                        viewModelProgressVisibleGet = viewModelProgressVisible.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(viewModelProgressVisibleGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
                    viewModelProgressVisibleViewVISIBLEViewGONE = ((viewModelProgressVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.age, stringValueOfViewModelAge);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelProgressVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.username, viewModelUsernameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityClasswork12Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork12Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityClasswork12Binding>inflate(inflater, by.nca.it_academy.R.layout.activity_classwork12, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityClasswork12Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork12Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(by.nca.it_academy.R.layout.activity_classwork12, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityClasswork12Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork12Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_classwork12_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityClasswork12Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.age
        flag 1 (0x2L): viewModel.username
        flag 2 (0x3L): viewModel.progressVisible
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.progressVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}