package com.example.job19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nilai = findViewById<EditText>(R.id.editText)
        val huruf = findViewById<Button>(R.id.btn)

        huruf.setOnClickListener {
            konversiNilai(nilai.text.toString().toInt())
        }
    }

    fun konversiNilai(editText: Int) {

        if (editText in 91..100) {
            Toast.makeText(this, "Nilai Kamu  A", Toast.LENGTH_SHORT).show();
        } else if (editText in 81..90) {
            Toast.makeText(this, "Nilai Kamu  B", Toast.LENGTH_SHORT).show()
        } else if (editText in 71..80) {
            Toast.makeText(this, "Nilai Kamu  C", Toast.LENGTH_SHORT).show()
        } else if (editText in 61..70) {
            Toast.makeText(this, "Nilai Kamu  D", Toast.LENGTH_SHORT).show()
        } else if (editText in 0..60) {
            Toast.makeText(this, "Nilai Kamu  E", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Nilai Kamu  Lebih dari yang ditentukan", Toast.LENGTH_SHORT)
                .show()
        }
    }
}