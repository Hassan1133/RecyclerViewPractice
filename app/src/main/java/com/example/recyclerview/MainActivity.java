package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<User> list;
    UserAdp adp;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
        listData();

    }

    void init()
    {
        recyclerView =  findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    void listData()
    {
        list = new ArrayList<User>();

        User user1 = new User("Hassan","Bhai Kya Hal hai",R.drawable.hassan,R.drawable.check,"10.50 pm");
        User user2 = new User("Ali","Me lahore ja rha hn",R.drawable.mans,R.drawable.check,"Yesterday");
        User user3 = new User("Idrees","I am Sleeping",R.drawable.man,R.drawable.check,"11.30 pm");
        User user4 = new User("Nimra","Where are you??",R.drawable.woman,R.drawable.check,"8.10 am");
        User user5 = new User("Hussain","Bhai Kya Hal hai",R.drawable.hassan,R.drawable.check,"Yesterday");
        User user6 = new User("Junaid","Me lahore ja rha hn",R.drawable.mans,R.drawable.check,"Yesterday");
        User user7 = new User("Ahmad","I am Sleeping",R.drawable.man,R.drawable.check,"1.00 pm");
        User user8 = new User("Amna","Where are you??",R.drawable.woman,R.drawable.check,"4.50 pm");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user5);

        adp = new UserAdp(this,list);
        recyclerView.setAdapter(adp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.tool_bar,menu);
        return true;
    }
}