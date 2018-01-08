package org.o7planning.stackexchange.adapter.model.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.o7planning.stackexchange.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Custom on 15-Nov-17.
 */

public class CustomSpinnerAdapter extends ArrayAdapter<String> {


    TextView tvTitle;
    private List<String> data = new ArrayList<>();
    private LayoutInflater inflater;

    public CustomSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        data = objects;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        View row = inflater.inflate(R.layout.item_chose, parent, false);
        TextView tvCategory = row.findViewById(R.id.itemChose_tvChose);
        tvCategory.setText(data.get(position).toString());
        return row;
    }

}
