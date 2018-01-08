package org.o7planning.stackexchange.adapter.model.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.model.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SignUpFragment extends BaseFragment {

    public static String VALUE = "<html>By signing up , you agree to the <a href=\"https://www.google.com\">Privacy policy</a> and <a href=\"https://www.facebook.com\">terms of service</a>.";

    @BindView(R.id.frag_llSignupDetail)
    LinearLayout llSignupDetail;
    @BindView(R.id.fragSignUp_tvLink)
    TextView tvLink;
    @BindView(R.id.frag_imgBack)
    ImageView imgBack;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup,container,false);
        ButterKnife.bind(this,view);
        getTextLink();
        return view;
    }
    @OnClick({R.id.frag_llSignupDetail,R.id.frag_imgBack})
    public void OnClick(View view){
        switch (view.getId())
        {
            case R.id.frag_llSignupDetail:
                SignUpDetailFragment signUpDetailFragment = new SignUpDetailFragment();
                callFragment(R.id.actMain_llContent,signUpDetailFragment);
                break;
            case  R.id.frag_imgBack:
                callback();
                break;
        }
    }


    @SuppressLint("ResourceAsColor")
    private void getTextLink(){
        tvLink.setText(Html.fromHtml(VALUE));
        tvLink.setMovementMethod(LinkMovementMethod.getInstance());
        tvLink.setLinkTextColor(R.color.link);
        tvLink.setLinksClickable(true);

    }

}
