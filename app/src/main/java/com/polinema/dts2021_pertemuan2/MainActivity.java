package com.polinema.dts2021_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    deklarasi
    EditText editTextNilai1;
    EditText editTextNilai2;
    TextView textViewHasil;
    Button buttonHitung;
    int nilai1,nilai2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        untuk pertama akan langsung menjalankan onCreate dan onCreate akan akses main.xml nya
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        inisialisasi
        editTextNilai1 = findViewById(R.id.editTextNilai1);
        editTextNilai2 = findViewById(R.id.editTextNilai2);
        textViewHasil = findViewById(R.id.textViewHasil);
        buttonHitung = findViewById(R.id.buttonHitung);

//        aksi

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                bandingkan
                if (nilai1 > nilai2){
                    System.out.println("lebih besar nilai 1");
                    textViewHasil.setText("Lebih besar nilai 1");
                }else {
                    System.out.println("lebih besar nilai 2");
                    textViewHasil.setText("Lebih besar nilai 2");
                }
            }
        });
    }
}