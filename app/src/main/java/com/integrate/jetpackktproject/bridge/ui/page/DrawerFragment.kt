package com.integrate.jetpackktproject.bridge.ui.page

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.integrate.jetpackktproject.bridge.state.DrawerViewModel
import com.integrate.jetpackktproject.databinding.FragmentDrawerBinding

class DrawerFragment : Fragment() {

    private var mBinding:FragmentDrawerBinding ? = null
    private var mDrawerModel: DrawerViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}