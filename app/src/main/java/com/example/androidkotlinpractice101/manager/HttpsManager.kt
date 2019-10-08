package com.example.androidkotlinpractice101.manager

import com.example.androidkotlinpractice101.service.ApiService
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpsManager {

    private var instance: HttpsManager? = null

    fun getInstance(): HttpsManager {
        if (instance == null) instance = HttpsManager
        return instance as HttpsManager
    }

    private var apiService: ApiService? = null

    init {
        val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("https://api.opendota.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(ApiService::class.java)
    }

    fun getApiService() : ApiService? {
        return apiService
    }
}