package com.example.materialexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.materialexample.databinding.ActivityBottomNavigationBinding
import com.example.materialexample.fragments.HomeFragment
import com.example.materialexample.fragments.StartsFragment

class BottomNavigationActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBottomNavigationBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> openFragment(HomeFragment.newInstance())
                R.id.stars -> openFragment(StartsFragment.newInstance())
            }
            true
        }
        //já vai começar selecionado na home
        binding.bottomNavigation.selectedItemId = R.id.home
    }

    //replace do fragment
    private fun openFragment(fragment: Fragment) {
       val transaction =  supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit() //vai substituir

    }

    companion object {
        fun createIntent(context: Context) = Intent(context, BottomNavigationActivity::class.java)
    }

}
