package com.danang.evncpc

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home,R.id.searchFragment, R.id.navigation_dashboard, R.id.navigation_notifications,R.id.mapsFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)
        
        navView.setupWithNavController(navController)
        supportActionBar?.hide()
    }

    override fun onResume() {
        super.onResume()
    }
}