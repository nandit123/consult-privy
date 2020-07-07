package com.example.consultprivy

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.viewbinding.ViewBinding
//import cash.z.ecc.android.lockbox.LockBox
//import cash.z.ecc.kotlin.mnemonic.Mnemonics
import cash.z.ecc.android.bip39.Mnemonics

import cash.z.ecc.android.sdk.Initializer
//import okio.Buffer
//import okio.GzipSink
//import okio.Okio

class MainActivity : AppCompatActivity() {
    var fabListener: BaseDemoFragment<out ViewBinding>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun onFabClicked(view: View) {
        fabListener?.onActionButtonClicked()
    }
    fun toastMessage(view: View)
    {
        var toast = Toast.makeText(this, "Transaction Sent", Toast.LENGTH_LONG)
        toast.show()
    }

}

fun createAccount() {

}