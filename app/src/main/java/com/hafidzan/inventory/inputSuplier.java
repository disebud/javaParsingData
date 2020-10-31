package com.hafidzan.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inputSuplier extends AppCompatActivity {

    Button btnKirimDataSup;
    EditText etKodeSup,etNamaSup,etKontakSup,etAlamatSup;
    String kodeSup,namaSup,kontakSup,alamatSup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_suplier);


            btnKirimDataSup = (Button) findViewById(R.id.btn_kirimData_sup);
            etKodeSup       = (EditText) findViewById(R.id.et_kode_sup);
            etNamaSup      = (EditText) findViewById(R.id.et_nama_sup);
            etKontakSup      = (EditText) findViewById(R.id.et_kontak);
            etAlamatSup      = (EditText) findViewById(R.id.et_alamat);

            btnKirimDataSup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kodeSup = etKodeSup.getText().toString();
                    namaSup = etNamaSup.getText().toString();
                    kontakSup = etKontakSup.getText().toString();
                    alamatSup = etAlamatSup.getText().toString();

                    Intent i = new Intent(inputSuplier.this,outputSuplier.class);

                    if(kodeSup.equals("") || namaSup.equals("") || kontakSup.equals("") || alamatSup.equals("") ){
                        Toast.makeText(inputSuplier.this, " Tidak boleh kosong !", Toast.LENGTH_LONG).show();
                    }else{
                        i.putExtra("kodeSup",kodeSup);
                        i.putExtra("namaSup",namaSup);
                        i.putExtra("kontakSup",kontakSup);
                        i.putExtra("alamatSup",alamatSup);
                        startActivity(i);
                    }


                }
            });
        }
}