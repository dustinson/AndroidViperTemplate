package net.omisoft.aborovskoy.umoriliviper.ui.detail.di

import dagger.Module
import dagger.Provides
import net.omisoft.aborovskoy.umoriliviper.app.di.ActivityScope
import net.omisoft.aborovskoy.umoriliviper.ui.detail.DetailActivity
import net.omisoft.aborovskoy.umoriliviper.ui.detail.DetailContract
import net.omisoft.aborovskoy.umoriliviper.ui.detail.DetailPresenter
import net.omisoft.aborovskoy.umoriliviper.ui.detail.DetailRouter

@Module
class DetailModule {

    @Provides
    @ActivityScope
    fun router(activity: DetailActivity): DetailContract.Router = DetailRouter(activity)

    @Provides
    @ActivityScope
    fun presenter(router: DetailContract.Router) = DetailPresenter(router)
}