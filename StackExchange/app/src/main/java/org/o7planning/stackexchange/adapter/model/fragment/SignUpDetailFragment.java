package org.o7planning.stackexchange.adapter.model.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.model.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SignUpDetailFragment extends BaseFragment {

    @BindView(R.id.frag_imgBack)
    ImageView imgBack;
    @BindView(R.id.fragSignUpDentail_btnCreate)
    Button btnCreate;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_signup_detail,container,false);
         ButterKnife.bind(this,view);
         return view;
    }
    @OnClick({R.id.fragSignUpDentail_btnCreate,R.id.frag_imgBack})
    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.fragSignUpDentail_btnCreate:
                Toast.makeText(getActivity().getApplicationContext(),"You are create account",Toast.LENGTH_SHORT).show();

                break;
            case  R.id.frag_imgBack:
                callback();
                break;
        }
    }
}
