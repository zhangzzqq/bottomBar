package com.demo.bottomnavigationviewdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.bottomnavigationviewdemo.BaseMVPLazyFragment;
import com.demo.bottomnavigationviewdemo.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;

/**
 * FileName:   HomeFragment
 * Author:     nizonglong
 * CreateTime: 2019/12/2 16:57
 */
public class HomeFragment extends BaseMVPLazyFragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment,
                                               @NonNull Lifecycle.State state) {
//        addOp(new Op(OP_SET_MAX_LIFECYCLE, fragment, state));
        return null;
    }


    @Override
    public void fetchData() {

    }
}
