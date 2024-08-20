package com.app.clickercount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    private lateinit var clickBtn: Button
    private lateinit var txtF: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn = findViewById<Button>(R.id.button)
        clickBtn.setOnClickListener(View.OnClickListener { countIncrement() })


    }
    private fun countIncrement () {
        txtF = findViewById<TextView>(R.id.txtCount)
        count ++
        val msg = getString(R.string.countField, count)
        txtF.text = msg

    }
}