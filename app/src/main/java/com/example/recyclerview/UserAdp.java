package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdp extends RecyclerView.Adapter<UserAdp.Holder> {

    Context context;
    List<User> list;

    public UserAdp(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public UserAdp.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view,parent,false);
        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        User user = list.get(position);

        holder.textView.setText(user.getName());
        holder.textView_desc.setText(user.getDesc());
        holder.checkImg.setImageResource(user.getCheckImg());
        holder.imageView.setImageResource(user.getImg());
        holder.textView_time.setText(user.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,next_screen.class);
                i.putExtra("user",user);

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {

        TextView textView,textView_desc,textView_time;
        ImageView imageView,checkImg;
        CardView card;

        public Holder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_data);
            textView_desc = itemView.findViewById(R.id.text_data_desc);
            textView_time = itemView.findViewById(R.id.time_text);
            imageView = itemView.findViewById(R.id.image_data);
            checkImg = itemView.findViewById(R.id.check_image);
        }
    }

}
