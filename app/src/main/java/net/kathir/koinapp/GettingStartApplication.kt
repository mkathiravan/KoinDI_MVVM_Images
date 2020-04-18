package net.kathir.koinapp

import android.app.Application
import net.kathir.koinapp.di.networkModule
import net.kathir.koinapp.di.repositoryModule
import net.kathir.koinapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GettingStartApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@GettingStartApplication)
            modules(listOf(repositoryModule, networkModule, viewModelModule))
        }
    }
}