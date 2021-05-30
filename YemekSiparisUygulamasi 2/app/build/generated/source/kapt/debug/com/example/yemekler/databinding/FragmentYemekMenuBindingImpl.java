package com.example.yemekler.databinding;
import com.example.yemekler.R;
import com.example.yemekler.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentYemekMenuBindingImpl extends FragmentYemekMenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentYemekMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentYemekMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            );
        this.ConstraitLayout.setTag(null);
        this.RecyclerViewYemek.setTag(null);
        this.toolbarMenu.setTag(null);
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
        if (BR.yemekFragment == variableId) {
            setYemekFragment((com.example.yemekler.fragment.YemekMenuFragment) variable);
        }
        else if (BR.Toolbar == variableId) {
            setToolbar((java.lang.String) variable);
        }
        else if (BR.YemekAdapter == variableId) {
            setYemekAdapter((com.example.yemekler.adapter.YemekAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setYemekFragment(@Nullable com.example.yemekler.fragment.YemekMenuFragment YemekFragment) {
        this.mYemekFragment = YemekFragment;
    }
    public void setToolbar(@Nullable java.lang.String Toolbar) {
        this.mToolbar = Toolbar;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.Toolbar);
        super.requestRebind();
    }
    public void setYemekAdapter(@Nullable com.example.yemekler.adapter.YemekAdapter YemekAdapter) {
        this.mYemekAdapter = YemekAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.YemekAdapter);
        super.requestRebind();
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
        java.lang.String toolbar = mToolbar;
        com.example.yemekler.adapter.YemekAdapter yemekAdapter = mYemekAdapter;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.RecyclerViewYemek.setAdapter(yemekAdapter);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.toolbarMenu.setTitle(toolbar);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): yemekFragment
        flag 1 (0x2L): Toolbar
        flag 2 (0x3L): YemekAdapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}