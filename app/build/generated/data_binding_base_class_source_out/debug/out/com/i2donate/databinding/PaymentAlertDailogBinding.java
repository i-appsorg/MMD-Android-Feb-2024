// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PaymentAlertDailogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView cancelTv;

  @NonNull
  public final Button paymentContinueBtn;

  @NonNull
  public final LinearLayout paymentDailogLinear;

  @NonNull
  public final EditText paymentEt;

  @NonNull
  public final TextView paymentInputtextlayout;

  @NonNull
  public final TextView textviewPercentage;

  private PaymentAlertDailogBinding(@NonNull LinearLayout rootView, @NonNull TextView cancelTv,
      @NonNull Button paymentContinueBtn, @NonNull LinearLayout paymentDailogLinear,
      @NonNull EditText paymentEt, @NonNull TextView paymentInputtextlayout,
      @NonNull TextView textviewPercentage) {
    this.rootView = rootView;
    this.cancelTv = cancelTv;
    this.paymentContinueBtn = paymentContinueBtn;
    this.paymentDailogLinear = paymentDailogLinear;
    this.paymentEt = paymentEt;
    this.paymentInputtextlayout = paymentInputtextlayout;
    this.textviewPercentage = textviewPercentage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PaymentAlertDailogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PaymentAlertDailogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.payment_alert_dailog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PaymentAlertDailogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_tv;
      TextView cancelTv = ViewBindings.findChildViewById(rootView, id);
      if (cancelTv == null) {
        break missingId;
      }

      id = R.id.payment_continue_btn;
      Button paymentContinueBtn = ViewBindings.findChildViewById(rootView, id);
      if (paymentContinueBtn == null) {
        break missingId;
      }

      LinearLayout paymentDailogLinear = (LinearLayout) rootView;

      id = R.id.payment_et;
      EditText paymentEt = ViewBindings.findChildViewById(rootView, id);
      if (paymentEt == null) {
        break missingId;
      }

      id = R.id.payment_inputtextlayout;
      TextView paymentInputtextlayout = ViewBindings.findChildViewById(rootView, id);
      if (paymentInputtextlayout == null) {
        break missingId;
      }

      id = R.id.textview_percentage;
      TextView textviewPercentage = ViewBindings.findChildViewById(rootView, id);
      if (textviewPercentage == null) {
        break missingId;
      }

      return new PaymentAlertDailogBinding((LinearLayout) rootView, cancelTv, paymentContinueBtn,
          paymentDailogLinear, paymentEt, paymentInputtextlayout, textviewPercentage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}