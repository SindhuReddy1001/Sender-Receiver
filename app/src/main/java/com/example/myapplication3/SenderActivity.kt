package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

   class SenderActivity : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.sender_activity)

           val thistext= findViewById<TextView>(R.id.sender_t)
           thistext.text = "ClickHere"

           thistext.setOnClickListener {
               val toactivity = ReceiverActivity::class.java
               val n = Intent(applicationContext, toactivity)
               n.putExtra("A", 1)
               n.putExtra("B", 1.1)
               n.putExtra("C", 1)

               startActivity(n)
           }
       }
   }