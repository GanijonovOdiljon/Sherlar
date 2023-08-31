package com.example.sherlar2.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sherlar2.R
import com.example.sherlar2.adapter.Adapter
import com.example.sherlar2.databinding.FragmentHomeBinding
import com.example.sherlar2.databinding.FragmentSlideshowBinding
import com.example.sherlar2.model.model

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.adapter = adapter2
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        adapter2.submitList(list())

        adapter2.onClick = { it, pos ->

            if (pos == 1){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_tilbtn_to_ikkinchiSlideFragment, bundle)
            }
            val bundle = bundleOf("model" to it)
            findNavController().navigate(R.id.action_tilbtn_to_ikkinchiSlideFragment, bundle)
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(R.drawable.img, "O'zbek", "", ""),
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}