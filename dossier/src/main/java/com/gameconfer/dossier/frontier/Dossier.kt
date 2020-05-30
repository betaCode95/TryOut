package com.gameconfer.dossier.frontier

import android.app.Application
import com.gameconfer.dossier.components.LocalDossier
import com.gameconfer.dossier.components.RemoteDossier

fun boot(app: Application, option: DossierOptions) {
    when(option) {
        is DossierOptions.LOCAL -> {
            LocalDossier.create(app, option.name)
        }
        is DossierOptions.REMOTE -> {
            RemoteDossier.context = app.applicationContext
            RemoteDossier.endpoint = option.endpoint
        }
    }
}

sealed class DossierOptions {
    data class LOCAL(val name: String = "local"): DossierOptions()
    data class REMOTE(val endpoint: String = "", val version: String = "v1"): DossierOptions()
}