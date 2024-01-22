// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdvanceCompletedBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Button applyButton;

  @NonNull
  public final ImageView backIconLoginImg;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final Toolbar commonMenuActivityToolbar;

  @NonNull
  public final TextView exemptTvDeselect;

  @NonNull
  public final TextView exemptTvSelect;

  @NonNull
  public final TextView nonExemptDeselectTv;

  @NonNull
  public final TextView nonExemptSelectTv;

  @NonNull
  public final RecyclerView recyclerviewAdvancesearch;

  @NonNull
  public final Button resetButton;

  @NonNull
  public final RelativeLayout revenueRelativeLayout;

  @NonNull
  public final RelativeLayout searchTypesSubTypes;

  @NonNull
  public final TextView titleTextView;

  private ActivityAdvanceCompletedBinding(@NonNull CoordinatorLayout rootView,
      @NonNull Button applyButton, @NonNull ImageView backIconLoginImg,
      @NonNull LinearLayout bottomLayout, @NonNull Toolbar commonMenuActivityToolbar,
      @NonNull TextView exemptTvDeselect, @NonNull TextView exemptTvSelect,
      @NonNull TextView nonExemptDeselectTv, @NonNull TextView nonExemptSelectTv,
      @NonNull RecyclerView recyclerviewAdvancesearch, @NonNull Button resetButton,
      @NonNull RelativeLayout revenueRelativeLayout, @NonNull RelativeLayout searchTypesSubTypes,
      @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.applyButton = applyButton;
    this.backIconLoginImg = backIconLoginImg;
    this.bottomLayout = bottomLayout;
    this.commonMenuActivityToolbar = commonMenuActivityToolbar;
    this.exemptTvDeselect = exemptTvDeselect;
    this.exemptTvSelect = exemptTvSelect;
    this.nonExemptDeselectTv = nonExemptDeselectTv;
    this.nonExemptSelectTv = nonExemptSelectTv;
    this.recyclerviewAdvancesearch = recyclerviewAdvancesearch;
    this.resetButton = resetButton;
    this.revenueRelativeLayout = revenueRelativeLayout;
    this.searchTypesSubTypes = searchTypesSubTypes;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdvanceCompletedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdvanceCompletedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_advance_completed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdvanceCompletedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.apply_button;
      Button applyButton = ViewBindings.findChildViewById(rootView, id);
      if (applyButton == null) {
        break missingId;
      }

      id = R.id.back_icon_login_img;
      ImageView backIconLoginImg = ViewBindings.findChildViewById(rootView, id);
      if (backIconLoginImg == null) {
        break missingId;
      }

      id = R.id.bottom_layout;
      LinearLayout bottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomLayout == null) {
        break missingId;
      }

      id = R.id.commonMenuActivityToolbar;
      Toolbar commonMenuActivityToolbar = ViewBindings.findChildViewById(rootView, id);
      if (commonMenuActivityToolbar == null) {
        break missingId;
      }

      id = R.id.exempt_tv_deselect;
      TextView exemptTvDeselect = ViewBindings.findChildViewById(rootView, id);
      if (exemptTvDeselect == null) {
        break missingId;
      }

      id = R.id.exempt_tv_select;
      TextView exemptTvSelect = ViewBindings.findChildViewById(rootView, id);
      if (exemptTvSelect == null) {
        break missingId;
      }

      id = R.id.non_exempt_deselect_tv;
      TextView nonExemptDeselectTv = ViewBindings.findChildViewById(rootView, id);
      if (nonExemptDeselectTv == null) {
        break missingId;
      }

      id = R.id.non_exempt_select_tv;
      TextView nonExemptSelectTv = ViewBindings.findChildViewById(rootView, id);
      if (nonExemptSelectTv == null) {
        break missingId;
      }

      id = R.id.recyclerview_advancesearch;
      RecyclerView recyclerviewAdvancesearch = ViewBindings.findChildViewById(rootView, id);
      if (recyclerviewAdvancesearch == null) {
        break missingId;
      }

      id = R.id.reset_button;
      Button resetButton = ViewBindings.findChildViewById(rootView, id);
      if (resetButton == null) {
        break missingId;
      }

      id = R.id.revenueRelativeLayout;
      RelativeLayout revenueRelativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (revenueRelativeLayout == null) {
        break missingId;
      }

      id = R.id.search_types_sub_types;
      RelativeLayout searchTypesSubTypes = ViewBindings.findChildViewById(rootView, id);
      if (searchTypesSubTypes == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ActivityAdvanceCompletedBinding((CoordinatorLayout) rootView, applyButton,
          backIconLoginImg, bottomLayout, commonMenuActivityToolbar, exemptTvDeselect,
          exemptTvSelect, nonExemptDeselectTv, nonExemptSelectTv, recyclerviewAdvancesearch,
          resetButton, revenueRelativeLayout, searchTypesSubTypes, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}