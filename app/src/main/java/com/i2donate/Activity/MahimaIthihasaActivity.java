package com.i2donate.Activity;

import static com.i2donate.Activity.SubCategoryActivity.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import com.i2donate.CommonActivity.CommonBackActivity;
import com.i2donate.R;

public class MahimaIthihasaActivity extends CommonBackActivity {
    Toolbar toolbar;
    ImageView back_icon_login_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mahima_ithihasa);
        setView(R.layout.activity_mahima_ithihasa, TAG);

        toolbar = findViewById(R.id.commonMenuActivityToolbar);
        toolbar.setVisibility(View.GONE);

        back_icon_login_img = findViewById(R.id.back_icon_login_img);
        back_icon_login_img.setOnClickListener(v -> onBackPressed());
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        finish();
    }

}