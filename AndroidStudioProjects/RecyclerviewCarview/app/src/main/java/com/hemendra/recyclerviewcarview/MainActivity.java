package com.hemendra.recyclerviewcarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);

        ListData[] listData = new ListData[]{
                new ListData("Image1",R.drawable.img1),
                new ListData("Image2",R.drawable.img2),
                new ListData("Image3",R.drawable.img3),
                new ListData("Image4",R.drawable.img4),
                new ListData("Image5",R.drawable.img5),
                new ListData("Image6",R.drawable.img6),
                new ListData("Image7",R.drawable.img7),
                new ListData("Image8",R.drawable.img8),
                new ListData("Image9",R.drawable.img9),
                new ListData("Image10",R.drawable.img10),
           };
LinearLayoutManager gridLayoutManager = new LinearLayoutManager(this);
gridLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rv.setLayoutManager(gridLayoutManager);
        rv.setAdapter(new MyAdapter(listData));

    }
}