package com.example.poli_gas.databinding;
import com.example.poli_gas.R;
import com.example.poli_gas.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.example.poli_gas.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.carousel, 4);
        sViewsWithIds.put(R.id.textView7, 5);
        sViewsWithIds.put(R.id.make_order_button, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.jama.carouselview.CarouselView) bindings[4]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.decreaseButton.setTag(null);
        this.increaseButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.quantityText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.poli_gas.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.poli_gas.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.homeViewModel == variableId) {
            setHomeViewModel((com.example.poli_gas.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeViewModel(@Nullable com.example.poli_gas.home.HomeViewModel HomeViewModel) {
        this.mHomeViewModel = HomeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.homeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeViewModelQuantityCilynders((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeViewModelQuantityCilynders(androidx.lifecycle.LiveData<java.lang.String> HomeViewModelQuantityCilynders, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.example.poli_gas.home.HomeViewModel homeViewModel = mHomeViewModel;
        androidx.lifecycle.LiveData<java.lang.String> homeViewModelQuantityCilynders = null;
        java.lang.String homeViewModelQuantityCilyndersGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (homeViewModel != null) {
                    // read homeViewModel.quantity_cilynders
                    homeViewModelQuantityCilynders = homeViewModel.getQuantity_cilynders();
                }
                updateLiveDataRegistration(0, homeViewModelQuantityCilynders);


                if (homeViewModelQuantityCilynders != null) {
                    // read homeViewModel.quantity_cilynders.getValue()
                    homeViewModelQuantityCilyndersGetValue = homeViewModelQuantityCilynders.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.decreaseButton.setOnClickListener(mCallback3);
            this.increaseButton.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.quantityText, homeViewModelQuantityCilyndersGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // homeViewModel != null
                boolean homeViewModelJavaLangObjectNull = false;
                // homeViewModel
                com.example.poli_gas.home.HomeViewModel homeViewModel = mHomeViewModel;



                homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
                if (homeViewModelJavaLangObjectNull) {


                    homeViewModel.decreaseQuantity();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // homeViewModel != null
                boolean homeViewModelJavaLangObjectNull = false;
                // homeViewModel
                com.example.poli_gas.home.HomeViewModel homeViewModel = mHomeViewModel;



                homeViewModelJavaLangObjectNull = (homeViewModel) != (null);
                if (homeViewModelJavaLangObjectNull) {


                    homeViewModel.increaseQuantity();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeViewModel.quantity_cilynders
        flag 1 (0x2L): homeViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}