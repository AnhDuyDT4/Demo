package org.o7planning.stackexchange.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.adapter.base.BaseActivity;
import org.o7planning.stackexchange.adapter.fragment.HomeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;

public class HomeStackExchangeActivity extends BaseActivity {

    @BindView(R.id.actbarHome_imgMenuBar)
    ImageView imgMenu;
    @BindView(R.id.fragHome_drDrawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.actbarHome_spChose)
    ImageView spChose;
    @BindView(R.id.actbarHome_rlTitle)
    RelativeLayout rlTitle;
    @BindView(R.id.actbarHome_llActionBar)
    LinearLayout llActionBar;
    @BindView(R.id.actbarHome_tvChose)
    TextView tvChose;
    @BindView(R.id.actbarSearch_etSearch)
    EditText etSearch;

    private List<String> mList = new ArrayList<>();
    private org.o7planning.stackexchange.adapter.adapter.CustomSpinnerAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_stack_exchange);
        ButterKnife.bind(this);
        //load();
        callFragment(R.id.actHome_frContent, new HomeFragment());
    }
    @OnClick({R.id.actbarHome_imgMenuBar,R.id.actbarHome_rlTitle})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.actbarHome_imgMenuBar:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.actbarHome_rlTitle:
                load();
        }
    }
    @OnFocusChange
    public void onFocusChange(View arg0, boolean gotfocus)
    {
        // TODO Auto-generated method stub
        if(gotfocus)
        {
            etSearch.setCompoundDrawables(null, null, null, null);
        }
        else if(!gotfocus)
        {
            if(etSearch.getText().length()==0)
                etSearch.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_menu_search, 0, 0, 0);
        }
    }

    private void load(){

        Context wrapper = new ContextThemeWrapper(getApplicationContext(), R.style.PopupMenu);
        PopupMenu popupMenu = new PopupMenu(wrapper,tvChose);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup_item_chose, popupMenu.getMenu());
        popupMenu.show();
    }


}
