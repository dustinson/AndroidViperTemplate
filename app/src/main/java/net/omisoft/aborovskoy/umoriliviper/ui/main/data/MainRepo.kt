package net.omisoft.aborovskoy.umoriliviper.ui.main.data

import io.reactivex.Single
import net.omisoft.aborovskoy.umoriliviper.app.model.Joke
import net.omisoft.aborovskoy.umoriliviper.ui.main.MainContract
import net.omisoft.aborovskoy.umoriliviper.ui.main.api.MainApi

class MainRepo(private val api: MainApi) : MainContract.Repo {

    override fun getJokes(): Single<List<Joke>> = api.getData()
}