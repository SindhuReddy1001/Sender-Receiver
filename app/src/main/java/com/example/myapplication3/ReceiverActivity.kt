package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receiver_activity)

        val a = intent.getIntExtra("A",2)
        val b = intent.getDoubleExtra("B",2.1)
        val c = intent.getStringExtra("C")
        val data : String= "$a  $b  $c"

        val receivedT: TextView=findViewById(R.id.receiver_t)
        receivedT.text=data

      }

    }
