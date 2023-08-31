package com.example.sherlar2.ui.slideshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sherlar2.R
import com.example.sherlar2.databinding.FragmentSHerBinding
import com.example.sherlar2.model.model


class SlideSherFragment : Fragment(R.layout.fragment_slide_sher) {
    private var name: FragmentSHerBinding? = null
    private val binding get() = name!!
    private var model: model? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = arguments?.getParcelable("model")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        name = FragmentSHerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        model?.let { model ->
            binding.textnom.text = model.text
            binding.textsher.text = model.text1
        }
    }
}