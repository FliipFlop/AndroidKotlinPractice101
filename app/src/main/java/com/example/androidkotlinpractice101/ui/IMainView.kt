package com.example.androidkotlinpractice101.ui

import com.example.androidkotlinpractice101.model.DotaProPlayerModel

interface IMainView {
    fun showProgressBar()
    fun hideProgressBar()
    fun showPlayerList(playerList: ArrayList<DotaProPlayerModel>?)
    fun showLoadingResult(message: String?)
    fun onRefreshPlayerList()
}