package com.example.yemekler.retrofit

import com.example.yemekler.model.FoodCevap
import retrofit2.Call
import retrofit2.http.GET

interface YemekDaoInterface {

    @GET("yemekler/tum_yemekler.php")
    fun tumYemekler() : Call<FoodCevap>

}