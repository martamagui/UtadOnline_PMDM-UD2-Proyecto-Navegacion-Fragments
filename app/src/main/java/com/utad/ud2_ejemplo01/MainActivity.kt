package com.utad.ud2_ejemplo01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.utad.ud2_ejemplo01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val binding: ActivityMainBinding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.setFragmentResultListener("resultado", this) { key, bundle ->
            if (bundle.containsKey("arg")) {
                val message = bundle.getString("arg")
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }
        }

        /*val myInitialFragment = InitialFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setReorderingAllowed(true)
        transaction.add(binding.fcvTest.id, myInitialFragment)
        transaction.commit()*/
    }
}