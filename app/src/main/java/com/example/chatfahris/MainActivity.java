package com.example.chatfahris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static final String KONTAK="NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.penerima);
    }
    public void pageZenitsu(View view){
        Intent page1 = new Intent(MainActivity.this, tampilan1.class);
        page1.putExtra(KONTAK, "Zenitsu");
        startActivity(page1);
    }
    public void pageTanjiro(View view){
        Intent page1 = new Intent(MainActivity.this, tampilan1.class);
        page1.putExtra(KONTAK, "Tanjiro");
        startActivity(page1);
    }
    public void pageNezuko(View view){
        Intent page1 = new Intent(MainActivity.this, tampilan1.class);
        page1.putExtra(KONTAK, "Nezuko");
        startActivity(page1);
    }
}