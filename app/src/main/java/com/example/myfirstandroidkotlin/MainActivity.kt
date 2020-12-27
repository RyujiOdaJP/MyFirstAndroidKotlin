package com.example.myfirstandroidkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

// まずはonCreateというメソッドがAndroidによって呼び出されます
// =>エントリーポイントという。
// class hoge : fuga() でextendsの意味
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
//        val hello: String = "Hello World"
        val intValue: Int = 12345 //型宣言しなくても可
        val longValue: Long = 12345L //Long型のリテラル
        val doubleValue: Double = 12.345
        val floatValue: Float = 12.345F
        val booleanValue: Boolean = true

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //R.id.text_view_helloはレイアウトエディタで自動で振り分けられる定数(Int)
        val hello: TextView = findViewById(R.id.text_view_hello)
        hello.text = "Hello, Android"
        hello.setTextColor(Color.parseColor("#FF0000"))
        hello.typeface = Typeface.DEFAULT_BOLD
        Log.d("MainActivity", hello.text.toString())

//        Log.d("MainActivity", hello);
        Log.d("MainActivity", "" + intValue);
        Log.d("MainActivity", "" + longValue);
        Log.d("MainActivity", "" + doubleValue);
        Log.d("MainActivity", "" + floatValue);
        Log.d("MainActivity", "" + booleanValue);
        Log.d("MainActivity", "" + this.addition(5, 19));
//        Log.d("MainActivity", "" + hello.replace("World", "Android"));

        /* log output
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: Hello World
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12345
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12345
        2020-12-26 23:27:03.392 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12.345
        2020-12-26 23:27:03.393 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: 12.345
        2020-12-26 23:27:03.393 13106-13106/com.example.myfirstandroidkotlin D/MainActivity: true
        */
    }

    private fun addition(a: Int, b: Int): Int {
        return a + b
    }
}