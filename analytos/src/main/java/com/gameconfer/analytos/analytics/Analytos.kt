package com.gameconfer.analytos.analytics

import android.app.Application

class Analytos {

    fun begin(app: Application) {

    }

    fun tell(option: AnalytosData, targets: Array<AnalytosTarget>) {
        when (option) {
            is AnalytosData.UI -> {

            }
            is AnalytosData.CUSTOM -> {

            }
            is AnalytosData.LOG -> {

            }
        }
    }

    private fun pushToTarget() {

    }

}