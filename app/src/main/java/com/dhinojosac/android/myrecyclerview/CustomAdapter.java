package com.dhinojosac.android.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhinojosac.android.myrecyclerview.model.RowData;

import java.util.ArrayList;

/**
 * Created by negro-PC on 21-Dec-16.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {

    private ArrayList<RowData> rowDataArrayList;
    private RecyclerItemClickListener recyclerItemClickListener;

    public void setRecyclerItemClickListener(RecyclerItemClickListener recyclerItemClickListener) {
        this.recyclerItemClickListener = recyclerItemClickListener;
    }

    public CustomAdapter() {
    }

    public CustomAdapter(ArrayList<RowData> rowDataArrayList) {
        this.rowDataArrayList = rowDataArrayList;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
        final RowData rowData = rowDataArrayList.get(position);
        holder.title.setText(rowData.getTextRow());
        //holder.imageView.setImageResource(rowData.getImageRow());
    }

    @Override
    public int getItemCount() {
        return rowDataArrayList.size();
    }

    public class CustomHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView imageView;

        public CustomHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.txtv_row_item);
            imageView = (ImageView) itemView.findViewById(R.id.img_row_item);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            if (recyclerItemClickListener != null) {
                recyclerItemClickListener.onItemClickListener(getAdapterPosition());
            }

        }
    }


}
