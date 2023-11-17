package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*WebView webView = findViewById(R.id.web);
        webView.setWebViewClient(new webViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://1501solutions.com");*/

        val webView: WebView = findViewById(R.id.web)
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://rosecafe.shop/")

    }
}