package com.hafidzan.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class outputSuplier extends AppCompatActivity {

    TextView tv_kodeSup,tv_namaSup,tv_kontakSup,tv_alamatSup;
    String kodeSup,namaSup,kontakSup,alamatSup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_suplier);
        
    tv_kodeSup = (TextView) findViewById(R.id.tv_kode_sup);
    tv_namaSup = (TextView) findViewById(R.id.tv_nama_sup);
    tv_kontakSup = (TextView) findViewById(R.id.tv_kontak_sup);
    tv_alamatSup = (TextView) findViewById(R.id.tv_alamat_sup);

        if(getIntent().getStringExtra("kodeSup") != null){
        kodeSup = getIntent().getStringExtra("kodeSup");
        tv_kodeSup.setText(kodeSup);
    }
        if(getIntent().getStringExtra("namaSup") != null){
        namaSup = getIntent().getStringExtra("namaSup");
        tv_namaSup.setText(namaSup);
    }
        if(getIntent().getStringExtra("kontakSup") != null){
        kontakSup = getIntent().getStringExtra("kontakSup");
        tv_kontakSup.setText(kontakSup);
    }
        if(getIntent().getStringExtra("alamatSup") != null){
        alamatSup = getIntent().getStringExtra("alamatSup");
        tv_alamatSup.setText(alamatSup);
    }

}

    public void backToInputSup(View view) {
        Intent explicit = new Intent(outputSuplier.this, inputSuplier.class);
        startActivity(explicit);
    }
}