package com.example.yemekler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.yemekler.adapter.YemekAdapter
import com.example.yemekler.fragment.YemekMenuFragment
import com.example.yemekler.model.Food
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var YemekListesi: ArrayList<Food>
    private lateinit var adapter: YemekAdapter
    private lateinit var tempFragment: Fragment
    var counter: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*toolbarMenu.title = "Menü"
        setSupportActionBar(toolbarMenu)


        RecyclerViewYemek.setHasFixedSize(true)
        RecyclerViewYemek.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


        supportFragmentManager.beginTransaction().add(R.id.ConstraitLayout,
                YemekMenuFragment()
        ).commit()

        bottomNV.setOnNavigationItemSelectedListener { menuItem ->

            if(menuItem.itemId == R.id.yemekMenuFragment){
                tempFragment = YemekMenuFragment()
                startActivity(Intent(this@MainActivity, MainActivity::class.java))
            }

            supportFragmentManager.beginTransaction().replace(R.id.ConstraitLayout, tempFragment).commit()

            true
        }


        YemekListesi = ArrayList()
        adapter = YemekAdapter(
                this@MainActivity,
                YemekListesi,
                counter
        )
        RecyclerViewYemek.adapter = adapter

        tumYemekler()*/
    }
/*
    fun tumYemekler(){
        val webServiceUrl = "http://kasimadalan.pe.hu/yemekler/tum_yemekler.php"

        val requestToUrl = StringRequest(Request.Method.GET, webServiceUrl, { responseOfUrl ->

            try{
                YemekListesi = ArrayList()

                val jsonObj = JSONObject(responseOfUrl)
                val yemekler = jsonObj.getJSONArray("yemekler")

                for(index in 0 until yemekler.length()){

                    val y = yemekler.getJSONObject(index)

                    val yemek_id = y.getInt("yemek_id")
                    val yemek_adi = y.getString("yemek_adi")
                    val yemek_resim_adi = y.getString("yemek_resim_adi")
                    val yemek_fiyat = y.getInt("yemek_fiyat")

                    val yemek = Food(
                            yemek_id,
                            yemek_adi,
                            yemek_resim_adi,
                            yemek_fiyat
                    )

                    YemekListesi.add(yemek)

                }
                adapter = YemekAdapter(
                        this@MainActivity,
                        YemekListesi,
                        counter
                )
                RecyclerViewYemek.adapter = adapter

            }
            catch(e: JSONException){
                e.printStackTrace()
            }

        }, Response.ErrorListener { Log.e("Hata", "Tüm Yemek Okuma") })

        Volley.newRequestQueue(this@MainActivity).add(requestToUrl)
    }

*/
}
