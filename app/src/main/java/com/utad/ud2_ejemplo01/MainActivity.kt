package com.utad.ud2_ejemplo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utad.ud2_ejemplo01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding: ActivityMainBinding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myInitialFragment = InitialFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(binding.fcvTest.id, myInitialFragment)
        transaction.commit()

    }
}