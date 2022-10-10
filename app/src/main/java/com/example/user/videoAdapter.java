package com.example.user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class videoAdapter extends RecyclerView.Adapter<videoAdapter.videoViewHolder> {

    private List<video> listvideo;

    public videoAdapter(List<video> listvideo) {
        this.listvideo = listvideo;
    }

    @NonNull
    @Override
    public videoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent,false);
        return new videoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull videoViewHolder holder, int position) {
        video video= listvideo.get(position);
        if(video== null){
            return;
        }
        holder.image.setImageResource(video.getImage());
        holder.name.setText(video.getName());
        holder.video.setImageResource(video.getVideo());
        holder.title.setText(video.getTitle());
    }

    @Override
    public int getItemCount() {
        if(listvideo != null){
            return  listvideo.size();
        }
        return 0;
    }


    public class  videoViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private ImageView video;
        private TextView name;
        private TextView title;

        public videoViewHolder(@NonNull View itemView) {
            super(itemView);

            image =itemView.findViewById(R.id.logo_video);
            video=itemView.findViewById(R.id.idvideo);
            name=itemView.findViewById(R.id.txtnamevideo);
            title=itemView.findViewById(R.id.txttitle);
        }
    }
}
