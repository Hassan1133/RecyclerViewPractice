package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class next_screen extends AppCompatActivity {


    TextView name,msg;
    ImageView image;

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);

        name = findViewById(R.id.imported_name);
        msg = findViewById(R.id.imported_msg);
        image = findViewById(R.id.imported_image);

//       Bundle intent = getIntent().getExtras();
//        name.setText(intent.getString("name"));
//        msg.setText(intent.getString("msg"));
//        image.setImageResource(intent.getInt("image"));

        user = (User) getIntent().getSerializableExtra("user");
        name.setText(user.getName());
        msg.setText(user.getDesc());
        image.setImageResource(user.getImg());
    }
}