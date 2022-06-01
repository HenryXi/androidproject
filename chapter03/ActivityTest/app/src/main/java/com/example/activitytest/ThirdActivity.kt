package com.example.activitytest

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", "Task id is $taskId")
        setContentView(R.layout.third_layout)
        button3.setOnClickListener {
            ActivityCollector.finishAll()
            //todo 尝试了只执行下面这个语句, 发现activity并没有销毁,为啥进程都结束了,activity不销毁呢
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }
}