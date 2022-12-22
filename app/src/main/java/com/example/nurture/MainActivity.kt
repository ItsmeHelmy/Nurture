package com.example.nurture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.nurture.databinding.ActivityMainBinding
import com.example.nurture.fragment.ArticleFragment
import com.example.nurture.fragment.HomeFragment
import com.example.nurture.fragment.StimulateFragment
import com.example.nurture.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()


//        binding = ActivityMainBinding.inflate(layoutInflater)
//        //requestWindowFeature(Window.FEATURE_NO_TITLE)
//        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
//
//        val firstFragment = fragmentHome()
//        val secondFragment = stimulateFragment()
//        val thirdFragment = articleFragment()
//        val fourthFragment = ProfileFragment()
//
//        setContentView(binding.root)
//        setCurrentFragment(firstFragment)
//
//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId) {
//                R.id.miHome -> setCurrentFragment(firstFragment)
//                R.id.miStimulate -> setCurrentFragment(secondFragment)
//                R.id.miArticle -> setCurrentFragment(thirdFragment)
//                R.id.miProfile -> setCurrentFragment(fourthFragment)
//
//                else ->{
//
//                }
//            }
//            true
//        }
//    }
//
//
//    private fun setCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, fragment)
//            commit()
//        }
    }

    private fun setupTab(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "")
        adapter.addFragment(StimulateFragment(), "")
        adapter.addFragment(ArticleFragment(), "")
        adapter.addFragment(UserFragment(), "")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_stimulate)
        binding.tabs.getTabAt(2)!!.setIcon(R.drawable.ic_article)
        binding.tabs.getTabAt(3)!!.setIcon(R.drawable.ic_profile)


    }
}