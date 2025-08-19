package com.example.mad_23012011066_practical_3

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.provider.AlarmClock
import android.provider.MediaStore
import android.widget.EditText

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
        val browseButton = findViewById<Button>(R.id.weburlbutton).setOnClickListener {
            val url = findViewById<EditText>(R.id.weburleditTextText).text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val CallButton = findViewById<Button>(R.id.phonenobutton).setOnClickListener {
            val no = findViewById<EditText>(R.id.phonenoeditTextText2).text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$no"))
            startActivity(intent)
        }
        val calllogButton = findViewById<Button>(R.id.callogbutton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("content://call_log/calls")
            }
            startActivity(intent)
        }
        val GallaryButton = findViewById<Button>(R.id.gallarybutton).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                type = "image/*"
                data = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            }
            startActivity(intent)
        }
        val cameraButton = findViewById<Button>(R.id.camerabutton).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        val alarm = findViewById<Button>(R.id.alarmbutton).setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(intent)
        }
        val loginButton = findViewById<Button>(R.id.loginbutton).setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}