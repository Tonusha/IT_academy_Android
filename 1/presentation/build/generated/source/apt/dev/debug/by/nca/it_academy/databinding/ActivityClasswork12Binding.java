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
        sViewsWithIds.put(R.id.progressBar, 7);
    }
    // views
    @NonNull
    public final android.widget.TextView age;
    @NonNull
    public final android.widget.TextView fatherName;
    @NonNull
    public final android.widget.TextView firstName;
    @NonNull
    public final android.widget.ImageView imageUrl;
    @NonNull
    public final android.widget.TextView isMan;
    @NonNull
    public final android.widget.TextView lastName;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    // variables
    @Nullable
    private by.nca.it_academy.presentation.screen.UserViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityClasswork12Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 7);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.age = (android.widget.TextView) bindings[4];
        this.age.setTag(null);
        this.fatherName = (android.widget.TextView) bindings[3];
        this.fatherName.setTag(null);
        this.firstName = (android.widget.TextView) bindings[1];
        this.firstName.setTag(null);
        this.imageUrl = (android.widget.ImageView) bindings[6];
        this.imageUrl.setTag(null);
        this.isMan = (android.widget.TextView) bindings[5];
        this.isMan.setTag(null);
        this.lastName = (android.widget.TextView) bindings[2];
        this.lastName.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar = (android.widget.ProgressBar) bindings[7];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            mDirtyFlags |= 0x80L;
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
                return onChangeViewModelLastName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAge((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelFirstName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelBackground((android.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeViewModelIsMan((android.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeViewModelFatherName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelImageUrl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLastName(android.databinding.ObservableField<java.lang.String> ViewModelLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAge(android.databinding.ObservableInt ViewModelAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstName(android.databinding.ObservableField<java.lang.String> ViewModelFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBackground(android.databinding.ObservableInt ViewModelBackground, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsMan(android.databinding.ObservableBoolean ViewModelIsMan, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFatherName(android.databinding.ObservableField<java.lang.String> ViewModelFatherName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(android.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.String viewModelLastNameGet = null;
        java.lang.String viewModelFatherNameJavaLangObjectNullJavaLangStringViewModelFatherName = null;
        boolean viewModelLastNameJavaLangObjectNull = false;
        boolean viewModelIsManGet = false;
        java.lang.String viewModelFatherNameGet = null;
        java.lang.String viewModelLastNameJavaLangObjectNullJavaLangStringViewModelLastName = null;
        java.lang.String viewModelFirstNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelLastName = null;
        android.databinding.ObservableInt viewModelAge = null;
        java.lang.String javaLangStringStringValueOfViewModelAge = null;
        java.lang.String stringValueOfViewModelAge = null;
        android.databinding.ObservableField<java.lang.String> viewModelFirstName = null;
        boolean viewModelFatherNameJavaLangObjectNull = false;
        java.lang.String viewModelIsManJavaLangStringJavaLangString = null;
        int viewModelAgeGet = 0;
        int viewModelBackgroundGet = 0;
        android.databinding.ObservableInt viewModelBackground = null;
        java.lang.String viewModelFirstNameJavaLangObjectNullJavaLangStringViewModelFirstName = null;
        android.databinding.ObservableBoolean viewModelIsMan = null;
        boolean viewModelFirstNameJavaLangObjectNull = false;
        android.databinding.ObservableField<java.lang.String> viewModelFatherName = null;
        java.lang.String viewModelImageUrlGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        java.lang.String javaLangStringViewModelIsManJavaLangStringJavaLangString = null;
        by.nca.it_academy.presentation.screen.UserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.lastName
                        viewModelLastName = viewModel.lastName;
                    }
                    updateRegistration(0, viewModelLastName);


                    if (viewModelLastName != null) {
                        // read viewModel.lastName.get()
                        viewModelLastNameGet = viewModelLastName.get();
                    }


                    // read viewModel.lastName.get() == null
                    viewModelLastNameJavaLangObjectNull = (viewModelLastNameGet) == (null);
                if((dirtyFlags & 0x181L) != 0) {
                    if(viewModelLastNameJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.age
                        viewModelAge = viewModel.age;
                    }
                    updateRegistration(1, viewModelAge);


                    if (viewModelAge != null) {
                        // read viewModel.age.get()
                        viewModelAgeGet = viewModelAge.get();
                    }


                    // read String.valueOf(viewModel.age.get())
                    stringValueOfViewModelAge = java.lang.String.valueOf(viewModelAgeGet);


                    // read ("Возраст: ") + (String.valueOf(viewModel.age.get()))
                    javaLangStringStringValueOfViewModelAge = ("Возраст: ") + (stringValueOfViewModelAge);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstName
                        viewModelFirstName = viewModel.firstName;
                    }
                    updateRegistration(2, viewModelFirstName);


                    if (viewModelFirstName != null) {
                        // read viewModel.firstName.get()
                        viewModelFirstNameGet = viewModelFirstName.get();
                    }


                    // read viewModel.firstName.get() == null
                    viewModelFirstNameJavaLangObjectNull = (viewModelFirstNameGet) == (null);
                if((dirtyFlags & 0x184L) != 0) {
                    if(viewModelFirstNameJavaLangObjectNull) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.background
                        viewModelBackground = viewModel.background;
                    }
                    updateRegistration(3, viewModelBackground);


                    if (viewModelBackground != null) {
                        // read viewModel.background.get()
                        viewModelBackgroundGet = viewModelBackground.get();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isMan
                        viewModelIsMan = viewModel.isMan;
                    }
                    updateRegistration(4, viewModelIsMan);


                    if (viewModelIsMan != null) {
                        // read viewModel.isMan.get()
                        viewModelIsManGet = viewModelIsMan.get();
                    }
                if((dirtyFlags & 0x190L) != 0) {
                    if(viewModelIsManGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isMan.get() ? "Мужик" : "Женщина"
                    viewModelIsManJavaLangStringJavaLangString = ((viewModelIsManGet) ? ("Мужик") : ("Женщина"));


                    // read ("Пол: ") + (viewModel.isMan.get() ? "Мужик" : "Женщина")
                    javaLangStringViewModelIsManJavaLangStringJavaLangString = ("Пол: ") + (viewModelIsManJavaLangStringJavaLangString);
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fatherName
                        viewModelFatherName = viewModel.fatherName;
                    }
                    updateRegistration(5, viewModelFatherName);


                    if (viewModelFatherName != null) {
                        // read viewModel.fatherName.get()
                        viewModelFatherNameGet = viewModelFatherName.get();
                    }


                    // read viewModel.fatherName.get() == null
                    viewModelFatherNameJavaLangObjectNull = (viewModelFatherNameGet) == (null);
                if((dirtyFlags & 0x1a0L) != 0) {
                    if(viewModelFatherNameJavaLangObjectNull) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.imageUrl;
                    }
                    updateRegistration(6, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1a0L) != 0) {

                // read viewModel.fatherName.get() == null ? "---" : viewModel.fatherName.get()
                viewModelFatherNameJavaLangObjectNullJavaLangStringViewModelFatherName = ((viewModelFatherNameJavaLangObjectNull) ? ("---") : (viewModelFatherNameGet));
        }
        if ((dirtyFlags & 0x181L) != 0) {

                // read viewModel.lastName.get() == null ? "---" : viewModel.lastName.get()
                viewModelLastNameJavaLangObjectNullJavaLangStringViewModelLastName = ((viewModelLastNameJavaLangObjectNull) ? ("---") : (viewModelLastNameGet));
        }
        if ((dirtyFlags & 0x184L) != 0) {

                // read viewModel.firstName.get() == null ? "---" : viewModel.firstName.get()
                viewModelFirstNameJavaLangObjectNullJavaLangStringViewModelFirstName = ((viewModelFirstNameJavaLangObjectNull) ? ("---") : (viewModelFirstNameGet));
        }
        // batch finished
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.age, javaLangStringStringValueOfViewModelAge);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.fatherName, viewModelFatherNameJavaLangObjectNullJavaLangStringViewModelFatherName);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.firstName, viewModelFirstNameJavaLangObjectNullJavaLangStringViewModelFirstName);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            by.nca.it_academy.work.hw9.MyUser.loadImage(this.imageUrl, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.isMan, javaLangStringViewModelIsManJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.lastName, viewModelLastNameJavaLangObjectNullJavaLangStringViewModelLastName);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, android.databinding.adapters.Converters.convertColorToDrawable(viewModelBackgroundGet));
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
        flag 0 (0x1L): viewModel.lastName
        flag 1 (0x2L): viewModel.age
        flag 2 (0x3L): viewModel.firstName
        flag 3 (0x4L): viewModel.background
        flag 4 (0x5L): viewModel.isMan
        flag 5 (0x6L): viewModel.fatherName
        flag 6 (0x7L): viewModel.imageUrl
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): viewModel.fatherName.get() == null ? "---" : viewModel.fatherName.get()
        flag 10 (0xbL): viewModel.fatherName.get() == null ? "---" : viewModel.fatherName.get()
        flag 11 (0xcL): viewModel.lastName.get() == null ? "---" : viewModel.lastName.get()
        flag 12 (0xdL): viewModel.lastName.get() == null ? "---" : viewModel.lastName.get()
        flag 13 (0xeL): viewModel.isMan.get() ? "Мужик" : "Женщина"
        flag 14 (0xfL): viewModel.isMan.get() ? "Мужик" : "Женщина"
        flag 15 (0x10L): viewModel.firstName.get() == null ? "---" : viewModel.firstName.get()
        flag 16 (0x11L): viewModel.firstName.get() == null ? "---" : viewModel.firstName.get()
    flag mapping end*/
    //end
}