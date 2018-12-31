package com.bitfitfitnessprivatelimited.databindingsample_basic.adapters;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bitfitfitnessprivatelimited.databindingsample_basic.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/31/2018
 * TIME :12:36 PM.
 * DAY: Monday
 * Project: DataBindingSample_Basic
 */
public class ImageAdapter {
    // Static Image(With Drawable)
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, int imageUrl) {
        Context context = view.getContext();
        RequestOptions option = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imageUrl)
                .into(view);
    }

    // Dynamic Image(Link)
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, String imageUrl) {
        Context context = view.getContext();
        RequestOptions option = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imageUrl)
                .into(view);
    }
}
