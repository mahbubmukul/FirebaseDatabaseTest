package com.ct.mukul.firebasedatabasetest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by csa on 3/6/2017.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyHolder>{

    List<User> listdata;

    public RecyclerviewAdapter(List<User> listdata) {
        this.listdata = listdata;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_parent,parent,false);

        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }


    public void onBindViewHolder(MyHolder holder, int position) {
        User data = listdata.get(position);
        holder.vname.setText(data.getName());
        holder.vemail.setText(data.getEmail());
        holder.vaddress.setText(data.getAddress());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{
               TextView vname , vaddress,vemail;

        public MyHolder(View itemView) {
            super(itemView);
             vname = (TextView) itemView.findViewById(R.id.name);
             vemail = (TextView) itemView.findViewById(R.id.email);
             vaddress = (TextView) itemView.findViewById(R.id.address);

        }
    }


}
