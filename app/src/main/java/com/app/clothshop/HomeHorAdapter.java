//IM/2020/022 - started
package com.app.clothshop;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel>list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check){
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.m_w_pullover1, "Pullover","4.9","25$","White"));
            homeVerModels.add(new HomeVerModel(R.drawable.w_o_blouse2, "Blouse","5.0","30$","Orange"));
            homeVerModels.add(new HomeVerModel(R.drawable.m_b_pullover2, "Pullover","5.0","15$","Brown"));
            homeVerModels.add(new HomeVerModel(R.drawable.w_w_blouse1, "Blouse","4.9","15$","White"));
            homeVerModels.add(new HomeVerModel(R.drawable.k_w_cloth, "Top","5.0","15$","White"));
            homeVerModels.add(new HomeVerModel(R.drawable.m_b_shirts1, "shirt","4.5","20$","Blue"));
            homeVerModels.add(new HomeVerModel(R.drawable.m_r_shirts5, "shirt","4.8","22$","Red"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.m_w_pullover1, "Pullover","4.9","25$","White"));                        homeVerModels.add(new HomeVerModel(R.drawable.women_1, "cloth1","5.0","25$","Green"));
                        homeVerModels.add(new HomeVerModel(R.drawable.m_b_pullover2, "Pullover","5.0","15$","Brown"));
                        homeVerModels.add(new HomeVerModel(R.drawable.m_b_shirts1, "shirt","4.5","20$","Blue"));
                        homeVerModels.add(new HomeVerModel(R.drawable.m_r_shirts5, "shirt","4.8","22$","Red"));
                        homeVerModels.add(new HomeVerModel(R.drawable.m_w_tshirt5, "T-shirt","4.4","15$","White"));
                        homeVerModels.add(new HomeVerModel(R.drawable.m_b_tshirt3, "T-shirt","4.8","20$","Blue"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.w_w_blouse1, "Blouse","4.9","15$","White"));
                        homeVerModels.add(new HomeVerModel(R.drawable.w_o_blouse2, "Blouse","5.0","30$","Orange"));
                        homeVerModels.add(new HomeVerModel(R.drawable.w_g_dress2, "Dress","4.5","20$","Green"));
                        homeVerModels.add(new HomeVerModel(R.drawable.w_w_dress1, "Dress","4.8","22$","White"));
                        homeVerModels.add(new HomeVerModel(R.drawable.w_b_tshirt, "T-shirt","4.4","15$","Blue"));
                        homeVerModels.add(new HomeVerModel(R.drawable.w_r_tshirt4, "T-shirt","4.8","20$","Red"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.k_w_cloth, "Top","5.0","15$","White"));
                        homeVerModels.add(new HomeVerModel(R.drawable.k_b_ful, "Full Set","4.8","15$","Brown"));
                        homeVerModels.add(new HomeVerModel(R.drawable.k_g_full, "Full Set","4.5","20$","Green"));
                        homeVerModels.add(new HomeVerModel(R.drawable.k_b_full, "Full Set","4.8","22$","Blue"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.s_b_full, "Full Set","5.0","25$","Blue"));
                        homeVerModels.add(new HomeVerModel(R.drawable.s_b_top, "Top","5.0","25$","Black"));
                        homeVerModels.add(new HomeVerModel(R.drawable.s_g_short, "Short","5.0","25$","Green"));
                        homeVerModels.add(new HomeVerModel(R.drawable.s_y_full, "Full Set","5.0","25$","Yellow"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select =false;
                }
            }else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView name;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
//IM/2020/022 - ended