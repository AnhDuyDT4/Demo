package org.o7planning.stackexchange.adapter.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginFragment extends BaseFragment {

    @BindView(R.id.actionbar_tvName)
    TextView tvName;
    @BindView(R.id.frag_imgBack)
    ImageView imgBack;

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        ButterKnife.bind(this,view);
        tvName.setText(R.string.log_in_sttBar);
        return view;
    }
    @OnClick(R.id.frag_imgBack)
    public void imgBackOnClick(){
        callback();
    }


}
