package com.example.materialexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materialexample.databinding.ActivityTopAppBarBinding
import com.example.materialexample.extensions.toast

class TopAppBarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTopAppBarBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.topAppBar.setNavigationOnClickListener {
            toast("Cliclou no menu de navegação")
        }

        binding.topAppBar.setOnMenuItemClickListener {
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
        fun createIntent(context: Context) = Intent(context, TopAppBarActivity::class.java)
    }

}
