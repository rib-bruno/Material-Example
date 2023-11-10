package com.example.materialexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.materialexample.databinding.BottomSheetModalBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottomSheet : BottomSheetDialogFragment() {

    private val binding by lazy {
        BottomSheetModalBinding.inflate(LayoutInflater.from(requireContext()))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        return binding.root
    }

    //startar o bottom
    companion object {
        private const val TAG = "ModalBottomSheet"

        fun start(manager: FragmentManager) {
            ModalBottomSheet().show(manager, TAG)
        }
    }


}