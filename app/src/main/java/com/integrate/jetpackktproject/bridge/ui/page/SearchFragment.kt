package com.integrate.jetpackktproject.bridge.ui.page

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.integrate.jetpackktproject.bridge.state.MainViewModel
import com.integrate.jetpackktproject.bridge.state.SearchViewModel
import com.integrate.jetpackktproject.databinding.ActivityMainBinding
import com.integrate.jetpackktproject.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var mSearchBinding:FragmentSearchBinding? = null

    private var mSearchViewModel:SearchViewModel ?=null

    private var mMainBinding:ActivityMainBinding ?= null
    private var mainViewModel:MainViewModel ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}