package edu.uph.uts_pmd_vickydarmana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout tampilan1;
    LinearLayout tampilan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilan1 = (LinearLayout) findViewById(R.id.tampilan1);
        tampilan2 = (LinearLayout) findViewById(R.id.tampilan2);

        tampilan1.setOnClickListener(v -> {
            Log.d("SEP", "Masuk ke tampilan1");
            Intent intent = new Intent(MainActivity.this, layout_sep.class);
            startActivity(intent);
        });

        tampilan2.setOnClickListener(v -> {
            Log.d("PROFIL", "Masuk ke tampilan2");
            Intent intent = new Intent(MainActivity.this, profil.class);
            startActivity(intent);
        });
    }
}