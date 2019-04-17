package net.omisoft.aborovskoy.umoriliviper.ui.splash.di

import dagger.Module
import dagger.Provides
import net.omisoft.aborovskoy.umoriliviper.app.di.ActivityScope
import net.omisoft.aborovskoy.umoriliviper.ui.splash.SplashActivity
import net.omisoft.aborovskoy.umoriliviper.ui.splash.SplashContract
import net.omisoft.aborovskoy.umoriliviper.ui.splash.SplashPresenter
import net.omisoft.aborovskoy.umoriliviper.ui.splash.SplashRouter

@Module
class SplashModule {

    @Provides
    @ActivityScope
    fun router(activity: SplashActivity): SplashContract.Router = SplashRouter(activity)

    @Provides
    @ActivityScope
    fun presenter(router: SplashContract.Router) = SplashPresenter(router)
}