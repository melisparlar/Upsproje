package com.example.yemekler.viewModel

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.toolbox.StringRequest
import com.example.yemekler.model.Food
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.example.yemekler.repository.YemeklerDaoRepository
import org.json.JSONException
import org.json.JSONObject

class YemekMenuFragmentViewModel: ViewModel() {

    var yemekListesi = MutableLiveData<List<Food>>()
    private val ydaor = YemeklerDaoRepository()

    init {
        yemekleriYukle()
        yemekListesi = ydaor.yemekleriGetir()
    }

    fun yemekleriYukle() {
        ydaor.tumYemekleriAl()
    }

}