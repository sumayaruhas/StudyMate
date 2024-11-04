package com.example.studymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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
ImageButton nList1,nList2,nList3,nList4;
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

        nList1=findViewById(R.id.notesList_home);
        nList4=findViewById(R.id.notesList_profile);

        nList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nListHome= new Intent(getApplicationContext(), homepage.class);
                startActivity(nListHome);
            }
        });
        nList4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nListProfile = new Intent(getApplicationContext(), profile.class);
                startActivity(nListProfile);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notsrylist), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}