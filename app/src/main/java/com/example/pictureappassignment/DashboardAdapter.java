package com.example.pictureappassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.ViewHolder> {
    private List<Dashboardtem> itemList;
    private Context context;

    public DashboardAdapter(Context context, List<Dashboardtem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Dashboardtem item = itemList.get(position);
        holder.itemText.setText(item.getTitle());
        holder.itemIcon.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemIcon;
        TextView itemText;

        public ViewHolder(View itemView) {
            super(itemView);
            itemIcon = itemView.findViewById(R.id.item_icon);
            itemText = itemView.findViewById(R.id.item_text);
        }
    }
}
