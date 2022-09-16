package com.integrate.jetpackktproject.bridge.ui.page

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.integrate.jetpackktproject.bridge.state.PlayerViewModel
import com.integrate.jetpackktproject.databinding.FragmentPlayerBinding

class PlayerFragment : Fragment() {

    private var mPlayerBinding:FragmentPlayerBinding ?= null
    private var mPlayerViewModel:PlayerViewModel ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}