package com.example.androidkotlinpractice101.service

import com.example.androidkotlinpractice101.model.DotaProPlayerModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {
    @GET("proPlayers")
    fun callPlayer(): Call<ArrayList<DotaProPlayerModel>>
}