package com.example.materialexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.materialexample.databinding.ActivitySnackbarBinding
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySnackbarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.showing.setOnClickListener {
            //diferença do toast: ao invés de aceitar um contexto, aqui ele vai aceitar uma view
            Snackbar.make(it, "Click no primeiro botão", Snackbar.LENGTH_SHORT)
                .show()
        }

        binding.action.setOnClickListener {
            Snackbar.make(it, "O segundo botão foi clicado!!", Snackbar.LENGTH_LONG)
                //se ele vai ter uma ação, ele vai ter um callback
                .setAction("Go") {
                    Log.e("TAG", "onCreate: Clicou na ação" )
                }
                .show()
        }
    }
    companion object {
        fun createIntent(context: Context) = Intent(context, SnackbarActivity::class.java)
    }

}
