package com.example.cps731lab4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> mTitles= new ArrayList<>();
    private ArrayList<String> mDescriptions = new ArrayList<>();
    private ArrayList<String> mImageURLs=new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context,ArrayList<String> titles, ArrayList<String> desc,ArrayList<String> imageURLs){
        mTitles=titles;
        mDescriptions=desc;
        mImageURLs=imageURLs;
        mContext=context;


    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d("test","ttt");
    holder.title.setText(mTitles.get(position));
    holder.description.setText(mDescriptions.get(position));
    holder.parentLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext,DetailActivity.class);

            intent.putExtra("item_title",mTitles.get(position));
            intent.putExtra("item_desc",mDescriptions.get(position));
            intent.putExtra("item_img",mImageURLs.get(position));
            mContext.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return mTitles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView description;
        LinearLayout parentLayout;
        public ViewHolder(View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.txtId);
            description=itemView.findViewById(R.id.txtDescription);
            parentLayout=itemView.findViewById(R.id.prLayout);

        }

    }
}
