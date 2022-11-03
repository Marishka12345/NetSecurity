package com.example.netsecuirity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_app.*
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.fragment_tp.*

class AboutApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)
        pl.startAnimation(AnimationUtils.loadAnimation(this,R.anim.translate))
        sh.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate))
        Handler().postDelayed({
            //Задержка на 4 секунды
        },1500)
    }
}