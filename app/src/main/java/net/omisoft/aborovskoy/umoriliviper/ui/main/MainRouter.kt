package net.omisoft.aborovskoy.umoriliviper.ui.main

import net.omisoft.aborovskoy.umoriliviper.app.model.Joke
import net.omisoft.aborovskoy.umoriliviper.ui.detail.DetailActivity

class MainRouter(private val activity: MainActivity) : MainContract.Router {
    override fun finish() {
        activity.finish()
    }

    override fun openFullJoke(data: Joke) {
        DetailActivity.launch(activity, data)
    }
}