package by.nca.it_academy.databinding;
import by.nca.it_academy.R;
import by.nca.it_academy.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomework9Binding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    // variables
    @Nullable
    private by.nca.it_academy.work.hw9.MyUser mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomework9Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 6);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.user == variableId) {
            setUser((by.nca.it_academy.work.hw9.MyUser) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable by.nca.it_academy.work.hw9.MyUser User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    @Nullable
    public by.nca.it_academy.work.hw9.MyUser getUser() {
        return mUser;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserFatherName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeUserImageUrl((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeUserFirstName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeUserAge((android.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeUserLastName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeUserSex((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserFatherName(android.databinding.ObservableField<java.lang.String> UserFatherName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserImageUrl(android.databinding.ObservableField<java.lang.String> UserImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserFirstName(android.databinding.ObservableField<java.lang.String> UserFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserAge(android.databinding.ObservableInt UserAge, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserLastName(android.databinding.ObservableField<java.lang.String> UserLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserSex(android.databinding.ObservableBoolean UserSex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        android.databinding.ObservableField<java.lang.String> userFatherName = null;
        java.lang.String userImageUrlGet = null;
        java.lang.String userLastNameGet = null;
        java.lang.String userFirstNameJavaLangObjectNullJavaLangStringUserFirstName = null;
        android.databinding.ObservableField<java.lang.String> userImageUrl = null;
        boolean userSexGet = false;
        int userAgeGet = 0;
        java.lang.String javaLangStringUserSexJavaLangStringMaleJavaLangStringFemale = null;
        android.databinding.ObservableField<java.lang.String> userFirstName = null;
        java.lang.String userFatherNameJavaLangObjectNullJavaLangStringUserFatherName = null;
        android.databinding.ObservableInt userAge = null;
        by.nca.it_academy.work.hw9.MyUser user = mUser;
        java.lang.String userFirstNameGet = null;
        java.lang.String userLastNameJavaLangObjectNullJavaLangStringUserLastName = null;
        boolean userLastNameJavaLangObjectNull = false;
        boolean userFatherNameJavaLangObjectNull = false;
        java.lang.String javaLangStringUserAge = null;
        boolean userFirstNameJavaLangObjectNull = false;
        java.lang.String userFatherNameGet = null;
        android.databinding.ObservableField<java.lang.String> userLastName = null;
        android.databinding.ObservableBoolean userSex = null;
        java.lang.String userSexJavaLangStringMaleJavaLangStringFemale = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (user != null) {
                        // read user.fatherName
                        userFatherName = user.fatherName;
                    }
                    updateRegistration(0, userFatherName);


                    if (userFatherName != null) {
                        // read user.fatherName.get()
                        userFatherNameGet = userFatherName.get();
                    }


                    // read user.fatherName.get() == null
                    userFatherNameJavaLangObjectNull = (userFatherNameGet) == (null);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(userFatherNameJavaLangObjectNull) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (user != null) {
                        // read user.imageUrl
                        userImageUrl = user.imageUrl;
                    }
                    updateRegistration(1, userImageUrl);


                    if (userImageUrl != null) {
                        // read user.imageUrl.get()
                        userImageUrlGet = userImageUrl.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (user != null) {
                        // read user.firstName
                        userFirstName = user.firstName;
                    }
                    updateRegistration(2, userFirstName);


                    if (userFirstName != null) {
                        // read user.firstName.get()
                        userFirstNameGet = userFirstName.get();
                    }


                    // read user.firstName.get() == null
                    userFirstNameJavaLangObjectNull = (userFirstNameGet) == (null);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(userFirstNameJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (user != null) {
                        // read user.age
                        userAge = user.age;
                    }
                    updateRegistration(3, userAge);


                    if (userAge != null) {
                        // read user.age.get()
                        userAgeGet = userAge.get();
                    }


                    // read ("Возраст: ") + (user.age.get())
                    javaLangStringUserAge = ("Возраст: ") + (userAgeGet);
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (user != null) {
                        // read user.lastName
                        userLastName = user.lastName;
                    }
                    updateRegistration(4, userLastName);


                    if (userLastName != null) {
                        // read user.lastName.get()
                        userLastNameGet = userLastName.get();
                    }


                    // read user.lastName.get() == null
                    userLastNameJavaLangObjectNull = (userLastNameGet) == (null);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(userLastNameJavaLangObjectNull) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (user != null) {
                        // read user.sex
                        userSex = user.sex;
                    }
                    updateRegistration(5, userSex);


                    if (userSex != null) {
                        // read user.sex.get()
                        userSexGet = userSex.get();
                    }
                if((dirtyFlags & 0xe0L) != 0) {
                    if(userSexGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read user.sex.get() ? "Male" : "Female"
                    userSexJavaLangStringMaleJavaLangStringFemale = ((userSexGet) ? ("Male") : ("Female"));


                    // read ("Пол: ") + (user.sex.get() ? "Male" : "Female")
                    javaLangStringUserSexJavaLangStringMaleJavaLangStringFemale = ("Пол: ") + (userSexJavaLangStringMaleJavaLangStringFemale);
            }
        }
        // batch finished

        if ((dirtyFlags & 0xc4L) != 0) {

                // read user.firstName.get() == null ? "---" : user.firstName.get()
                userFirstNameJavaLangObjectNullJavaLangStringUserFirstName = ((userFirstNameJavaLangObjectNull) ? ("---") : (userFirstNameGet));
        }
        if ((dirtyFlags & 0xc1L) != 0) {

                // read user.fatherName.get() == null ? "---" : user.fatherName.get()
                userFatherNameJavaLangObjectNullJavaLangStringUserFatherName = ((userFatherNameJavaLangObjectNull) ? ("---") : (userFatherNameGet));
        }
        if ((dirtyFlags & 0xd0L) != 0) {

                // read user.lastName.get() == null ? "---" : user.lastName.get()
                userLastNameJavaLangObjectNullJavaLangStringUserLastName = ((userLastNameJavaLangObjectNull) ? ("---") : (userLastNameGet));
        }
        // batch finished
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userFirstNameJavaLangObjectNullJavaLangStringUserFirstName);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userLastNameJavaLangObjectNullJavaLangStringUserLastName);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userFatherNameJavaLangObjectNullJavaLangStringUserFatherName);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringUserAge);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, javaLangStringUserSexJavaLangStringMaleJavaLangStringFemale);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            by.nca.it_academy.work.hw9.MyUser.loadImage(this.mboundView6, userImageUrlGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityHomework9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomework9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHomework9Binding>inflate(inflater, by.nca.it_academy.R.layout.activity_homework9, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHomework9Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomework9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(by.nca.it_academy.R.layout.activity_homework9, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHomework9Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHomework9Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_homework9_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHomework9Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user.fatherName
        flag 1 (0x2L): user.imageUrl
        flag 2 (0x3L): user.firstName
        flag 3 (0x4L): user.age
        flag 4 (0x5L): user.lastName
        flag 5 (0x6L): user.sex
        flag 6 (0x7L): user
        flag 7 (0x8L): null
        flag 8 (0x9L): user.firstName.get() == null ? "---" : user.firstName.get()
        flag 9 (0xaL): user.firstName.get() == null ? "---" : user.firstName.get()
        flag 10 (0xbL): user.fatherName.get() == null ? "---" : user.fatherName.get()
        flag 11 (0xcL): user.fatherName.get() == null ? "---" : user.fatherName.get()
        flag 12 (0xdL): user.lastName.get() == null ? "---" : user.lastName.get()
        flag 13 (0xeL): user.lastName.get() == null ? "---" : user.lastName.get()
        flag 14 (0xfL): user.sex.get() ? "Male" : "Female"
        flag 15 (0x10L): user.sex.get() ? "Male" : "Female"
    flag mapping end*/
    //end
}