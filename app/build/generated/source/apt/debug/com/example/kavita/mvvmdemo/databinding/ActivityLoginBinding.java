package com.example.kavita.mvvmdemo.databinding;
import com.example.kavita.mvvmdemo.R;
import com.example.kavita.mvvmdemo.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBinding extends android.databinding.ViewDataBinding  {

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
    public final android.widget.Button cancelBtn;
    @NonNull
    public final android.support.constraint.ConstraintLayout constraintLayout;
    @NonNull
    public final android.widget.EditText editTextPassword;
    @NonNull
    public final android.widget.EditText editTextUserName;
    @NonNull
    public final android.widget.Button loginBtn;
    // variables
    @Nullable
    private com.example.kavita.mvvmdemo.login.LoginViewModel mLoginViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.password
            //         is loginViewModel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPassword);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.password
            java.lang.String loginViewModelPassword = null;
            // loginViewModel
            com.example.kavita.mvvmdemo.login.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {




                loginViewModel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener editTextUserNameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.userName
            //         is loginViewModel.setUserName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTextUserName);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel
            com.example.kavita.mvvmdemo.login.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.userName
            java.lang.String loginViewModelUserName = null;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {




                loginViewModel.setUserName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.cancelBtn = (android.widget.Button) bindings[4];
        this.cancelBtn.setTag(null);
        this.constraintLayout = (android.support.constraint.ConstraintLayout) bindings[0];
        this.constraintLayout.setTag(null);
        this.editTextPassword = (android.widget.EditText) bindings[2];
        this.editTextPassword.setTag(null);
        this.editTextUserName = (android.widget.EditText) bindings[1];
        this.editTextUserName.setTag(null);
        this.loginBtn = (android.widget.Button) bindings[3];
        this.loginBtn.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.example.kavita.mvvmdemo.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.example.kavita.mvvmdemo.login.LoginViewModel LoginViewModel) {
        updateRegistration(0, LoginViewModel);
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.example.kavita.mvvmdemo.login.LoginViewModel getLoginViewModel() {
        return mLoginViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModel((com.example.kavita.mvvmdemo.login.LoginViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModel(com.example.kavita.mvvmdemo.login.LoginViewModel LoginViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.userName) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
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
        java.lang.String loginViewModelUserName = null;
        android.view.View.OnClickListener loginViewModelOnLoginClicked = null;
        com.example.kavita.mvvmdemo.login.LoginViewModel loginViewModel = mLoginViewModel;
        java.lang.String loginViewModelPassword = null;
        android.view.View.OnClickListener loginViewModelOnCancelClicked = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.userName
                        loginViewModelUserName = loginViewModel.getUserName();
                    }
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.onLoginClicked()
                        loginViewModelOnLoginClicked = loginViewModel.onLoginClicked();
                        // read loginViewModel.onCancelClicked()
                        loginViewModelOnCancelClicked = loginViewModel.onCancelClicked();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.password
                        loginViewModelPassword = loginViewModel.getPassword();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.cancelBtn.setOnClickListener(loginViewModelOnCancelClicked);
            this.loginBtn.setOnClickListener(loginViewModelOnLoginClicked);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPassword, loginViewModelPassword);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPasswordandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextUserName, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextUserNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTextUserName, loginViewModelUserName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityLoginBinding>inflate(inflater, com.example.kavita.mvvmdemo.R.layout.activity_login, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.kavita.mvvmdemo.R.layout.activity_login, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityLoginBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_login_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityLoginBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): loginViewModel
        flag 1 (0x2L): loginViewModel.userName
        flag 2 (0x3L): loginViewModel.password
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}