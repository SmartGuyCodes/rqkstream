package com.radioqurankenya.stream;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView browser = (WebView) findViewById(R.id.webview);
        //browser.loadUrl("https://live.radioqurankenya.co.ke/");
        //browser.loadUrl("https://radioqurankenya.co.ke/");
        //browser.loadUrl("http://www.radioqurankenyalive.com/public/radio_quran_kenya");
        browser.loadUrl("https://radioqurankenya.co.ke/landing/mobile");

        //Enabling JS
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}