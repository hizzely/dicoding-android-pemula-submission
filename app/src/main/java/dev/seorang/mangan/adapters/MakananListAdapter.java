package dev.seorang.mangan.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import dev.seorang.mangan.R;
import dev.seorang.mangan.models.Makanan;

public class MakananListAdapter extends RecyclerView.Adapter<MakananListAdapter.ListViewHolder> {

    public interface OnItemClickCallback {
        void onItemClicked(Makanan data);
    }
    private OnItemClickCallback onItemClickCallback;
    private ArrayList<Makanan> listMakanan;

    public MakananListAdapter(ArrayList<Makanan> makanan) {
        this.listMakanan = makanan;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Makanan makanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(makanan.getName());
        holder.tvOrigin.setText(makanan.getOrigin());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listMakanan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvOrigin;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvOrigin = itemView.findViewById(R.id.tv_item_origin);
        }
    }
}
