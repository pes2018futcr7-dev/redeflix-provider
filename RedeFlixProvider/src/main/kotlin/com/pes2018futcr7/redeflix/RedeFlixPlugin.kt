package com.pes2018futcr7.redeflix

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class RedeFlixPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(RedeFlixProvider())
    }
}
