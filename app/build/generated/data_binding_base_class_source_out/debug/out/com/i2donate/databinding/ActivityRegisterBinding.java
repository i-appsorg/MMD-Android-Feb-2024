// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.login.widget.LoginButton;
import com.google.android.material.textfield.TextInputLayout;
import com.i2donate.Commonmethod.SearchableSpinner;
import com.i2donate.R;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView backIconImg;

  @NonNull
  public final TextInputLayout businessNameInputLayout;

  @NonNull
  public final RadioGroup businessRadioGroup1;

  @NonNull
  public final EditText businessRegNameEt;

  @NonNull
  public final CheckBox checkboxBtn;

  @NonNull
  public final Toolbar commonMenuActivityToolbar;

  @NonNull
  public final TextInputLayout confirmInputLayout;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final TextInputLayout emailInputLayout;

  @NonNull
  public final ImageView facebookLogin;

  @NonNull
  public final LoginButton facebookLoginBtn;

  @NonNull
  public final ImageView googleSignBtn;

  @NonNull
  public final TextView iagreeTv;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final LinearLayout layAllocDoc;

  @NonNull
  public final LinearLayout layIncorpDoc;

  @NonNull
  public final LinearLayout layOtherDoc;

  @NonNull
  public final LinearLayout layStandDoc;

  @NonNull
  public final TextView loginBtnTv;

  @NonNull
  public final TextInputLayout mobileInputLayout;

  @NonNull
  public final TextInputLayout nameInputLayout;

  @NonNull
  public final TextInputLayout passwordInputLayout;

  @NonNull
  public final RadioButton radioBtnBusiness;

  @NonNull
  public final RadioButton radioBtnFemale;

  @NonNull
  public final RadioButton radioBtnIndividual;

  @NonNull
  public final RadioButton radioBtnMale;

  @NonNull
  public final RadioButton radioBtnOrthers;

  @NonNull
  public final RadioGroup radioGroup1;

  @NonNull
  public final EditText regConfirmPasswordEt;

  @NonNull
  public final EditText regEmailEt;

  @NonNull
  public final EditText regMobileEt;

  @NonNull
  public final EditText regNameEt;

  @NonNull
  public final EditText regPasswordEt;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final LinearLayout registerGenderLayout;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final SearchableSpinner spinCountry;

  @NonNull
  public final LinearLayout termsLayout;

  @NonNull
  public final ImageView twitterLogin;

  @NonNull
  public final TwitterLoginButton twitterLoginBtn;

  @NonNull
  public final TextView txtAllocDocName;

  @NonNull
  public final TextView txtIncorpDocName;

  @NonNull
  public final TextView txtOtherDocName;

  @NonNull
  public final TextView txtStandDocName;

  @NonNull
  public final Button uploadBtnAllocDoc;

  @NonNull
  public final Button uploadBtnIncorpDoc;

  @NonNull
  public final Button uploadBtnOtherDoc;

  @NonNull
  public final Button uploadBtnStandDoc;

  private ActivityRegisterBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView backIconImg, @NonNull TextInputLayout businessNameInputLayout,
      @NonNull RadioGroup businessRadioGroup1, @NonNull EditText businessRegNameEt,
      @NonNull CheckBox checkboxBtn, @NonNull Toolbar commonMenuActivityToolbar,
      @NonNull TextInputLayout confirmInputLayout, @NonNull CoordinatorLayout coordinatorLayout,
      @NonNull TextInputLayout emailInputLayout, @NonNull ImageView facebookLogin,
      @NonNull LoginButton facebookLoginBtn, @NonNull ImageView googleSignBtn,
      @NonNull TextView iagreeTv, @NonNull ImageView imageView3, @NonNull LinearLayout layAllocDoc,
      @NonNull LinearLayout layIncorpDoc, @NonNull LinearLayout layOtherDoc,
      @NonNull LinearLayout layStandDoc, @NonNull TextView loginBtnTv,
      @NonNull TextInputLayout mobileInputLayout, @NonNull TextInputLayout nameInputLayout,
      @NonNull TextInputLayout passwordInputLayout, @NonNull RadioButton radioBtnBusiness,
      @NonNull RadioButton radioBtnFemale, @NonNull RadioButton radioBtnIndividual,
      @NonNull RadioButton radioBtnMale, @NonNull RadioButton radioBtnOrthers,
      @NonNull RadioGroup radioGroup1, @NonNull EditText regConfirmPasswordEt,
      @NonNull EditText regEmailEt, @NonNull EditText regMobileEt, @NonNull EditText regNameEt,
      @NonNull EditText regPasswordEt, @NonNull Button registerBtn,
      @NonNull LinearLayout registerGenderLayout, @NonNull RelativeLayout relativeLayout,
      @NonNull SearchableSpinner spinCountry, @NonNull LinearLayout termsLayout,
      @NonNull ImageView twitterLogin, @NonNull TwitterLoginButton twitterLoginBtn,
      @NonNull TextView txtAllocDocName, @NonNull TextView txtIncorpDocName,
      @NonNull TextView txtOtherDocName, @NonNull TextView txtStandDocName,
      @NonNull Button uploadBtnAllocDoc, @NonNull Button uploadBtnIncorpDoc,
      @NonNull Button uploadBtnOtherDoc, @NonNull Button uploadBtnStandDoc) {
    this.rootView = rootView;
    this.backIconImg = backIconImg;
    this.businessNameInputLayout = businessNameInputLayout;
    this.businessRadioGroup1 = businessRadioGroup1;
    this.businessRegNameEt = businessRegNameEt;
    this.checkboxBtn = checkboxBtn;
    this.commonMenuActivityToolbar = commonMenuActivityToolbar;
    this.confirmInputLayout = confirmInputLayout;
    this.coordinatorLayout = coordinatorLayout;
    this.emailInputLayout = emailInputLayout;
    this.facebookLogin = facebookLogin;
    this.facebookLoginBtn = facebookLoginBtn;
    this.googleSignBtn = googleSignBtn;
    this.iagreeTv = iagreeTv;
    this.imageView3 = imageView3;
    this.layAllocDoc = layAllocDoc;
    this.layIncorpDoc = layIncorpDoc;
    this.layOtherDoc = layOtherDoc;
    this.layStandDoc = layStandDoc;
    this.loginBtnTv = loginBtnTv;
    this.mobileInputLayout = mobileInputLayout;
    this.nameInputLayout = nameInputLayout;
    this.passwordInputLayout = passwordInputLayout;
    this.radioBtnBusiness = radioBtnBusiness;
    this.radioBtnFemale = radioBtnFemale;
    this.radioBtnIndividual = radioBtnIndividual;
    this.radioBtnMale = radioBtnMale;
    this.radioBtnOrthers = radioBtnOrthers;
    this.radioGroup1 = radioGroup1;
    this.regConfirmPasswordEt = regConfirmPasswordEt;
    this.regEmailEt = regEmailEt;
    this.regMobileEt = regMobileEt;
    this.regNameEt = regNameEt;
    this.regPasswordEt = regPasswordEt;
    this.registerBtn = registerBtn;
    this.registerGenderLayout = registerGenderLayout;
    this.relativeLayout = relativeLayout;
    this.spinCountry = spinCountry;
    this.termsLayout = termsLayout;
    this.twitterLogin = twitterLogin;
    this.twitterLoginBtn = twitterLoginBtn;
    this.txtAllocDocName = txtAllocDocName;
    this.txtIncorpDocName = txtIncorpDocName;
    this.txtOtherDocName = txtOtherDocName;
    this.txtStandDocName = txtStandDocName;
    this.uploadBtnAllocDoc = uploadBtnAllocDoc;
    this.uploadBtnIncorpDoc = uploadBtnIncorpDoc;
    this.uploadBtnOtherDoc = uploadBtnOtherDoc;
    this.uploadBtnStandDoc = uploadBtnStandDoc;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_icon_img;
      ImageView backIconImg = ViewBindings.findChildViewById(rootView, id);
      if (backIconImg == null) {
        break missingId;
      }

      id = R.id.business_name_input_layout;
      TextInputLayout businessNameInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (businessNameInputLayout == null) {
        break missingId;
      }

      id = R.id.business_radioGroup1;
      RadioGroup businessRadioGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (businessRadioGroup1 == null) {
        break missingId;
      }

      id = R.id.business_reg_name_et;
      EditText businessRegNameEt = ViewBindings.findChildViewById(rootView, id);
      if (businessRegNameEt == null) {
        break missingId;
      }

      id = R.id.checkbox_btn;
      CheckBox checkboxBtn = ViewBindings.findChildViewById(rootView, id);
      if (checkboxBtn == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityToolbar;
      Toolbar commonMenuActivityToolbar = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityToolbar == null) {
        break missingId;
      }

      id = R.id.confirm_input_layout;
      TextInputLayout confirmInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (confirmInputLayout == null) {
        break missingId;
      }

      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.email_input_layout;
      TextInputLayout emailInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailInputLayout == null) {
        break missingId;
      }

      id = R.id.facebook_login;
      ImageView facebookLogin = ViewBindings.findChildViewById(rootView, id);
      if (facebookLogin == null) {
        break missingId;
      }

      id = R.id.facebook_login_btn;
      LoginButton facebookLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (facebookLoginBtn == null) {
        break missingId;
      }

      id = R.id.google_sign_btn;
      ImageView googleSignBtn = ViewBindings.findChildViewById(rootView, id);
      if (googleSignBtn == null) {
        break missingId;
      }

      id = R.id.iagree_tv;
      TextView iagreeTv = ViewBindings.findChildViewById(rootView, id);
      if (iagreeTv == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.lay_alloc_doc;
      LinearLayout layAllocDoc = ViewBindings.findChildViewById(rootView, id);
      if (layAllocDoc == null) {
        break missingId;
      }

      id = R.id.lay_incorp_doc;
      LinearLayout layIncorpDoc = ViewBindings.findChildViewById(rootView, id);
      if (layIncorpDoc == null) {
        break missingId;
      }

      id = R.id.lay_other_doc;
      LinearLayout layOtherDoc = ViewBindings.findChildViewById(rootView, id);
      if (layOtherDoc == null) {
        break missingId;
      }

      id = R.id.lay_stand_doc;
      LinearLayout layStandDoc = ViewBindings.findChildViewById(rootView, id);
      if (layStandDoc == null) {
        break missingId;
      }

      id = R.id.login_btn_tv;
      TextView loginBtnTv = ViewBindings.findChildViewById(rootView, id);
      if (loginBtnTv == null) {
        break missingId;
      }

      id = R.id.mobile_input_layout;
      TextInputLayout mobileInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (mobileInputLayout == null) {
        break missingId;
      }

      id = R.id.name_input_layout;
      TextInputLayout nameInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (nameInputLayout == null) {
        break missingId;
      }

      id = R.id.password_input_layout;
      TextInputLayout passwordInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordInputLayout == null) {
        break missingId;
      }

      id = R.id.radio_btn_business;
      RadioButton radioBtnBusiness = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnBusiness == null) {
        break missingId;
      }

      id = R.id.radio_btn_female;
      RadioButton radioBtnFemale = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnFemale == null) {
        break missingId;
      }

      id = R.id.radio_btn_individual;
      RadioButton radioBtnIndividual = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnIndividual == null) {
        break missingId;
      }

      id = R.id.radio_btn_male;
      RadioButton radioBtnMale = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnMale == null) {
        break missingId;
      }

      id = R.id.radio_btn_orthers;
      RadioButton radioBtnOrthers = ViewBindings.findChildViewById(rootView, id);
      if (radioBtnOrthers == null) {
        break missingId;
      }

      id = R.id.radioGroup1;
      RadioGroup radioGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup1 == null) {
        break missingId;
      }

      id = R.id.reg_confirm_password_et;
      EditText regConfirmPasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (regConfirmPasswordEt == null) {
        break missingId;
      }

      id = R.id.reg_email_et;
      EditText regEmailEt = ViewBindings.findChildViewById(rootView, id);
      if (regEmailEt == null) {
        break missingId;
      }

      id = R.id.reg_mobile_et;
      EditText regMobileEt = ViewBindings.findChildViewById(rootView, id);
      if (regMobileEt == null) {
        break missingId;
      }

      id = R.id.reg_name_et;
      EditText regNameEt = ViewBindings.findChildViewById(rootView, id);
      if (regNameEt == null) {
        break missingId;
      }

      id = R.id.reg_password_et;
      EditText regPasswordEt = ViewBindings.findChildViewById(rootView, id);
      if (regPasswordEt == null) {
        break missingId;
      }

      id = R.id.register_btn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.register_gender_layout;
      LinearLayout registerGenderLayout = ViewBindings.findChildViewById(rootView, id);
      if (registerGenderLayout == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.spin_country;
      SearchableSpinner spinCountry = ViewBindings.findChildViewById(rootView, id);
      if (spinCountry == null) {
        break missingId;
      }

      id = R.id.terms_layout;
      LinearLayout termsLayout = ViewBindings.findChildViewById(rootView, id);
      if (termsLayout == null) {
        break missingId;
      }

      id = R.id.twitter_login;
      ImageView twitterLogin = ViewBindings.findChildViewById(rootView, id);
      if (twitterLogin == null) {
        break missingId;
      }

      id = R.id.twitter_login_btn;
      TwitterLoginButton twitterLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (twitterLoginBtn == null) {
        break missingId;
      }

      id = R.id.txt_alloc_doc_name;
      TextView txtAllocDocName = ViewBindings.findChildViewById(rootView, id);
      if (txtAllocDocName == null) {
        break missingId;
      }

      id = R.id.txt_incorp_doc_name;
      TextView txtIncorpDocName = ViewBindings.findChildViewById(rootView, id);
      if (txtIncorpDocName == null) {
        break missingId;
      }

      id = R.id.txt_other_doc_name;
      TextView txtOtherDocName = ViewBindings.findChildViewById(rootView, id);
      if (txtOtherDocName == null) {
        break missingId;
      }

      id = R.id.txt_stand_doc_name;
      TextView txtStandDocName = ViewBindings.findChildViewById(rootView, id);
      if (txtStandDocName == null) {
        break missingId;
      }

      id = R.id.upload_btn_alloc_doc;
      Button uploadBtnAllocDoc = ViewBindings.findChildViewById(rootView, id);
      if (uploadBtnAllocDoc == null) {
        break missingId;
      }

      id = R.id.upload_btn_incorp_doc;
      Button uploadBtnIncorpDoc = ViewBindings.findChildViewById(rootView, id);
      if (uploadBtnIncorpDoc == null) {
        break missingId;
      }

      id = R.id.upload_btn_other_doc;
      Button uploadBtnOtherDoc = ViewBindings.findChildViewById(rootView, id);
      if (uploadBtnOtherDoc == null) {
        break missingId;
      }

      id = R.id.upload_btn_stand_doc;
      Button uploadBtnStandDoc = ViewBindings.findChildViewById(rootView, id);
      if (uploadBtnStandDoc == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((CoordinatorLayout) rootView, backIconImg,
          businessNameInputLayout, businessRadioGroup1, businessRegNameEt, checkboxBtn,
          commonMenuActivityToolbar, confirmInputLayout, coordinatorLayout, emailInputLayout,
          facebookLogin, facebookLoginBtn, googleSignBtn, iagreeTv, imageView3, layAllocDoc,
          layIncorpDoc, layOtherDoc, layStandDoc, loginBtnTv, mobileInputLayout, nameInputLayout,
          passwordInputLayout, radioBtnBusiness, radioBtnFemale, radioBtnIndividual, radioBtnMale,
          radioBtnOrthers, radioGroup1, regConfirmPasswordEt, regEmailEt, regMobileEt, regNameEt,
          regPasswordEt, registerBtn, registerGenderLayout, relativeLayout, spinCountry,
          termsLayout, twitterLogin, twitterLoginBtn, txtAllocDocName, txtIncorpDocName,
          txtOtherDocName, txtStandDocName, uploadBtnAllocDoc, uploadBtnIncorpDoc,
          uploadBtnOtherDoc, uploadBtnStandDoc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
