package com.alldi.a20190427_practice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.alldi.a20190427_practice.R;
import com.alldi.a20190427_practice.datas.PizzaStore;
import com.bumptech.glide.Glide;

import java.util.List;

public class PizzaStoreAdapter extends ArrayAdapter<PizzaStore>{

    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;

    public PizzaStoreAdapter(Context context, List<PizzaStore> list){

        super(context, R.layout.pizza_spinner_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.pizza_spinner_item, null);
        }

        PizzaStore storeData = mList.get(position);

        ImageView logoImgView = row.findViewById(R.id.logoImgView);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Glide.with(mContext).load(storeData.imageURL).into(logoImgView);

        nameTxt.setText(storeData.storeName);
        return row;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.pizza_spinner_list_item, null);
        }

        PizzaStore storeData = mList.get(position);

        ImageView pizzaImageView = row.findViewById(R.id.pizzaImageView);
        TextView pizzaStoreNameTxt = row.findViewById(R.id.pizzaStoreNameTxt);
        TextView pizzaLocationTxt = row.findViewById(R.id.pizzaLocationTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);

        Glide.with(mContext).load(storeData.imageURL).into(pizzaImageView);

        pizzaStoreNameTxt.setText(storeData.storeName);
        pizzaLocationTxt.setText(String.format("(%s)",storeData.location));
        openTimeTxt.setText(String.format("영업시간 - %s",storeData.openTime));

        return row;

    }
}
