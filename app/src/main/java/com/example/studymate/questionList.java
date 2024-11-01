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

public class questionList extends AppCompatActivity {
    private RecyclerView quesRecyclerView;
    private QuestionsAdapter quesAdapter;
    private List<String> quesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question_list);
        quesRecyclerView = findViewById(R.id.quesKhuj);
        quesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        quesList = new ArrayList<>();
        quesList.add("autum");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesList.add("CSE-1123");
        quesAdapter = new QuestionsAdapter(quesList);
        quesRecyclerView.setAdapter(quesAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        quesRecyclerView.addItemDecoration(dividerItemDecoration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.quesxml), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}