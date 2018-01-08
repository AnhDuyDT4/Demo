package org.o7planning.stackexchange.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.o7planning.stackexchange.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Custom on 15-Nov-17.
 */

public class MenuItemHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.itemMenu_imgIcon)
    ImageView mImg;
    @BindView(R.id.itemMenu_imgName)
    TextView  mName;
    public MenuItemHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
