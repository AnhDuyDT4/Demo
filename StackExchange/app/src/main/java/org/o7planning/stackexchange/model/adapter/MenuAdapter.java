package org.o7planning.stackexchange.model.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import org.o7planning.stackexchange.R;
import org.o7planning.stackexchange.model.model.MenuModel;

import java.util.ArrayList;

/**
 * Created by Custom on 15-Nov-17.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuItemHolder>{

    Context context;
    ArrayList<MenuModel> arrayList;

    public MenuAdapter(Context context, ArrayList<MenuModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public MenuItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                                  .inflate(R.layout.item_menu_home,null);
        MenuItemHolder menuItemHolder = new MenuItemHolder(view);
        return menuItemHolder;
    }

    @Override
    public void onBindViewHolder(MenuItemHolder holder, int position) {
        MenuModel menuModel = arrayList.get(position);
        Picasso.with(context).load(menuModel.getmImg())
                .placeholder(R.drawable.nav_help).into(holder.mImg);
        holder.mName.setText(menuModel.getmName());
    }

    @Override
    public int getItemCount() {

        if(arrayList==null)
            return 0;
        return arrayList.size();
    }
}
