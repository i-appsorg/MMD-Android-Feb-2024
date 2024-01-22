package com.i2donate.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.i2donate.R;
import com.i2donate.databinding.ActivityTwitterLoginWebViewBinding;

public class TwitterLoginWebView extends AppCompatActivity {
    ActivityTwitterLoginWebViewBinding binding;
    boolean loadingFinished = true;
    boolean redirect = false;
    String BACK_URL = "https://api.twitter.com/oauth/authenticate";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwitterLoginWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadView();
    }

    private void loadView() {
        binding.webview.getSettings().setJavaScriptEnabled(true);
        String url = getIntent().getStringExtra("url");
        binding.webview.loadUrl(url);
        addListener();
    }

    private void addListener(){
        binding.webview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(
                    WebView view, WebResourceRequest request) {
                if (!loadingFinished) {
                    redirect = true;
                }

                loadingFinished = false;

                Uri uri = request.getUrl();
                if (uri != null){
                    String verifier = uri.getQueryParameter("oauth_verifier");
                    Intent intent = new Intent();
                    intent.putExtra("data",verifier);
                    setResult(Activity.RESULT_OK,intent);
                    finish();
                }

                return true;
            }

            @Override
            public void onPageStarted(
                    WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                loadingFinished = false;
                //SHOW LOADING IF IT ISNT ALREADY VISIBLE
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                Log.d("onPageFinished",url);
//                Toast.makeText(TwitterLoginWebView.this,url,Toast.LENGTH_SHORT).show();

                if (!redirect) {
                    loadingFinished = true;
                    if (url.equals(BACK_URL)) {
                       // onBackPressed();
                    }
                    //HIDE LOADING IT HAS FINISHED
                } else {
                    redirect = false;
                }
            }
        });
    }
}