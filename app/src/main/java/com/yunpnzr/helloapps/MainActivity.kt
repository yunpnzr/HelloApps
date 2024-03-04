package com.yunpnzr.helloapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//Diawali huruf besar, passive
class MainActivity : AppCompatActivity() {

    //passive
    private val name: String = "Watashi"
    //active
    private val isValidation: Boolean = true

    //diawali huruf kecil. active
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}