package com.example.nurture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nurture.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()

        val firstFragment = fragmentHome()
        val secondFragment = stimulateFragment()
        val thirdFragment = articleFragment()
        val fourthFragment = profileFragment()

        setContentView(binding.root)
        setCurrentFragment(firstFragment)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miStimulate -> setCurrentFragment(secondFragment)
                R.id.miArticle -> setCurrentFragment(thirdFragment)
                R.id.miProfile -> setCurrentFragment(fourthFragment)

                else ->{

                }
            }
            true
        }
    }


    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}