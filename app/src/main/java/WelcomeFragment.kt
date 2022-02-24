package com.example.lottietraining.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lottietraining.databinding.FragmentWelcomeBinding
import com.example.lottietraining.presentation.adapter.ClientChoiceAdapter
import com.example.lottietraining.presentation.viewmodel.ClientChoiceViewModel

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(
    FragmentWelcomeBinding::inflate
) {
//    private val clientChoiceViewModel: ClientChoiceViewModel by viewModels {
//        ClientChoiceViewModel.Factory()
//    }

    private val clientChoiceViewModel: ClientChoiceViewModel by viewModels()

    private var adapter: ClientChoiceAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val clientChoiceAdapter = ClientChoiceAdapter()
        this.adapter = clientChoiceAdapter

        binding.apply {
            rcClientChoice.layoutManager = LinearLayoutManager(requireContext())
            rcClientChoice.adapter = clientChoiceAdapter

        }

        clientChoiceViewModel.clientChoice.observe(viewLifecycleOwner) {
            Log.d("AAA", "$it")
            adapter?.submitList(it)
        }
    }
}