package com.androidsources.recyclergridview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Gowtham Chandrasekar on 31-07-2015.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView wonderName;
    public ImageView wonderImage;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        //implementing onClickListener
        itemView.setOnClickListener(this);
        wonderName = (TextView)itemView.findViewById(R.id.wonder_name);
        wonderImage = (ImageView)itemView.findViewById(R.id.wonder_image);
    }

    @Override
    public void onClick(View view) {
        //Every time you click on the row toast is displayed
        Toast.makeText(view.getContext(),  "This is "+wonderName.getText(), Toast.LENGTH_LONG).show();
    }
}