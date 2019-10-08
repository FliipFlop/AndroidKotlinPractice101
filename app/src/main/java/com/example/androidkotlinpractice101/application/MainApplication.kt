package com.example.androidkotlinpractice101.application

import android.app.Application

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}