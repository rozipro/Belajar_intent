package com.ibnufebianproject.belajar_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnPindah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

        btnPindah.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_intent -> run {
                val pindahIntent = Intent(this@MainActivity, Activity_pindah::class.java)
                startActivity(pindahIntent)
            }
            R.id.btn_pindah_data -> run {
                val intentData = Intent(this@MainActivity, Activity_pindah::class.java)
                intentData.putExtra(Activity_pindahdata.EXTRA_TEXT, "Transfer Data Berhasil")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "Toyota Yaris",
                    2020,
                    "BM 2023 SAR"
                )

                val intentObjek = Intent(this@MainActivity, Activity_pindahobjek::class.java)
                intentObjek.putExtra(Activity_pindahobjek.EXTRA_CARS, cars)
                startActivity(intentObjek)
            }
        }
    }}