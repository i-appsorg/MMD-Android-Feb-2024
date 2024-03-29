// Generated by view binder compiler. Do not edit!
package com.i2donate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.i2donate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SearchviewAdapterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final ImageView image;

  @NonNull
  public final RelativeLayout predictedRow;

  private SearchviewAdapterBinding(@NonNull RelativeLayout rootView, @NonNull TextView address,
      @NonNull ImageView image, @NonNull RelativeLayout predictedRow) {
    this.rootView = rootView;
    this.address = address;
    this.image = image;
    this.predictedRow = predictedRow;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchviewAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchviewAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.searchview_adapter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchviewAdapterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      RelativeLayout predictedRow = (RelativeLayout) rootView;

      return new SearchviewAdapterBinding((RelativeLayout) rootView, address, image, predictedRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
