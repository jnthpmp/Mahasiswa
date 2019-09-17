package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity implements MahasiswaFragment.kirim, TampiFragment.Send {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
ubah();

    }
    public void tampil(){
    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    TampiFragment tmpFragment = new TampiFragment();
        ft.replace(R.id.frameMain,tmpFragment);
        ft.commit();}
        public void ubah() {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            MahasiswaFragment mhsFragment = new MahasiswaFragment();
            ft.replace(R.id.frameMain, mhsFragment);
            ft.commit();
        }
}
