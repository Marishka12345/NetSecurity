package com.example.netsecuirity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.netsecuirity.StepFourthFragment
import com.example.netsecuirity.StepOneFragment
import com.example.netsecuirity.StepSecondFragment
import com.example.netsecuirity.StepThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter (fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> InfoFragment()
            1 -> StepOneFragment()
            2 -> StepSecondFragment()
            3 -> StepThirdFragment()
            else -> {
                return  StepFourthFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 5 //указывается сколько вкладок
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) { //указываются заголовки вкладок
            0 -> "Информация"
            1 -> "Шаг первый"
            2 -> "Шаг второй"
            3 -> "Шаг третий"
            else -> {
                return "Шаг четвёртый"
            }
        }
    }
}