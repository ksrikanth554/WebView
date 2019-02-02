package com.sritech.www.webview

import android.app.ProgressDialog
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pdialog=ProgressDialog(this@MainActivity)
        pdialog.setTitle("message")
        pdialog.setMessage("please wait it is loading")


        webview.webViewClient=(object :WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                pdialog.show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                pdialog.dismiss()
            }
        })

        webview.settings.javaScriptEnabled=true
        webview.settings.builtInZoomControls=true
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
            webview.loadUrl("file:///android_asset/login.html")
        }
    }
}
