package net.omisoft.aborovskoy.umoriliviper.ui.main.api

import io.reactivex.Single
import net.omisoft.aborovskoy.umoriliviper.app.model.Joke
import retrofit2.http.GET

interface MainApi {

    @GET("api/random")
    fun getData(): Single<List<Joke>>
}