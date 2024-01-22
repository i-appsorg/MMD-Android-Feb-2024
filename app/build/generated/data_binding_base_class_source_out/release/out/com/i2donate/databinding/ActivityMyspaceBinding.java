// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyspaceBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout donationLayout;

  @NonNull
  public final TextView donationTvCount;

  @NonNull
  public final LinearLayout followerLinearLayout;

  @NonNull
  public final TextView followerTvCount;

  @NonNull
  public final TextView likeTvCount;

  @NonNull
  public final LinearLayout myLikesLinearLayout;

  @NonNull
  public final RecyclerView myspaceRecyclerviewList;

  @NonNull
  public final TextView myspaceTitleTv;

  @NonNull
  public final TextView titleNameTv;

  private ActivityMyspaceBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout donationLayout, @NonNull TextView donationTvCount,
      @NonNull LinearLayout followerLinearLayout, @NonNull TextView followerTvCount,
      @NonNull TextView likeTvCount, @NonNull LinearLayout myLikesLinearLayout,
      @NonNull RecyclerView myspaceRecyclerviewList, @NonNull TextView myspaceTitleTv,
      @NonNull TextView titleNameTv) {
    this.rootView = rootView;
    this.donationLayout = donationLayout;
    this.donationTvCount = donationTvCount;
    this.followerLinearLayout = followerLinearLayout;
    this.followerTvCount = followerTvCount;
    this.likeTvCount = likeTvCount;
    this.myLikesLinearLayout = myLikesLinearLayout;
    this.myspaceRecyclerviewList = myspaceRecyclerviewList;
    this.myspaceTitleTv = myspaceTitleTv;
    this.titleNameTv = titleNameTv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyspaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyspaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_myspace, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyspaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.donation_layout;
      LinearLayout donationLayout = ViewBindings.findChildViewById(rootView, id);
      if (donationLayout == null) {
        break missingId;
      }

      id = R.id.donation_tv_count;
      TextView donationTvCount = ViewBindings.findChildViewById(rootView, id);
      if (donationTvCount == null) {
        break missingId;
      }

      id = R.id.follower_linear_layout;
      LinearLayout followerLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (followerLinearLayout == null) {
        break missingId;
      }

      id = R.id.follower_tv_count;
      TextView followerTvCount = ViewBindings.findChildViewById(rootView, id);
      if (followerTvCount == null) {
        break missingId;
      }

      id = R.id.like_tv_count;
      TextView likeTvCount = ViewBindings.findChildViewById(rootView, id);
      if (likeTvCount == null) {
        break missingId;
      }

      id = R.id.my_likes_linear_layout;
      LinearLayout myLikesLinearLayout = ViewBindings.findChildViewById(rootView, id);
      if (myLikesLinearLayout == null) {
        break missingId;
      }

      id = R.id.myspace_recyclerview_list;
      RecyclerView myspaceRecyclerviewList = ViewBindings.findChildViewById(rootView, id);
      if (myspaceRecyclerviewList == null) {
        break missingId;
      }

      id = R.id.myspace_title_tv;
      TextView myspaceTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (myspaceTitleTv == null) {
        break missingId;
      }

      id = R.id.title_name_tv;
      TextView titleNameTv = ViewBindings.findChildViewById(rootView, id);
      if (titleNameTv == null) {
        break missingId;
      }

      return new ActivityMyspaceBinding((RelativeLayout) rootView, donationLayout, donationTvCount,
          followerLinearLayout, followerTvCount, likeTvCount, myLikesLinearLayout,
          myspaceRecyclerviewList, myspaceTitleTv, titleNameTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}