package net.kathir.koinapp.di


import net.kathir.koinapp.data.repository.ImagesRepoistory
import net.kathir.koinapp.utlis.LocationHandler
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val repositoryModule = module {
    single { ImagesRepoistory(androidContext(), imagesApi = get()) }

    single { LocationHandler() }
}