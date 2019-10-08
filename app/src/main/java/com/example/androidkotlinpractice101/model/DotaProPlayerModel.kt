package com.example.androidkotlinpractice101.model

import com.google.gson.annotations.SerializedName

data class DotaProPlayerModel(
    @SerializedName("account_id") val accountId: Int,
    @SerializedName("steamid") val steamid: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("avatarmedium") val avatarmedium: String,
    @SerializedName("avatarfull") val avatarfull: String,
    @SerializedName("profileurl") val profileurl: String,
    @SerializedName("personaname") val personaname: String,
    @SerializedName("last_login") val last_login: String,
    @SerializedName("full_history_time") val fullHistoryTime: String,
    @SerializedName("cheese") val cheese: Int,
    @SerializedName("fh_unavailable") val fh_unavailable: Boolean,
    @SerializedName("loccountrycode") val loccountrycode: String,
    @SerializedName("name") val name: String,
    @SerializedName("country_code") val countryCode: String,
    @SerializedName("fantasy_role") val fantasyRole: Int,
    @SerializedName("team_id") val teamId: Int,
    @SerializedName("team_name") val teamName: String,
    @SerializedName("team_tag") val teamTag: String,
    @SerializedName("is_locked") val isLocked: Boolean,
    @SerializedName("is_pro") val isPro: Boolean,
    @SerializedName("locked_until") val lockedUntil: Int
)