package com.example.netsecuirity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.netsecuirity.InformationFragment
import com.example.netsecuirity.UserStepOneFragment
import com.example.netsecuirity.UserStepTwoFragment
import com.example.netsecuirity.UserStepThreeFragment
import com.example.netsecuirity.UserStepFourFragment
import com.example.netsecuirity.UserStepFiveFragment
import com.example.netsecuirity.UserStepSixFragment

class UserAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> InformationFragment()
            1 -> UserStepOneFragment()
            2 -> UserStepTwoFragment()
            3 -> UserStepThreeFragment()
            4 -> UserStepFourFragment()
            5 -> UserStepFiveFragment()
            else -> {
                return  UserStepSixFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 7 //указывается сколько вкладок
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) { //указываются заголовки вкладок
            0 -> "Информация"
            1 -> "Шаг первый"
            2 -> "Шаг второй"
            3 -> "Шаг третий"
            4 -> "Шаг четвёртый"
            5 -> "Шаг пятый"
            else -> {
                return "Шаг шестой"
            }
        }
    }
}