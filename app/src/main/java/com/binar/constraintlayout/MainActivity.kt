package com.binar.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/**
 * 1. buat 2 activity, sign in, sign up
 * 2. sign in => username/email dan password, button
 * 3. sign up username/email , password, confirm password, button
 * 4. terapin pake constraint
 * */
