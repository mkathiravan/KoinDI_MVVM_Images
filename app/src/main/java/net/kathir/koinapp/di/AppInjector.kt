package net.kathir.koinapp.di

import net.kathir.koinapp.data.api.ImagesApi
import org.koin.dsl.module
import retrofit2.Retrofit



private val retrofit: Retrofit = createNetworkClient()


private val IMAGES_API: ImagesApi = retrofit.create(ImagesApi::class.java)

val networkModule = module {
    single { IMAGES_API }
}