package net.kathir.koinapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import net.kathir.koinapp.R
import net.kathir.koinapp.data.model.ImageModel
import net.kathir.koinapp.databinding.ItemImageBinding

class ImagesAdapter : RecyclerView.Adapter<ImagesViewHolder>() {

    private var items = ArrayList<ImageModel>()

    fun setData(items: ArrayList<ImageModel>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val binding: ItemImageBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_image, parent,
            false
        )
        return ImagesViewHolder(binding)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        holder.binding.imageUrl = items[position].url
    }
}

class ImagesViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root)