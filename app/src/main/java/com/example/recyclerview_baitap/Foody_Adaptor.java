package com.example.recyclerview_baitap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Foody_Adaptor extends RecyclerView.Adapter<Foody_Adaptor.foodyholderview> {

    private ArrayList<class_foody> arrayList= new ArrayList<>();
    public Foody_Adaptor(ArrayList<class_foody> arrayList) {
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public foodyholderview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context;
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.unit_foody, null);
        return new foodyholderview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodyholderview holder, int position) {
      class_foody class_foody= arrayList.get(position);
      holder.image_holder_foody.setImageResource(class_foody.getImage_hinh_anh());
      holder.txt_holder_ten.setText(class_foody.getTxt_ten());
      holder.txt_holder_mota.setText(class_foody.getTxt_mota());
      holder.txt_holder_khuyenmai.setText(class_foody.getTxt_khuyenmai());
    }

    @Override
    public int getItemCount() {
        return arrayList!=null?arrayList.size():0;
    }

    class foodyholderview extends RecyclerView.ViewHolder
    {
        ImageView image_holder_foody;
        TextView  txt_holder_ten;
        TextView  txt_holder_mota;
        TextView  txt_holder_khuyenmai;
        public foodyholderview(@NonNull View itemView) {
            super(itemView);
            image_holder_foody= itemView.findViewById(R.id.imageview_hinhanh);
            txt_holder_ten= itemView.findViewById(R.id.textTensanpham);
            txt_holder_mota=itemView.findViewById(R.id.textMotasanpham);
            txt_holder_khuyenmai= itemView.findViewById(R.id.textkhuyenmai);
        }
    }
}
