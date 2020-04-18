package net.kathir.koinapp.di
import net.kathir.koinapp.viewmodel.MainActivityViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module



val viewModelModule = module {
    viewModel { MainActivityViewModel(get()) }
}
