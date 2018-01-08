package org.o7planning.stackexchange.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.o7planning.stackexchange.R;

/**
 * Created by Custom on 14-Nov-17.
 */

public class ChoseAdapter extends ArrayAdapter<String> {
    Context mContext;
    String[] mArray;
    public ChoseAdapter(Context context,String[] Array) {
        super(context, R.layout.item_chose,Array);
        this.mArray = Array;
        this.mContext = context;
    }

    @Override
    public View getDropDownView(int position,
                                @Nullable View convertView,
                                @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_chose,null);
        }
        TextView tvItemchose = convertView.findViewById(R.id.itemChose_tvChose);
        tvItemchose.setText(mArray[position]);

        return convertView;
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater)
                    mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_chose,null);
        }
        TextView tvItemchose = convertView.findViewById(R.id.itemChose_tvChose);
        tvItemchose.setText(mArray[position]);

        return convertView;
    }
}
