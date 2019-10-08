package com.example.androidkotlinpractice101.ui

import android.util.Log
import com.example.androidkotlinpractice101.manager.HttpsManager
import com.example.androidkotlinpractice101.model.DotaProPlayerModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(view: IMainView) : IMainPresenter {

    private val view = view
    private var playerList: ArrayList<DotaProPlayerModel>? = null

    override fun loadPlayer() {
        view.showProgressBar()

        var callPlayer: Call<ArrayList<DotaProPlayerModel>>? =
            HttpsManager.getInstance().getApiService()?.callPlayer()

        callPlayer?.enqueue(object : Callback<ArrayList<DotaProPlayerModel>> {
            override fun onFailure(call: Call<ArrayList<DotaProPlayerModel>>, t: Throwable) {
                Log.d("FLIPFLOP", "Call Failure ${t.message}")
                view.showLoadingResult("Load Failure , Swipe down to Refresh")
            }

            override fun onResponse(
                call: Call<ArrayList<DotaProPlayerModel>>,
                response: Response<ArrayList<DotaProPlayerModel>>
            ) {
                if (response.isSuccessful) {
                    Log.d("FLIPFLOP", "Item size : ${response.body()?.size}")

                    playerList = response.body()

                    view.showPlayerList(playerList)
                    view.hideProgressBar()
                    view.showLoadingResult("Load Success !!")
                } else {
                    Log.d("FLIPFLOP", "Call not success : ${response.errorBody().toString()}")
                    view.showLoadingResult("Load Not Success , Swipe down to Refresh")
                }
            }

        })
    }
}