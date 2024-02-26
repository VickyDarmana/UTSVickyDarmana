package edu.uph.uts_pmd_vickydarmana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class profil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        Button buttonLayout = findViewById(R.id.jasonn);


        buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText studentIdEditText = findViewById(R.id.id);
                EditText namaEditText = findViewById(R.id.nama);
                EditText jurusanEditText = findViewById(R.id.jurusan);
                EditText tahunMasukEditText = findViewById(R.id.tahun);

                String studentId = studentIdEditText.getText().toString();
                String nama = namaEditText.getText().toString();
                String jurusan = jurusanEditText.getText().toString();
                String tahunMasuk = tahunMasukEditText.getText().toString();


                String toastMessage = "Student ID: " + studentId + "\nNama: " + nama +
                        "\nJurusan: " + jurusan + "\nTahun Masuk: " + tahunMasuk;

                Toast.makeText(profil.this, toastMessage, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(profil.this, MainActivity.class);
                startActivity(intent);
            }
        }

        );
    }
}

