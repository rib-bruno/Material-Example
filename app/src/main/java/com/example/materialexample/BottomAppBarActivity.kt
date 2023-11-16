package com.example.materialexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialexample.databinding.ActivityBottomAppBarBinding
import com.example.materialexample.extensions.toast

class BottomAppBarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBottomAppBarBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.bottomAppBar.setNavigationOnClickListener {
            toast("Cliclou no menu de navegação")
        }

        binding.bottomAppBar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.favorite -> {
                    toast("favoite")
                    true
                }
                R.id.search -> {
                    toast("search")
                    true
                }
                R.id.more -> {
                    toast("more")
                    true
                }
                else -> false
            }
        }

    }

    companion object {
        fun createIntent(context: Context) = Intent(context, BottomAppBarActivity::class.java)
    }

}
