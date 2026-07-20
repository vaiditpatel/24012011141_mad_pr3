package com.example.a24012011141_mad_pr3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        implicitIntent()


    }
    fun implicitIntent(){
        findViewById<Button>(R.id.btn_Browse).setOnClickListener {Intent(Intent.ACTION_VIEW,
            Uri.parse(findViewById<EditText>(R.id.editTextText).text.toString())).also { startActivity(it) }  }
        findViewById<Button>(R.id.btn_Call).setOnClickListener { val number = findViewById<EditText>(R.id.editTextText2).text.toString()
        val intent = Intent(Intent.ACTION_DIAL)
             intent.setData("tel:$number".toUri())
             startActivity(intent)}
        findViewById<Button>(R.id.btn_CallLog).setOnClickListener { Intent(Intent()) }
        findViewById<Button>(R.id.btn_Gallary).setOnClickListener { Intent(Intent()) }
        findViewById<Button>(R.id.btn_Camera).setOnClickListener { Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { it } }
        findViewById<Button>(R.id.btn_Alarm).setOnClickListener {  Intent(AlarmClock.ACTION_SHOW_ALARMS).also { it } }


        fun explicitIntent(){
            findViewById<Button>(R.id.btn_Login).setOnClickListener { }
        }
    }
}