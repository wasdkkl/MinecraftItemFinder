package com.example.minecraftitemfinder;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.result_text);

        String itemName = getIntent().getStringExtra("ITEM_NAME");
        String result = getItemDetails(itemName); // Fungsi untuk mendapatkan detail item
        resultText.setText(result);
    }

    private String getItemDetails(String itemName) {
        // Logika untuk mendapatkan detail item berdasarkan itemName
        // Misalnya, menggunakan switch-case atau database
        return "Detail item untuk: " + itemName; // Contoh output
    }
}
