package net.omisoft.aborovskoy.umoriliviper.app

import android.app.Application
import net.omisoft.aborovskoy.umoriliviper.app.di.AppComponent
import net.omisoft.aborovskoy.umoriliviper.app.di.AppModule
import net.omisoft.aborovskoy.umoriliviper.app.di.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .context(this)
            .plus(AppModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        component.inject(this)
    }
}