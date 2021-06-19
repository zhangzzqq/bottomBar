package com.demo.bottomnavigationviewdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

<<<<<<< HEAD
import com.demo.bottomnavigationviewdemo.BaseMVPLazyFragment;
=======
>>>>>>> 2d71208bbae5d7f53ca529f6f9a37ed96ac46038
import com.demo.bottomnavigationviewdemo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
<<<<<<< HEAD
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
=======
>>>>>>> 2d71208bbae5d7f53ca529f6f9a37ed96ac46038

/**
 * FileName:   HomeFragment
 * Author:     nizonglong
 * CreateTime: 2019/12/2 16:57
 */
<<<<<<< HEAD
public class HomeFragment extends BaseMVPLazyFragment {
=======
public class HomeFragment extends Fragment {
>>>>>>> 2d71208bbae5d7f53ca529f6f9a37ed96ac46038

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


<<<<<<< HEAD
    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment,
                                               @NonNull Lifecycle.State state) {
//        addOp(new Op(OP_SET_MAX_LIFECYCLE, fragment, state));
        return null;
    }


    @Override
    public void fetchData() {

    }
=======
>>>>>>> 2d71208bbae5d7f53ca529f6f9a37ed96ac46038
}
