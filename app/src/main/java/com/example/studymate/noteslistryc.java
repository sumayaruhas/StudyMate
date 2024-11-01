package com.example.studymate;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class noteslistryc extends AppCompatActivity {
private RecyclerView notesRecyclerView;
private NotesAdapter notesAdapter;
private List<String> notesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_noteslistryc);
        notesRecyclerView = findViewById(R.id.notesKhujidekh);
        notesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        notesList = new ArrayList<>();
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesList.add("CSE-1123");
        notesAdapter = new NotesAdapter(notesList);
        notesRecyclerView.setAdapter(notesAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        notesRecyclerView.addItemDecoration(dividerItemDecoration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notsrylist), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}