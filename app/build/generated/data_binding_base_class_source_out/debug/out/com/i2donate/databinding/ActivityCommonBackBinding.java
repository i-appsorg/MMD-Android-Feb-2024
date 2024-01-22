// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCommonBackBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView backIconImg;

  @NonNull
  public final ImageView browseImg;

  @NonNull
  public final TextView browseTv;

  @NonNull
  public final DrawerLayout commonMenuActivityDrawerLayout;

  @NonNull
  public final FrameLayout commonMenuActivityFrameLayout;

  @NonNull
  public final Toolbar commonMenuActivityToolbar;

  @NonNull
  public final LinearLayout linearBrowse;

  @NonNull
  public final LinearLayout linearMyspace;

  @NonNull
  public final FrameLayout menuActivityFrameLayout;

  @NonNull
  public final ImageView mySpaceImg;

  @NonNull
  public final TextView mySpaceTv;

  @NonNull
  public final ImageView refreshMenu;

  @NonNull
  public final LinearLayout tabMode;

  private ActivityCommonBackBinding(@NonNull FrameLayout rootView, @NonNull ImageView backIconImg,
      @NonNull ImageView browseImg, @NonNull TextView browseTv,
      @NonNull DrawerLayout commonMenuActivityDrawerLayout,
      @NonNull FrameLayout commonMenuActivityFrameLayout,
      @NonNull Toolbar commonMenuActivityToolbar, @NonNull LinearLayout linearBrowse,
      @NonNull LinearLayout linearMyspace, @NonNull FrameLayout menuActivityFrameLayout,
      @NonNull ImageView mySpaceImg, @NonNull TextView mySpaceTv, @NonNull ImageView refreshMenu,
      @NonNull LinearLayout tabMode) {
    this.rootView = rootView;
    this.backIconImg = backIconImg;
    this.browseImg = browseImg;
    this.browseTv = browseTv;
    this.commonMenuActivityDrawerLayout = commonMenuActivityDrawerLayout;
    this.commonMenuActivityFrameLayout = commonMenuActivityFrameLayout;
    this.commonMenuActivityToolbar = commonMenuActivityToolbar;
    this.linearBrowse = linearBrowse;
    this.linearMyspace = linearMyspace;
    this.menuActivityFrameLayout = menuActivityFrameLayout;
    this.mySpaceImg = mySpaceImg;
    this.mySpaceTv = mySpaceTv;
    this.refreshMenu = refreshMenu;
    this.tabMode = tabMode;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCommonBackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCommonBackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_common_back, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCommonBackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_icon_img;
      ImageView backIconImg = ViewBindings.findChildViewById(rootView, id);
      if (backIconImg == null) {
        break missingId;
      }

      id = R.id.browse_img;
      ImageView browseImg = ViewBindings.findChildViewById(rootView, id);
      if (browseImg == null) {
        break missingId;
      }

      id = R.id.browse_tv;
      TextView browseTv = ViewBindings.findChildViewById(rootView, id);
      if (browseTv == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityDrawerLayout;
      DrawerLayout commonMenuActivityDrawerLayout = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityDrawerLayout == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityFrameLayout;
      FrameLayout commonMenuActivityFrameLayout = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityFrameLayout == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityToolbar;
      Toolbar commonMenuActivityToolbar = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityToolbar == null) {
        break missingId;
      }

      id = R.id.linear_browse;
      LinearLayout linearBrowse = ViewBindings.findChildViewById(rootView, id);
      if (linearBrowse == null) {
        break missingId;
      }

      id = R.id.linear_myspace;
      LinearLayout linearMyspace = ViewBindings.findChildViewById(rootView, id);
      if (linearMyspace == null) {
        break missingId;
      }

      FrameLayout menuActivityFrameLayout = (FrameLayout) rootView;

      id = R.id.my_space_img;
      ImageView mySpaceImg = ViewBindings.findChildViewById(rootView, id);
      if (mySpaceImg == null) {
        break missingId;
      }

      id = R.id.my_space_tv;
      TextView mySpaceTv = ViewBindings.findChildViewById(rootView, id);
      if (mySpaceTv == null) {
        break missingId;
      }

      id = R.id.refreshMenu;
      ImageView refreshMenu = ViewBindings.findChildViewById(rootView, id);
      if (refreshMenu == null) {
        break missingId;
      }

      id = R.id.tabMode;
      LinearLayout tabMode = ViewBindings.findChildViewById(rootView, id);
      if (tabMode == null) {
        break missingId;
      }

      return new ActivityCommonBackBinding((FrameLayout) rootView, backIconImg, browseImg, browseTv,
          commonMenuActivityDrawerLayout, commonMenuActivityFrameLayout, commonMenuActivityToolbar,
          linearBrowse, linearMyspace, menuActivityFrameLayout, mySpaceImg, mySpaceTv, refreshMenu,
          tabMode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}