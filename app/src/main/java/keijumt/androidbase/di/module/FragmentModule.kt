package keijumt.androidbase.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import keijumt.androidbase.ui.main.MainFragment

/**
 * Module: Fragment
 */
@Suppress("unused")
@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}