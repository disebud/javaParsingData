package com.hafidzan.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inputBarang extends AppCompatActivity {

    Button btnKirimData;
    EditText etKodeBrg,etNamaBrg,etHargaBrg,etStokBrg;
    String kodeBrg,namaBrg,hargaBrg,stokBrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_barang);


        btnKirimData = (Button) findViewById(R.id.btn_kirimData);
        etKodeBrg       = (EditText) findViewById(R.id.et_kode_brg);
        etNamaBrg      = (EditText) findViewById(R.id.et_nama_brg);
        etHargaBrg      = (EditText) findViewById(R.id.et_harga);
        etStokBrg      = (EditText) findViewById(R.id.et_stok);

        btnKirimData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kodeBrg = etKodeBrg.getText().toString();
                namaBrg = etNamaBrg.getText().toString();
                hargaBrg = etHargaBrg.getText().toString();
                stokBrg = etStokBrg.getText().toString();

                Intent i = new Intent(inputBarang.this,outputBarang.class);

                if(kodeBrg.equals("") || namaBrg.equals("") || hargaBrg.equals("") || stokBrg.equals("") ){
                    Toast.makeText(inputBarang.this, " Tidak boleh kosong !", Toast.LENGTH_LONG).show();
                }else{
                    i.putExtra("kodeBrg",kodeBrg);
                    i.putExtra("namaBrg",namaBrg);
                    i.putExtra("hargaBrg",hargaBrg);
                    i.putExtra("stokBrg",stokBrg);
                    startActivity(i);
                }


            }
        });
    }
}



