package com.example.studymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class notes extends AppCompatActivity {
        Button btnNijerUniNotes;
        ImageButton notes1,notes2,notes3,notes4;
ListView listitem1,listitem2,listitem3,listitem4;
Spinner s1,s2,s3,s4;
ArrayList<String> ListValues1 = new ArrayList<>();
ArrayList<String> spinItems1=new ArrayList<>();
    ArrayList<String> ListValues2 = new ArrayList<>();
    ArrayList<String> spinItems2=new ArrayList<>();
    ArrayList<String> ListValues3 = new ArrayList<>();
    ArrayList<String> spinItems3=new ArrayList<>();
    ArrayList<String> ListValues4 = new ArrayList<>();
    ArrayList<String> spinItems4=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notes);
        notes1=findViewById(R.id.noteshome);
        notes4=findViewById(R.id.notesprofile);
        listitem1=findViewById(R.id.list1);
        s1=findViewById(R.id.spin1);
        btnNijerUniNotes=findViewById(R.id.nijerUniNotes);
ListValues1.add("1");
        ListValues1.add("2");
        ListValues1.add("3");
        ListValues1.add("4");
        spinItems1.add("1");
        spinItems1.add("2");
        spinItems1.add("3");
        spinItems1.add("4");

        ArrayAdapter<String> adapter1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues1);
        listitem1.setAdapter(adapter1);
ArrayAdapter<String> spinAdapter1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems1);
s1.setAdapter(spinAdapter1);

        listitem2=findViewById(R.id.list2);
        s2=findViewById(R.id.spin2);
        ListValues2.add("1");
        ListValues2.add("2");
        ListValues2.add("3");
        ListValues2.add("4");
        ListValues2.add("5");
        ListValues2.add("6");
        ListValues2.add("7");
        ListValues2.add("8");

        spinItems2.add("1");
        spinItems2.add("2");
        spinItems2.add("3");
        spinItems2.add("4");
        spinItems2.add("5");
        spinItems2.add("6");
        spinItems2.add("7");
        spinItems2.add("8");

        ArrayAdapter<String> adapter2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues2);
        listitem2.setAdapter(adapter2);
        ArrayAdapter<String> spinAdapter2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems2);
        s2.setAdapter(spinAdapter2);

        listitem3=findViewById(R.id.list3);
        s3=findViewById(R.id.spin3);
        ListValues3.add("CSE");
        ListValues3.add("EEE");
        ListValues3.add("BBA");
        ListValues3.add("ENGLISH");
        ListValues3.add("ARABIC");
        ListValues3.add("BANGLA");
        ListValues3.add("BIOCHEMISTRY");
        ListValues3.add("HISTORY");

        spinItems3.add("CSE");
        spinItems3.add("EEE");
        spinItems3.add("BBA");
        spinItems3.add("ENGLISH");
        spinItems3.add("ARABIC");
        spinItems3.add("BANGLA");
        spinItems3.add("BIOCHEMISTRY");
        spinItems3.add("HISTORTY");

        ArrayAdapter<String> adapter3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues3);
        listitem3.setAdapter(adapter3);
        ArrayAdapter<String> spinAdapter3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems3);
        s3.setAdapter(spinAdapter3);

        listitem4=findViewById(R.id.list4);
        s4=findViewById(R.id.spin4);
        ListValues4.add("CSE-1");
        ListValues4.add("EEE-1");
        ListValues4.add("BBA-1");
        ListValues4.add("ENGLISH-1");
        ListValues4.add("ARABIC-1");
        ListValues4.add("BANGLA-1");
        ListValues4.add("BIOCHEMISTRY-1");
        ListValues4.add("HISTORY-1");

        spinItems4.add("CSE-1");
        spinItems4.add("EEE-1");
        spinItems4.add("BBA-1");
        spinItems4.add("ENGLISH1");
        spinItems4.add("ARABIC-1");
        spinItems4.add("BANGLA-1");
        spinItems4.add("BIOCHEMISTRY-1");
        spinItems4.add("HISTORTY-1");

        ArrayAdapter<String> adapter4=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues4);
        listitem4.setAdapter(adapter4);
        ArrayAdapter<String> spinAdapter4=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems4);
        s4.setAdapter(spinAdapter4);

        btnNijerUniNotes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent IntentNijerUni=new Intent(getApplicationContext(), noteslistryc.class);
                        startActivity(IntentNijerUni);
                }
        });
notes1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent nhome=new Intent(getApplicationContext(), homepage.class);
                startActivity(nhome);
        }
});
notes4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent nprofile = new Intent(getApplicationContext(), profile.class);
                startActivity(nprofile);
        }
});
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.notes), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}