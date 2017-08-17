package com.example.cain.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

    }

    fun method() = "hello"

}
