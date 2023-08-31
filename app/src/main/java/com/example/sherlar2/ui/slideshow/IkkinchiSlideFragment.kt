package com.example.sherlar2.ui.slideshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sherlar2.R
import com.example.sherlar2.adapter.Adapter
import com.example.sherlar2.databinding.FragmentIkkinchiSlideBinding
import com.example.sherlar2.databinding.FragmentSlideshowBinding
import com.example.sherlar2.model.model


class IkkinchiSlideFragment : Fragment() {
    private var _binding: FragmentIkkinchiSlideBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIkkinchiSlideBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler1.adapter = adapter2
        binding.recycler1.layoutManager = LinearLayoutManager(requireContext())
        adapter2.submitList(list())

        adapter2.onClick = { it, pos ->
            if (pos == 0) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_ikkinchiSlideFragment_to_sevgiFragment, bundle)
            }else if (pos == 1 ){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_ikkinchiSlideFragment_to_sogindimFragment, bundle)
            }else if (pos == 2 ){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_ikkinchiSlideFragment_to_maktab, bundle)
            }else if (pos == 3 ){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_ikkinchiSlideFragment_to_dostlik, bundle)
            }
        }
    }

    private fun list(): List<model> {
        return listOf(

            model(R.drawable.img, "Sevgi", "", ""),
            model(R.drawable.img, "Sog'indim", "", ""),
            model(R.drawable.img, "Maktab", "", ""),
            model(R.drawable.img, "Do'stlik", "", ""),
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}