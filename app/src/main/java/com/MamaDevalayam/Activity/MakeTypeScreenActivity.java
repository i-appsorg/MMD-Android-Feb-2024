package com.MamaDevalayam.Activity;

import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.MamaDevalayam.CommonActivity.CommonBackActivity;
import com.MamaDevalayam.R;

public class MakeTypeScreenActivity extends CommonBackActivity {

    TextView tvTopType, tvWebsiteId, tvEmailId, tvContactId;
    Button register_btn;
    ImageView back_icon_login_img;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_make_type_screen);
        setView(R.layout.activity_make_type_screen, SubCategoryActivity.TAG);

        toolbar = findViewById(R.id.commonMenuActivityToolbar);
        toolbar.setVisibility(View.GONE);

        tvTopType = (TextView) findViewById(R.id.tvTopType);
        tvWebsiteId = (TextView) findViewById(R.id.tvWebsiteId);
        tvEmailId = (TextView) findViewById(R.id.tvEmailId);
        tvContactId = (TextView) findViewById(R.id.tvContactId);
        register_btn = (Button) findViewById(R.id.register_btn);
        back_icon_login_img = (ImageView) findViewById(R.id.back_icon_login_img);


        tvTopType.setText(getIntent().getStringExtra("tvTopType"));
        tvWebsiteId.setText(getIntent().getStringExtra("tvWebsiteId"));
        tvEmailId.setText(getIntent().getStringExtra("tvEmailId"));
        tvContactId.setText(getIntent().getStringExtra("tvContactId"));

        register_btn.setVisibility(View.GONE);

        back_icon_login_img.setOnClickListener(view -> onBackPressed());

    }
}