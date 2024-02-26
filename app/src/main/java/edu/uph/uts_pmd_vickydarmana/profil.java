package edu.uph.uts_pmd_vickydarmana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class profil extends AppCompatActivity {

    LinearLayout button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        button1 = (LinearLayout) findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            Log.d("Submit", "Masuk ke tampilanawal");
            Intent intent = new Intent(profil.this, MainActivity.class);
            startActivity(intent);
        });
    }

//    @Override
//    public <View> void onClick(View view){
//        showToast();
//    }
//
//    private void showToast(){
//        String studentid = studentid.getText().toString();
//        String nama = nama.getText().toString();
//        String jurusan = jurusan.getText().toString();
//        String tahunmasuk = tahunmasuk.getText().toString();
//        String status = status.getText().toString();
//        String kampus = kampus.getText().toString();
//
//        String message = "StudentID: " + studentid + " | "Nama: " + nama + " | "Jurusan: " + jurusan + " | "TahunMasuk: " + tahunmasuk + " | "Status: " + status + " | "Kampus: " + kampus;
//    }
}


