package net.kathir.koinapp.data.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import net.kathir.koinapp.data.api.ImagesApi
import net.kathir.koinapp.data.model.ImageModel
import net.kathir.koinapp.data.model.ImageResponseModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ImagesRepoistory(private val context: Context, private val imagesApi: ImagesApi)
{

    fun getImages(data: MutableLiveData<ImageResponseModel>)
    {
        imagesApi.getImages().enqueue(object : Callback<ImageResponseModel>{
            override fun onFailure(call: Call<ImageResponseModel>, t: Throwable) {
                Log.e("onFailure", t.message.toString())
            }

            override fun onResponse(call: Call<ImageResponseModel>, response: Response<ImageResponseModel>) {
                if (response.isSuccessful) {
                    data.value = response.body()
                } else {
                    data.value = ImageResponseModel(arrayListOf(ImageModel()))
                }
            }

        })
    }
}