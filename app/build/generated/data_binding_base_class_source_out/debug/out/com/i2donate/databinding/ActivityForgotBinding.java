// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backIconLoginImg;

  @NonNull
  public final Toolbar commonMenuActivityToolbar;

  @NonNull
  public final TextInputLayout emailInputLayout;

  @NonNull
  public final TextView forgotTv;

  @NonNull
  public final Button mailSendBtn;

  @NonNull
  public final EditText regEmailEt;

  private ActivityForgotBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView backIconLoginImg, @NonNull Toolbar commonMenuActivityToolbar,
      @NonNull TextInputLayout emailInputLayout, @NonNull TextView forgotTv,
      @NonNull Button mailSendBtn, @NonNull EditText regEmailEt) {
    this.rootView = rootView;
    this.backIconLoginImg = backIconLoginImg;
    this.commonMenuActivityToolbar = commonMenuActivityToolbar;
    this.emailInputLayout = emailInputLayout;
    this.forgotTv = forgotTv;
    this.mailSendBtn = mailSendBtn;
    this.regEmailEt = regEmailEt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_icon_login_img;
      ImageView backIconLoginImg = ViewBindings.findChildViewById(rootView, id);
      if (backIconLoginImg == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityToolbar;
      Toolbar commonMenuActivityToolbar = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityToolbar == null) {
        break missingId;
      }

      id = R.id.email_input_layout;
      TextInputLayout emailInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailInputLayout == null) {
        break missingId;
      }

      id = R.id.forgot_tv;
      TextView forgotTv = ViewBindings.findChildViewById(rootView, id);
      if (forgotTv == null) {
        break missingId;
      }

      id = R.id.mail_send_btn;
      Button mailSendBtn = ViewBindings.findChildViewById(rootView, id);
      if (mailSendBtn == null) {
        break missingId;
      }

      id = R.id.reg_email_et;
      EditText regEmailEt = ViewBindings.findChildViewById(rootView, id);
      if (regEmailEt == null) {
        break missingId;
      }

      return new ActivityForgotBinding((RelativeLayout) rootView, backIconLoginImg,
          commonMenuActivityToolbar, emailInputLayout, forgotTv, mailSendBtn, regEmailEt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}