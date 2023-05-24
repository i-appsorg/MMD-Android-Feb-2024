package com.i2donate.Activity;

import static com.i2donate.RetrofitAPI.ApiClient.TC_URL;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.i2donate.R;

public class TermsAndConditionActivity extends AppCompatActivity {

    WebView webView;
    ImageView back_icon_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
        init();
        listioner();
    }
    private void init() {
        webView=(WebView)findViewById(R.id.webView);
        back_icon_img=(ImageView) findViewById(R.id.back_icon_img);
        webView.setBackgroundColor(Color.TRANSPARENT);
        WebSettings webSettings = webView.getSettings();
        webSettings.setTextZoom(webSettings.getTextZoom() - 40);
//        webView.loadUrl("https://test.i2-donate.com/i2D-Publish-Docs/i2-Donate%20Privacy%20Policy.html");
        webView.loadUrl(TC_URL);


       /* webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings();
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setScrollbarFadingEnabled(true);
        WebSettings webSettings = webView.getSettings();
        webView.loadUrl("https://test.i2-donate.com/i2D-Publish-Docs/i2-Donate%20Terms%20and%20Conditions.html");
        webSettings.setTextZoom(webSettings.getTextZoom() - 40);*/
    }
    private void listioner(){
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