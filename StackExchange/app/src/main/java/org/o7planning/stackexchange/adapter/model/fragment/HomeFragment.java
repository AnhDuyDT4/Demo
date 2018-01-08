package org.o7planning.stackexchange.adapter.model.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.model.base.BaseFragment;


public class HomeFragment extends BaseFragment {





    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        return view;
    }



}
