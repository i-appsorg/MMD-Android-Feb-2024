// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class CommonNavigationItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView commonNavigationItemImageView;

  @NonNull
  public final TextView commonNavigationItemTextView;

  @NonNull
  public final LinearLayout layout1;

  private CommonNavigationItemBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView commonNavigationItemImageView,
      @NonNull TextView commonNavigationItemTextView, @NonNull LinearLayout layout1) {
    this.rootView = rootView;
    this.commonNavigationItemImageView = commonNavigationItemImageView;
    this.commonNavigationItemTextView = commonNavigationItemTextView;
    this.layout1 = layout1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CommonNavigationItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CommonNavigationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.common_navigation_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CommonNavigationItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.commonNavigationItemImageView;
      ImageView commonNavigationItemImageView = ViewBindings.findChildViewById(rootView, id);
      if (commonNavigationItemImageView == null) {
        break missingId;
      }

      id = R.id.commonNavigationItemTextView;
      TextView commonNavigationItemTextView = ViewBindings.findChildViewById(rootView, id);
      if (commonNavigationItemTextView == null) {
        break missingId;
      }

      id = R.id.layout1;
      LinearLayout layout1 = ViewBindings.findChildViewById(rootView, id);
      if (layout1 == null) {
        break missingId;
      }

      return new CommonNavigationItemBinding((LinearLayout) rootView, commonNavigationItemImageView,
          commonNavigationItemTextView, layout1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
