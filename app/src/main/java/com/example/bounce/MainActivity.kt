package com.example.bounce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val image = findViewById<ImageView>(R.id.img)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.bounce)
            image.startAnimation(animation)
        }
    }
}