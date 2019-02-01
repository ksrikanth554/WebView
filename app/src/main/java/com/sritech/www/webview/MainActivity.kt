package com.sritech.www.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.webViewClient= WebViewClient()
        search.setOnClickListener{
            webview.loadUrl(edturl.text.toString())
        }
        facebook.setOnClickListener {
            webview.loadUrl("http://www.facebook.com")
        }
        google.setOnClickListener {
            webview.loadUrl("http://www.google.com")
        }
        youtube.setOnClickListener {
            webview.loadUrl("http://www.youtube.com")
        }
        html.setOnClickListener {
        }
    }
}
