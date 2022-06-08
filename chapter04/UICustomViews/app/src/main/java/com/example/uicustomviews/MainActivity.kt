package com.example.uicustomviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //todo 文本的图片可以显示,但是button的背景图显示不出来,怀疑和theme有关.
        supportActionBar?.hide()
    }
}