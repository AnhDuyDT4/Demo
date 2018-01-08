package org.o7planning.stackexchange.adapter;

import android.os.Bundle;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.base.BaseActivity;
import org.o7planning.stackexchange.adapter.fragment.Splastfragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callFragment(R.id.actMain_llContent, new Splastfragment());
    }


}
