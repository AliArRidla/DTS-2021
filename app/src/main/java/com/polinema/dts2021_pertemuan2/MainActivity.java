package com.polinema.dts2021_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        untuk pertama akan langsung menjalankan onCreate dan onCreate akan akses main.xml nya
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        inisialisasi
        EditText editTextJari = findViewById(R.id.jari);
        TextView textViewKeliling = findViewById(R.id.textViewKeliling);
        TextView textViewLuas = findViewById(R.id.textViewLuas);
        Button buttonHitung = findViewById(R.id.buttonHitung);

//        aksi
        buttonHitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                convert
                float inoutJariJari = Float.parseFloat(editTextJari.getText().toString());

//                inisiasi & deklarasi rumus
                double keliling = inoutJariJari*2* Math.PI;
                double luas = Math.pow(inoutJariJari,2)* Math.PI;

//                set nilai
                textViewKeliling.setText(String.valueOf(keliling));
                textViewLuas.setText(String.valueOf(luas));
            }

        });

    }
}