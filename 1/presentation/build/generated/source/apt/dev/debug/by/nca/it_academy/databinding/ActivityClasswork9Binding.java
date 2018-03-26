package by.nca.it_academy.databinding;
import by.nca.it_academy.R;
import by.nca.it_academy.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityClasswork9Binding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.Button button1;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.widget.TextView textView2;
    // variables
    @Nullable
    private by.nca.it_academy.work.cw9.MyEntity mMyEntity;
    // values
    // listeners
    private OnClickListenerImpl mMyEntityButtonClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityClasswork9Binding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 3);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.button1 = (android.widget.Button) bindings[2];
        this.button1.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView2 = (android.widget.TextView) bindings[1];
        this.textView2.setTag(null);
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
        if (BR.myEntity == variableId) {
            setMyEntity((by.nca.it_academy.work.cw9.MyEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyEntity(@Nullable by.nca.it_academy.work.cw9.MyEntity MyEntity) {
        this.mMyEntity = MyEntity;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.myEntity);
        super.requestRebind();
    }
    @Nullable
    public by.nca.it_academy.work.cw9.MyEntity getMyEntity() {
        return mMyEntity;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMyEntityText((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMyEntityTextButton((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMyEntityButtonVisible((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMyEntityText(android.databinding.ObservableField<java.lang.String> MyEntityText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMyEntityTextButton(android.databinding.ObservableField<java.lang.String> MyEntityTextButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMyEntityButtonVisible(android.databinding.ObservableBoolean MyEntityButtonVisible, int fieldId) {
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
        android.view.View.OnClickListener myEntityButtonClickAndroidViewViewOnClickListener = null;
        int myEntityButtonVisibleViewVISIBLEViewGONE = 0;
        java.lang.String myEntityTextGet = null;
        android.databinding.ObservableField<java.lang.String> myEntityText = null;
        boolean myEntityButtonVisibleGet = false;
        by.nca.it_academy.work.cw9.MyEntity myEntity = mMyEntity;
        android.databinding.ObservableField<java.lang.String> myEntityTextButton = null;
        java.lang.String myEntityTextButtonGet = null;
        android.databinding.ObservableBoolean myEntityButtonVisible = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (myEntity != null) {
                        // read myEntity::buttonClick
                        myEntityButtonClickAndroidViewViewOnClickListener = (((mMyEntityButtonClickAndroidViewViewOnClickListener == null) ? (mMyEntityButtonClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mMyEntityButtonClickAndroidViewViewOnClickListener).setValue(myEntity));
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (myEntity != null) {
                        // read myEntity.text
                        myEntityText = myEntity.text;
                    }
                    updateRegistration(0, myEntityText);


                    if (myEntityText != null) {
                        // read myEntity.text.get()
                        myEntityTextGet = myEntityText.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (myEntity != null) {
                        // read myEntity.textButton
                        myEntityTextButton = myEntity.textButton;
                    }
                    updateRegistration(1, myEntityTextButton);


                    if (myEntityTextButton != null) {
                        // read myEntity.textButton.get()
                        myEntityTextButtonGet = myEntityTextButton.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (myEntity != null) {
                        // read myEntity.buttonVisible
                        myEntityButtonVisible = myEntity.buttonVisible;
                    }
                    updateRegistration(2, myEntityButtonVisible);


                    if (myEntityButtonVisible != null) {
                        // read myEntity.buttonVisible.get()
                        myEntityButtonVisibleGet = myEntityButtonVisible.get();
                    }
                if((dirtyFlags & 0x1cL) != 0) {
                    if(myEntityButtonVisibleGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read myEntity.buttonVisible.get() ? View.VISIBLE : View.GONE
                    myEntityButtonVisibleViewVISIBLEViewGONE = ((myEntityButtonVisibleGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.button1.setOnClickListener(myEntityButtonClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.button1.setVisibility(myEntityButtonVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.button1, myEntityTextButtonGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, myEntityTextGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private by.nca.it_academy.work.cw9.MyEntity value;
        public OnClickListenerImpl setValue(by.nca.it_academy.work.cw9.MyEntity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.buttonClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityClasswork9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityClasswork9Binding>inflate(inflater, by.nca.it_academy.R.layout.activity_classwork9, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityClasswork9Binding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork9Binding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(by.nca.it_academy.R.layout.activity_classwork9, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityClasswork9Binding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityClasswork9Binding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_classwork9_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityClasswork9Binding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): myEntity.text
        flag 1 (0x2L): myEntity.textButton
        flag 2 (0x3L): myEntity.buttonVisible
        flag 3 (0x4L): myEntity
        flag 4 (0x5L): null
        flag 5 (0x6L): myEntity.buttonVisible.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): myEntity.buttonVisible.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}