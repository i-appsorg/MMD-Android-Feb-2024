package com.i2donate.Activity;

import static com.i2donate.RetrofitAPI.ApiClient.Help_URL;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.widget.Toolbar;

import com.i2donate.CommonActivity.CommonBackActivity;
import com.i2donate.CommonActivity.CommonMenuActivity;
import com.i2donate.R;

public class HelpSupportActivity extends CommonBackActivity {

    private final String TAG = "HelpSupportActivity";
    Toolbar toolbar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_help_support, TAG);
        setTitle("");
        toolbar = findViewById(R.id.commonMenuActivityToolbar);
        init();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void init() {
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings();
        webView.setScrollbarFadingEnabled(true);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.loadUrl(Help_URL);

        final WebSettings webSettings = webView.getSettings();
        webSettings.setTextZoom(webSettings.getTextZoom() - 68);


    }
}
