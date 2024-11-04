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

public class CA extends AppCompatActivity {
ImageButton caib1,caib2,caib3,caib4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ca);
        caib1=findViewById(R.id.ca_home);
        caib4=findViewById(R.id.ca_profile);
        caib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newcaib1=new Intent(getApplicationContext(), homepage.class);
                startActivity(newcaib1);
            }
        });
        caib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newcaib4= new Intent(getApplicationContext(), profile.class);
                startActivity(newcaib4);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ca), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}