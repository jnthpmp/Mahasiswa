package com.example.mahasiswa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tahuBulat = findViewById(R.id.btnMhs);
        tahuBulat.setOnClickListener(btnTahuBulat);

        Button btnlist = findViewById(R.id.btnList);
        btnlist.setOnClickListener(List1);
    }
    private  View.OnClickListener btnTahuBulat = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener List1 = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,ListActivity.class);
            startActivity(intent);
        }
    };



}
