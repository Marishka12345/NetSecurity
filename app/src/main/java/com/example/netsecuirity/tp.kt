package com.example.netsecuirity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_tp.*

class tp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tp)
        WebView.webViewClient = WebViewClient()
        WebView.loadUrl("https://forms.yandex.ru/u/635fb9ab43f74f92949e4acb/")
        WebView.settings.javaScriptEnabled = true
    }
}