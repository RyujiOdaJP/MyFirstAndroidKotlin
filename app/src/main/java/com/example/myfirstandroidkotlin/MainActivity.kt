package com.example.myfirstandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// まずはonCreateというメソッドがAndroidによって呼び出されます
// =>エントリーポイントという。
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Hello World!")
    }
}