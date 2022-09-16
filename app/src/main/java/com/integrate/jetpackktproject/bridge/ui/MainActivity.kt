package com.integrate.jetpackktproject.bridge.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.integrate.jetpackktproject.R
import com.integrate.jetpackktproject.bridge.state.MainActivityViewModel
import com.integrate.jetpackktproject.databinding.ActivityMainBinding

/**
 * 管理者
 */
class MainActivity : AppCompatActivity() {


    private var mainBinding:ActivityMainBinding ? = null
    private var viewModel:MainActivityViewModel ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}