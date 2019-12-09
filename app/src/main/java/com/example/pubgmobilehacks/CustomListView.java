package com.example.pubgmobilehacks;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {

    private String[] hackname;
    private Integer[] hackpic;
    private Activity context;
    public CustomListView(Activity context,String[] hackname, Integer[] hackpic){
        super(context,R.layout.listactivity_layout, hackname);

        this.context= context;
        this.hackname=hackname;
        this.hackpic=hackpic;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder= null;
        if(r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listactivity_layout,null,true);
            viewHolder= new ViewHolder(r);
            r.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)r.getTag();
        }
        viewHolder.img1.setImageResource(hackpic[position]);
        viewHolder.tw1.setText(hackname[position]);

        return r;
    }

    public class ViewHolder{
        TextView tw1;
        ImageView img1;
        public  ViewHolder(View v){

            tw1= (TextView)v.findViewById(R.id.hackname);
            img1= (ImageView)v.findViewById(R.id.hackimage);

        }
    }
}
