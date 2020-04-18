package net.kathir.koinapp.data.api

import net.kathir.koinapp.data.model.ImageResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface ImagesApi {

    @GET("images/search?query=l")
    fun getImages() : Call<ImageResponseModel>
}