package com.example.yemekler.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FoodCevap (@SerializedName("yemekler")
                      @Expose
                      var yemekler:List<Food>,

                      @SerializedName("success")
                      @Expose
                      var success:Int) {
}

