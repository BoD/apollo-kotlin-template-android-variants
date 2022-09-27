package com.example.apollokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.apollokotlin.buildtype.BUILD_TYPE_CONSTANT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.wtf("MainActivity", "XXX Build type is $BUILD_TYPE_CONSTANT")
    }
}
