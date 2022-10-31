package com.example.netsecuirity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //скроем заголовок окна
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //Сделаем активность на весь на экран
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_splash)
        planeta.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate))
        Handler().postDelayed({
        //Задержка на 4 секунды
        },1000)


            //Старт главной активности
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //И остановка splash активности
            finish()
        },6000)
    }
}
