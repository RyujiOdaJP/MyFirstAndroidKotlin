package com.example.myfirstandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// まずはonCreateというメソッドがAndroidによって呼び出されます
// =>エントリーポイントという。
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val hello: String = "Hello World"
        val int_value: Int = 12345 //型宣言しなくても可
        val long_value: Long = 12345L //Long型のリテラル
        val double_value: Double = 12.345
        val float_value: Float = 12.345F
        val boolean_value: Boolean = true

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", hello);
        Log.d("MainActivity", "" + int_value);
        Log.d("MainActivity", "" + long_value);
        Log.d("MainActivity", "" + double_value);
        Log.d("MainActivity", "" + float_value);
        Log.d("MainActivity", "" + boolean_value);

        /* log output
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: Hello World
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12345
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12345
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12.345
        2020-12-26 23:27:03.393 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12.345
        2020-12-26 23:27:03.393 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: true
        */
    }
}