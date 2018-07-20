package com.gabrielsamojlo.navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setupWithNavController(findNavController(R.id.host_fragment))
    }

    override fun onSupportNavigateUp() = findNavController(R.id.host_fragment).navigateUp()

}
