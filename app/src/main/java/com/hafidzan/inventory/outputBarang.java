package com.hafidzan.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outputBarang extends AppCompatActivity {

    TextView tv_kodeBrg,tv_namaBrg,tv_hargaBrg,tv_stokBrg;
    String kodeBrg,namaBrg,hargaBrg,stokBrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_barang);

        tv_kodeBrg = (TextView) findViewById(R.id.tv_kode_brg);
        tv_namaBrg = (TextView) findViewById(R.id.tv_nama_brg);
        tv_hargaBrg = (TextView) findViewById(R.id.tv_harga_brg);
        tv_stokBrg = (TextView) findViewById(R.id.tv_stok_brg);

        if(getIntent().getStringExtra("kodeBrg") != null){
            kodeBrg = getIntent().getStringExtra("kodeBrg");
            tv_kodeBrg.setText(kodeBrg);
        }
        if(getIntent().getStringExtra("namaBrg") != null){
            namaBrg = getIntent().getStringExtra("namaBrg");
            tv_namaBrg.setText(namaBrg);
        }
        if(getIntent().getStringExtra("hargaBrg") != null){
            hargaBrg = getIntent().getStringExtra("hargaBrg");
            tv_hargaBrg.setText(hargaBrg);
        }
        if(getIntent().getStringExtra("stokBrg") != null){
            stokBrg = getIntent().getStringExtra("stokBrg");
            tv_stokBrg.setText(stokBrg);
        }

    }

    public void backToInputBrg(View view) {
        Intent explicit = new Intent(outputBarang.this, inputBarang.class);
        startActivity(explicit);
    }
}