package com.hafidzan.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputBarang(View view) {
        Intent explicit = new Intent(MainActivity.this, inputBarang.class);
        startActivity(explicit);

    }

    public void inputSupplier(View view) {
        Intent explicit = new Intent(MainActivity.this, inputSuplier.class);
        startActivity(explicit);
    }
}