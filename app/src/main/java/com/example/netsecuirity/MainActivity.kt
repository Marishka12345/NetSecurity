package com.example.netsecuirity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.netsecuirity.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = com.example.netsecuirity.databinding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.opredFragment3, R.id.ugrozaFragment2, R.id.protectFragment3, R.id.setFragment2,R.id.mobileFragment2, R.id.tipsFragment2,
                R.id.parent_controlFragment2, R.id.userFragment2, R.id.nopeFragment, R.id.testFragment
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.gradient))
        with(navView){
            setupWithNavController(navController)
            setNavigationItemSelectedListener(this@MainActivity)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {

            R.id.action_settings -> {

                val randomIntent = Intent(this, AboutApp::class.java)
                startActivity(randomIntent)

            }
            R.id.action_tp -> {

                val randomIntent = Intent(this, tp::class.java)
                startActivity(randomIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        /*
        *   Если совпадает по id, значит был нажат item ( id взял из activity_main_drawer )
        *   Тут тебе нужно написать переход по нажатию
        */
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return when(item.itemId){
            R.id.opredFragment3 -> {
                //Пример логики
               navController.navigate(R.id.opredFragment3)
                drawerLayout.close()
                true
            }
            R.id.ugrozaFragment2 -> {
                navController.navigate(R.id.ugrozaFragment2)
                drawerLayout.close()
                true
            }
            R.id.protectFragment3 -> {
                navController.navigate(R.id.protectFragment3)
                drawerLayout.close()
                true
            }
            R.id.setFragment2 -> {
                navController.navigate(R.id.setFragment2)
                drawerLayout.close()
                true
            }
            R.id.mobileFragment2 -> {
                navController.navigate(R.id.mobileFragment2)
                drawerLayout.close()
                true
            }
            R.id.tipsFragment2 -> {
                navController.navigate(R.id.tipsFragment2)
                drawerLayout.close()
                true
            }
            R.id.parent_controlFragment2 -> {
                navController.navigate(R.id.parent_controlFragment2)
                drawerLayout.close()
                true
            }
            R.id.userFragment2 -> {
                navController.navigate(R.id.userFragment2)
                drawerLayout.close()
                true
            }
            R.id.nopeFragment -> {
                navController.navigate(R.id.nopeFragment)
                drawerLayout.close()
                true
            }
            R.id.testFragment -> {
                navController.navigate(R.id.testFragment)
                drawerLayout.close()
                true
            }
            else -> false
        }
    }

}