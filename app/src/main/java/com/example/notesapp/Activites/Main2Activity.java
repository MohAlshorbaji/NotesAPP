package com.example.notesapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.notesapp.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String title = getIntent().getStringExtra("title");
        String Desc = getIntent().getStringExtra("Desc");
        String Category = getIntent().getStringExtra("Category");
        Log.i("our value ",title);
        Log.i("our value ",Desc);
        Toast.makeText(this, ""+title+Desc, Toast.LENGTH_SHORT).show();
    }
}
