package net.omisoft.aborovskoy.umoriliviper.ui.main.di

import dagger.Module
import dagger.Provides
import net.omisoft.aborovskoy.umoriliviper.app.di.ActivityScope
import net.omisoft.aborovskoy.umoriliviper.ui.main.*
import net.omisoft.aborovskoy.umoriliviper.ui.main.api.MainApi
import net.omisoft.aborovskoy.umoriliviper.ui.main.data.MainRepo
import retrofit2.Retrofit

@Module
class MainModule {

    @Provides
    @ActivityScope
    fun api(retrofit: Retrofit) = retrofit.create(MainApi::class.java)

    @Provides
    @ActivityScope
    fun repository(api: MainApi) = MainRepo(api)


    @Provides
    @ActivityScope
    fun router(activity: MainActivity): MainContract.Router = MainRouter(activity)

    @Provides
    @ActivityScope
    fun presenter(router: MainContract.Router, interactor: MainInteractor) = MainPresenter(router, interactor)

    @Provides
    @ActivityScope
    fun interactor(repository: MainRepo) = MainInteractor(repository)
}