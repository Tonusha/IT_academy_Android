package by.nca.it_academy.work.hw9;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by miruk on 21.03.2018.
 */
@GlideModule
public class CircleImage extends AppGlideModule {
    public static void showImage(Context context, String url, ImageView imageView) {
        GlideApp.with(context)
                .load((url == null || url.isEmpty())? imageView.getContentDescription(): url)
                .apply(RequestOptions.circleCropTransform())
                .placeholder(android.R.drawable.progress_indeterminate_horizontal)
                .error(android.R.drawable.ic_delete)
                .into(imageView);
    }
}
