package keijumt.androidbase.di

import android.app.Application

/**
 * Helper class to automatically inject fragments if they implement [Injectable].
 */
object Injector {

    private lateinit var applicationComponent: AppComponent

    fun setup(application: Application): AppComponent {
        applicationComponent = DaggerAppComponent.builder()
                .application(application)
                .build()
        return applicationComponent
    }

    fun aplicationComponent(): AppComponent {
        return applicationComponent
    }
}