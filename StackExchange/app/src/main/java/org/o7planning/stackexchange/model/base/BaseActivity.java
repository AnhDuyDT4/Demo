package org.o7planning.stackexchange.model.base;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {
    public void callFragment(int content, Fragment fragment) {
        this.getSupportFragmentManager().beginTransaction().replace(content,
                fragment, fragment.getClass().getSimpleName()).commit();
    }
}
