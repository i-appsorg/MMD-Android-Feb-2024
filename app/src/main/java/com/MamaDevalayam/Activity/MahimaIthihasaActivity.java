package com.MamaDevalayam.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;

import com.MamaDevalayam.CommonActivity.CommonBackActivity;
import com.MamaDevalayam.R;

public class MahimaIthihasaActivity extends CommonBackActivity {
    Toolbar toolbar;
    ImageView back_icon_login_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mahima_ithihasa);
        setView(R.layout.activity_mahima_ithihasa, SubCategoryActivity.TAG);

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