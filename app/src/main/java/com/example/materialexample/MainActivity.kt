package com.example.materialexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        //fazendo o binding de nossos listeners
        insertListeners()
    }

    private fun insertListeners() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this))
        }

        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
        }

        binding.cvBottomSheets.setOnClickListener {
            ModalBottomSheet.start(supportFragmentManager)
        }

        binding.cvTopAppBar.setOnClickListener {
            startActivity(TopAppBarActivity.createIntent(this))
        }

        binding.cvBottomAppBar.setOnClickListener {
            startActivity(BottomAppBarActivity.createIntent(this))
        }

    }
}