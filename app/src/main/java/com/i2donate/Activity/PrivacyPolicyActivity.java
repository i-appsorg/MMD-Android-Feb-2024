package com.i2donate.Activity;

import static com.i2donate.RetrofitAPI.ApiClient.Privacy_URL;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.i2donate.R;

public class PrivacyPolicyActivity extends AppCompatActivity {
    WebView webView;
    ImageView back_icon_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        init();
        listioner();
    }
    private void init() {
        webView=(WebView)findViewById(R.id.webView);
        webView.setBackgroundColor(Color.TRANSPARENT);
        WebSettings webSettings = webView.getSettings();
        webSettings.setTextZoom(webSettings.getTextZoom() - 40);
//        webView.loadUrl("https://test.i2-donate.com/i2D-Publish-Docs/i2-Donate%20Privacy%20Policy.html");
        webView.loadUrl(Privacy_URL);



       /* back_icon_img=(ImageView) findViewById(R.id.back_icon_img);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings();
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setScrollbarFadingEnabled(true);
        WebSettings webSettings = webView.getSettings();
        // webSettings.setTextSize(WebSettings.TextSize.SMALLEST);
        // webView.loadUrl("https://admin.i2-donate.com/terms_conditions.html");
        webView.loadUrl("https://test.i2-donate.com/i2D-Publish-Docs/i2-Donate%20Privacy%20Policy.html");
        webSettings.setTextZoom(webSettings.getTextZoom() - 40);*/


    }
    private void listioner() {
        back_icon_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}