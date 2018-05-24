package keijumt.androidbase.di.module

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import keijumt.androidbase.di.ViewModelFactory

/**
 * Module: ViewModel
 */
@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}