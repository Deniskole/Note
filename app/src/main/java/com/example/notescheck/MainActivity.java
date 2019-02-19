package com.example.notescheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    public static ArrayList<Note> notes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerViewNotes);

        if (notes.isEmpty()) {
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 2));
            notes.add(new Note("Зубной", "Молоко для  каши", "Пятница", 1));
            notes.add(new Note("Разобрать тему", "RecyclerView", "Пятница", 2));
            notes.add(new Note("Врач", "Молоко для  каши", "Пятница", 3));
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 2));
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 3));
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 1));
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 1));
            notes.add(new Note("Купить молоко", "Молоко для  каши", "Пятница", 2));
        }

        NoteAdapter adapter = new NoteAdapter(notes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);

    }

    public void onClickAddNote(View view) {

        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);

    }
}

