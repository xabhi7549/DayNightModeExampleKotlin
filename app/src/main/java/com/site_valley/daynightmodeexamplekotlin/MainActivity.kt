package com.site_valley.daynightmodeexamplekotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<SwitchMaterial>(R.id.mode).setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                setTheme("night")
            }else{
                setTheme("day")
            }
        }
    }

    private fun setTheme( themeCode: String) {
        if (themeCode.equals("day", ignoreCase = true)) {
            AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO
            )
        } else {
            AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES
            )
        }
    }
}