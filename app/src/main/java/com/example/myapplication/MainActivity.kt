package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0;
    var bCount = 0;
    var maxCount = 98;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.textSize = 30f;
        textView2.textSize = 50f;
        button.setOnClickListener{
            if (count < maxCount)
            {
                count += 1;
                textView.text = "$count";
            }
            else if (count == maxCount)
            {
                bCount += 1;
                count = 0;
                textView.text = "$count";
                textView2.text = "$bCount"
            }
        }
        button2.setOnClickListener{
            maxCount = 32;
            count = 0;
            bCount = 0;
            textView.text = "$count";
            textView2.text = "$bCount"
        }
        button4.setOnClickListener {
            maxCount = 98;
            count = 0;
            bCount = 0;
            textView.text = "$count";
            textView2.text = "$bCount"
        }
    }
}