package com.i2donate.Activity;

import static com.i2donate.RetrofitAPI.ApiClient.About_URL;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.widget.Toolbar;

import com.i2donate.CommonActivity.CommonMenuActivity;
import com.i2donate.R;

public class AboutActivity extends CommonMenuActivity {
    private String TAG = "AboutActivity";
    Toolbar toolbar;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_about,TAG);
        setTitle("");
        toolbar = findViewById(R.id.commonMenuActivityToolbar);
        init();
    }

    @SuppressLint("JavascriptInterface")
    private void init() {
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(About_URL);
        webView.setBackgroundColor(Color.TRANSPARENT);
        WebSettings webSettings = webView.getSettings();
        webSettings.setTextZoom(webSettings.getTextZoom() - 40);
       /* webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings();
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setScrollbarFadingEnabled(true);
        WebSettings webSettings = webView.getSettings();

        webSettings.setTextZoom(webSettings.getTextZoom() - 40);*/



    }


}
