package net.kathir.koinapp.utlis.extensions

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("srcUrl")
fun loadImage(view: ImageView, imageUrl: String?)
{
    if(imageUrl == null) return

    net.kathir.koinapp.utlis.imageLoader.loadImage(imageUrl, view)

}