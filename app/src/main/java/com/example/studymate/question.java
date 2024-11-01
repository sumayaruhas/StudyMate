package com.example.studymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class question extends AppCompatActivity {
    Button btnQuesDe;
    ListView listitem5,listitem6,listitem7,listitem8;
    Spinner s5,s6,s7,s8;
    ArrayList<String> ListValues5 = new ArrayList<>();
    ArrayList<String> spinItems5=new ArrayList<>();
    ArrayList<String> ListValues6 = new ArrayList<>();
    ArrayList<String> spinItems6=new ArrayList<>();
    ArrayList<String> ListValues7 = new ArrayList<>();
    ArrayList<String> spinItems7=new ArrayList<>();
    ArrayList<String> ListValues8 = new ArrayList<>();
    ArrayList<String> spinItems8=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question);
        listitem5=findViewById(R.id.list5);
        s5=findViewById(R.id.spin5);
        btnQuesDe=findViewById(R.id.questionPaiNakiDekhi);
        ListValues5.add("1");
        ListValues5.add("2");
        ListValues5.add("3");
        ListValues5.add("4");
        spinItems5.add("1");
        spinItems5.add("2");
        spinItems5.add("3");
        spinItems5.add("4");

        ArrayAdapter<String> adapter5=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues5);
        listitem5.setAdapter(adapter5);
        ArrayAdapter<String> spinAdapter5=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems5);
        s5.setAdapter(spinAdapter5);

        listitem6=findViewById(R.id.list6);
        s6=findViewById(R.id.spin6);
        ListValues6.add("1");
        ListValues6.add("2");
        ListValues6.add("3");
        ListValues6.add("4");
        ListValues6.add("5");
        ListValues6.add("6");
        ListValues6.add("7");
        ListValues6.add("8");

        spinItems6.add("1");
        spinItems6.add("2");
        spinItems6.add("3");
        spinItems6.add("4");
        spinItems6.add("5");
        spinItems6.add("6");
        spinItems6.add("7");
        spinItems6.add("8");

        ArrayAdapter<String> adapter6=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues6);
        listitem6.setAdapter(adapter6);
        ArrayAdapter<String> spinAdapter6=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems6);
        s6.setAdapter(spinAdapter6);

        listitem7=findViewById(R.id.list7);
        s7=findViewById(R.id.spin7);
        ListValues7.add("CSE");
        ListValues7.add("EEE");
        ListValues7.add("BBA");
        ListValues7.add("ENGLISH");
        ListValues7.add("ARABIC");
        ListValues7.add("BANGLA");
        ListValues7.add("BIOCHEMISTRY");
        ListValues7.add("HISTORY");

        spinItems7.add("CSE");
        spinItems7.add("EEE");
        spinItems7.add("BBA");
        spinItems7.add("ENGLISH");
        spinItems7.add("ARABIC");
        spinItems7.add("BANGLA");
        spinItems7.add("BIOCHEMISTRY");
        spinItems7.add("HISTORTY");

        ArrayAdapter<String> adapter7=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues7);
        listitem7.setAdapter(adapter7);
        ArrayAdapter<String> spinAdapter7=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems7);
        s7.setAdapter(spinAdapter7);

        listitem8=findViewById(R.id.list8);
        s8=findViewById(R.id.spin8);
        ListValues8.add("CSE-1");
        ListValues8.add("EEE-1");
        ListValues8.add("BBA-1");
        ListValues8.add("ENGLISH-1");
        ListValues8.add("ARABIC-1");
        ListValues8.add("BANGLA-1");
        ListValues8.add("BIOCHEMISTRY-1");
        ListValues8.add("HISTORY-1");

        spinItems8.add("CSE-1");
        spinItems8.add("EEE-1");
        spinItems8.add("BBA-1");
        spinItems8.add("ENGLISH1");
        spinItems8.add("ARABIC-1");
        spinItems8.add("BANGLA-1");
        spinItems8.add("BIOCHEMISTRY-1");
        spinItems8.add("HISTORTY-1");

        ArrayAdapter<String> adapter8=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ListValues8);
        listitem8.setAdapter(adapter8);
        ArrayAdapter<String> spinAdapter8=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinItems8);
        s8.setAdapter(spinAdapter8);

        btnQuesDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentQueslop=new Intent(getApplicationContext(), questionList.class);
                startActivity(IntentQueslop);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ques), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}