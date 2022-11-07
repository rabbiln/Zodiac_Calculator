package com.blvpvi.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tanggalLahir = findViewById<EditText>(R.id.et_tanggalLahir)
        val bulanLahir = findViewById<Spinner>(R.id.sp_bulan)
        val btnHasil = findViewById<Button>(R.id.btn_hasil)
        val hasil = findViewById<TextView>(R.id.tv_hasil)


        btnHasil.setOnClickListener {
            hasil.text = ""

            if (tanggalLahir.text.toString()
                    .trim() == "" || bulanLahir.selectedItem.toString() == "Pilih Bulan"
            ) {
                Toast.makeText(
                    applicationContext,
                    "Tanggal dan bulan Harus Diisi",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                if (bulanLahir.selectedItem.toString() == "Januari") {
                    if (tanggalLahir.text.toString().toInt() <= 19)
                        hasil.text = "CAPRICORN"
                    else
                        hasil.text = "AQUARIUS"
                } else if (bulanLahir.selectedItem.toString() == "Februari") {
                    if (tanggalLahir.text.toString().toInt() <= 18)
                        hasil.text = "AQUARIUS"
                    else
                        hasil.text = "PISCES"
                } else if (bulanLahir.selectedItem.toString() == "Maret") {
                    if (tanggalLahir.text.toString().toInt() <= 20)
                        hasil.text = "PISCES"
                    else
                        hasil.text = "ARIES"
                } else if (bulanLahir.selectedItem.toString() == "April") {
                    if (tanggalLahir.text.toString().toInt() <= 19)
                        hasil.text = "ARIES"
                    else
                        hasil.text = "TAURUS"
                } else if (bulanLahir.selectedItem.toString() == "Mei") {
                    if (tanggalLahir.text.toString().toInt() <= 20)
                        hasil.text = "TAURUS"
                    else
                        hasil.text = "GEMINI"
                } else if (bulanLahir.selectedItem.toString() == "Juni") {
                    if (tanggalLahir.text.toString().toInt() <= 20)
                        hasil.text = "GEMINI"
                    else
                        hasil.text = "CANCER"
                } else if (bulanLahir.selectedItem.toString() == "Juli") {
                    if (tanggalLahir.text.toString().toInt() <= 22)
                        hasil.text = "CANCER"
                    else
                        hasil.text = "LEO"
                } else if (bulanLahir.selectedItem.toString() == "Agustus") {
                    if (tanggalLahir.text.toString().toInt() <= 22)
                        hasil.text = "LEO"
                    else
                        hasil.text = "VIRGO"
                } else if (bulanLahir.selectedItem.toString() == "September") {
                    if (tanggalLahir.text.toString().toInt() <= 22)
                        hasil.text = "VIRGO"
                    else
                        hasil.text = "LIBRA"
                } else if (bulanLahir.selectedItem.toString() == "Oktober") {
                    if (tanggalLahir.toString().toInt() <= 22)
                        hasil.text = "LIBRA"
                    else
                        hasil.text = "SCORPIO"
                } else if (bulanLahir.selectedItem.toString() == "November") {
                    if (tanggalLahir.toString().toInt() <= 21)
                        hasil.text = "SCORPIO"
                    else
                        hasil.text = "SAGITTARIUS"
                } else if (bulanLahir.selectedItem.toString() == "Desember") {
                    if (tanggalLahir.toString().toInt() <= 21)
                        hasil.text = "SAGITTARIUS"
                    else
                        hasil.text = "CAPRICORN"
                }
            }
        }
    }
}