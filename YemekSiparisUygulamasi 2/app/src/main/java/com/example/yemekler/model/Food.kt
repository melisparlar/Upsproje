package com.example.yemekler.model

import java.io.Serializable

data class Food(var yemek_id:Int, var yemek_adi:String, var yemek_resim_adi:String, var yemek_fiyat:Int) :Serializable{
}