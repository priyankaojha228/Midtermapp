package com.example.appmidterm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    MyHomeDataAdapter myHomeAdapter;
    private List<MyHomeData> myHomeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myHomeData = new ArrayList<MyHomeData>();
        myHomeData.add(new MyHomeData("Task 1"));
        myHomeData.add(new MyHomeData("Task 2"));
        myHomeData.add(new MyHomeData("Task 3"));
        myHomeData.add(new MyHomeData("Task 4"));
        myHomeData.add(new MyHomeData("Task 5"));
        myHomeAdapter = new MyHomeDataAdapter(myHomeData,this);
        recyclerView.setAdapter(myHomeAdapter);
    }
}

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}*/