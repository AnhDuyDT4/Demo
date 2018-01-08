package org.o7planning.stackexchange.adapter.model.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.model.HomeStackExchangeActivity;
import org.o7planning.stackexchange.adapter.model.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Splastfragment extends BaseFragment {


    @BindView(R.id.actMain_btnLogin)
    TextView btnLogin;
    @BindView(R.id.actMain_btnSignUP)
    TextView btnSignUp;
    @BindView(R.id.actMain_tvStartUsing)
    TextView tvStaUsing;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splast,container,false);
        ButterKnife.bind(this,view);
        btnLogin.setBackgroundResource(R.drawable.radius_button_clicked);
        btnSignUp.setBackgroundResource(R.drawable.radius_button_clicked);
        return view;
    }


    @OnClick({R.id.actMain_btnLogin,R.id.actMain_btnSignUP,R.id.actMain_tvStartUsing})
    public void btnLoginOnClick(View view){
        switch (view.getId()){
            case R.id.actMain_btnLogin:
                callFragment(R.id.actMain_llContent,new LoginFragment());
                break;
            case R.id.actMain_btnSignUP:
                callFragment(R.id.actMain_llContent,new SignUpFragment());
                break;
            case R.id.actMain_tvStartUsing:
                getActivity().startActivity(new Intent(getActivity(),HomeStackExchangeActivity.class));

        }

    }


}

