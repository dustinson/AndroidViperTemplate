package net.omisoft.aborovskoy.umoriliviper.ui.splash.di

import dagger.BindsInstance
import dagger.Component
import net.omisoft.aborovskoy.umoriliviper.app.di.ActivityScope
import net.omisoft.aborovskoy.umoriliviper.app.di.AppComponent
import net.omisoft.aborovskoy.umoriliviper.ui.splash.SplashActivity

@ActivityScope
@Component(modules = [SplashModule::class], dependencies = [AppComponent::class])
interface SplashComponent {

    fun inject(target: SplashActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun activity(activity: SplashActivity): Builder

        fun appComponent(component: AppComponent): Builder

        fun plus(module: SplashModule): Builder

        fun build(): SplashComponent
    }
}