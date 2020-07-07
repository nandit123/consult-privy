package com.example.consultprivy

import android.app.Application

class App : Application() {

    var defaultConfig = Config()

    override fun onCreate() {
        instance = this
        super.onCreate()
    }

    companion object {
        lateinit var instance: App
    }
}
