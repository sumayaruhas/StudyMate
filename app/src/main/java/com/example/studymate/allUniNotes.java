package com.example.studymate;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class allUniNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_all_uni_notes);

        AutoCompleteTextView auti;

        auti=findViewById(R.id.allUniNames);

        ArrayList<String> UniList=new ArrayList<>();
        UniList.add("International Islamic University Chittagong");
        UniList.add("Dhaka University");
        UniList.add("Chittagong University");
        UniList.add("Khula University");
        UniList.add("Chittagong University of Engineering and Technology");
        UniList.add("Bangladesh University of Engineering and Technology");
        UniList.add("Khulna University of Engineering and Technology");
        UniList.add("Rajshahi University of Engineering and Technology");
        UniList.add("BRAC University");
        UniList.add("North South University");
        UniList.add("Premier University");
        ArrayAdapter<String> arrayAdapterAllUni = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,UniList);
        auti.setAdapter(arrayAdapterAllUni);
        auti.setThreshold(3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.allUniNotes), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}