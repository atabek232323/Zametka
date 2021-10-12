package com.example.zametka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private RecyclerView recyclerViewNotes;
 public static final ArrayList<Note>notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);

      NotesAdapter adapter = new NotesAdapter(notes);
      recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
     // recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
     // recyclerViewNotes.setLayoutManager(new GridLayoutManager(this,2));
      recyclerViewNotes.setAdapter(adapter);
    }

    public void onClickView(View view) {
        Intent intent = new Intent(this,AddNoteActivity.class);
        startActivity(intent);
    }
}