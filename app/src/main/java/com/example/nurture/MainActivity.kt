package com.example.nurture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
    }
}