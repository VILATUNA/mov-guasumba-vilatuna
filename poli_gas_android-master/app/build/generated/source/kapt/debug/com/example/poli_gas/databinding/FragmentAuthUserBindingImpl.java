package com.example.poli_gas.databinding;
import com.example.poli_gas.R;
import com.example.poli_gas.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAuthUserBindingImpl extends FragmentAuthUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutHead, 1);
        sViewsWithIds.put(R.id.image_view, 2);
        sViewsWithIds.put(R.id.edit_text_name, 3);
        sViewsWithIds.put(R.id.progressbar_pic, 4);
        sViewsWithIds.put(R.id.layoutPhone, 5);
        sViewsWithIds.put(R.id.ccp, 6);
        sViewsWithIds.put(R.id.edit_text_phone, 7);
        sViewsWithIds.put(R.id.button_send_verification, 8);
        sViewsWithIds.put(R.id.layoutVerification, 9);
        sViewsWithIds.put(R.id.progressbar, 10);
        sViewsWithIds.put(R.id.edit_text_code, 11);
        sViewsWithIds.put(R.id.button_verify, 12);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAuthUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentAuthUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[12]
            , (com.hbb20.CountryCodePicker) bindings[6]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[10]
            , (android.widget.ProgressBar) bindings[4]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}