package org.o7planning.stackexchange.adapter.base;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


@SuppressLint("ValidFragment")
public class BaseFragment extends Fragment {

    public void callFragment(int content, Fragment fragmentgo) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null);
        fragmentTransaction.replace(content,fragmentgo ).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
    }
    public void callback(){
        getActivity().getSupportFragmentManager().popBackStack();
    }
}
