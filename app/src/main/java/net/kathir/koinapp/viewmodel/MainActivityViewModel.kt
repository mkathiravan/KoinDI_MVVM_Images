package net.kathir.koinapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.kathir.koinapp.data.model.ImageResponseModel
import net.kathir.koinapp.data.repository.ImagesRepoistory

class MainActivityViewModel(private val imagesRepoistory: ImagesRepoistory) : ViewModel()
{
    var imageResponseLiveData = MutableLiveData<ImageResponseModel>()


    fun getImages()
    {
        imagesRepoistory.getImages(imageResponseLiveData)
    }
}