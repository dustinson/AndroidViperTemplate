package net.omisoft.aborovskoy.umoriliviper.ui.splash

import net.omisoft.aborovskoy.umoriliviper.ui.main.MainActivity

class SplashRouter(private val activity: SplashActivity) : SplashContract.Router {

    override fun openMain() {
        MainActivity.launch(activity)
        activity.finish()
    }
}