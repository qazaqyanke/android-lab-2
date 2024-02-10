package com.example.thirdlabkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnBio = findViewById<Button>(R.id.button1)
        val BtnProfile = findViewById<Button>(R.id.button2)
        val BtnCamera = findViewById<Button>(R.id.button3)


        BtnBio.setOnClickListener{
            intent = Intent(applicationContext, Second_Screen::class.java)
            startActivity(intent)
        }

        BtnProfile.setOnClickListener {
            val website = Intent(Intent.ACTION_VIEW)
            website.data = Uri.parse("https://github.com/qazaqyanke")
            startActivity(website)
        }

        BtnCamera.setOnClickListener {
            val camera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera)
        }
    }
}