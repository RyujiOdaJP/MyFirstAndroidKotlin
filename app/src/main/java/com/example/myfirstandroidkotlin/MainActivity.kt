package com.example.myfirstandroidkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// まずはonCreateというメソッドがAndroidによって呼び出されます
// =>エントリーポイントという。
// class hoge : fuga() でextendsの意味
class MainActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "it works!")

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        Log.d("MainActivity", "Clicked!")

        val editText: EditText = findViewById(R.id.editText)
        val input = editText.text.toString()
        Log.d("string", input)

        val textView: TextView = findViewById(R.id.textView)
        textView.text = input
    }
}