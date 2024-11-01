package com.example.studymate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class homepage extends AppCompatActivity {
Button btnnotes,btnalluni,btnca,btnques,btnprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
btnnotes=findViewById(R.id.uninotes);
btnalluni=findViewById(R.id.allnotes);
btnca=findViewById(R.id.campusAmb);
btnques=findViewById(R.id.uniQues);
btnprofile=findViewById(R.id.profile);

btnnotes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intentnotes= new Intent(getApplicationContext(), notes.class);
        startActivity(intentnotes);
    }
});

btnalluni.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intentallun=new Intent(getApplicationContext(), allUniNotes.class);
        startActivity(intentallun);
    }
});
btnca.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent camp=new Intent(getApplicationContext(), CA.class);
        startActivity(camp);
    }
});
btnques.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent quo=new Intent(getApplicationContext(), question.class);
        startActivity(quo);
    }
});
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.homepage), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentprofile=new Intent(getApplicationContext(), profile.class);
                startActivity(intentprofile);
            }
        });
    }
}