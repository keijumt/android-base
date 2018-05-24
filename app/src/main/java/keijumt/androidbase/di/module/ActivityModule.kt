package keijumt.androidbase.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import keijumt.androidbase.MainActivity

/**
 * Module: Activity
 */
@Suppress("unused")
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivity(): MainActivity
}