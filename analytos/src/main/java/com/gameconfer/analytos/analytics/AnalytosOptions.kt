package com.gameconfer.analytos.analytics

sealed class AnalytosData {
    data class UI(
        val values: HashMap<String, Any?>,
        val key: String
    ) : AnalytosData()

    data class CUSTOM(
        val values: HashMap<String, Any?>,
        val key: String
    ) : AnalytosData()

    data class LOG(
        val values: HashMap<String, Any?>,
        val key: String
    ) : AnalytosData()
}

class AnalytosDataFactory {


    companion object {
    }

    fun create() {

    }

}

sealed class AnalytosTarget {
    class Event {
        object FIREBASE : AnalytosTarget()
        object BRANCH : AnalytosTarget()
        object EXTERNAL : AnalytosTarget()
    }
    object LOG : AnalytosTarget()
}