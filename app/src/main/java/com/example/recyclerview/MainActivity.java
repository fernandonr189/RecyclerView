package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Notes> notes;
    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notes = getAllNotes();
        recyclerView = findViewById(R.id.Rcycler);
        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        adapter = new Adapter(R.layout.recycler_item, notes, new Adapter.OnItemClickListener() {
            @Override
            public void OnItemClick(String name, int position) {
                Toast.makeText(MainActivity.this, "El nombre es: " + name, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
    public ArrayList<Notes> getAllNotes() {
        return new ArrayList<Notes>() {{
            add(new Notes("Manuel Alejandro Rico Navarro es mi compa es bien buen pedo ese wey", "Juan es una persona"));
            add(new Notes("Pinche jorge me cagas la neta ctm", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
            add(new Notes("Juan", "Juan es una persona"));
        }};
    }
}