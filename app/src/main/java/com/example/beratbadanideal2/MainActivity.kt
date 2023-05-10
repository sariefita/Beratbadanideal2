package com.example.beratbadanideal2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variable yang berhubungan dengan layout
        val nama = findViewById<EditText>(R.id.Etnama)
        val tinggibadan= findViewById<EditText>(R.id.Ettb)
        val btncowo= findViewById<Button>(R.id.button)
        val btncewe= findViewById<Button>(R.id.button2)
        val btnproses= findViewById<Button>(R.id.button3)
        val hasil= findViewById<TextView>(R.id.Hasil)
        //perintah pada tombol proses
        var Tinggi= tinggibadan.text.toString().toInt()
        var Nama = nama.text.toString()

        btncowo.setOnClickListener {
            
        }
        }
    }
