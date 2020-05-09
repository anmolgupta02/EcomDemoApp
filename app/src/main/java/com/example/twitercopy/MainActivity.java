package com.example.twitercopy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ProductList> arrayList = new ArrayList<>();

        arrayList.add(new ProductList(R.drawable.black_shoe,"Adidas Black Shoe","Addidas","₹ 40000/-"));
        arrayList.add(new ProductList(R.drawable.ear_phones,"Samsung Ear Phone","Samsung","₹ 400/-"));
        arrayList.add(new ProductList(R.drawable.plant,"Decoration Plant","Decoration","₹ 40/-"));
        arrayList.add(new ProductList(R.drawable.shoe_blue,"Adidas Blue Shoe","Addidas","₹ 50000/-"));
        arrayList.add(new ProductList(R.drawable.smart_watch,"Apple Smart Watch","Apple","₹ 45000/-"));
        arrayList.add(new ProductList(R.drawable.spoons,"Cattery Spoons","Spoons","₹ 4000/-"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new ProductAdapter(arrayList);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
