package com.example.sherlar2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sherlar2.databinding.FragmentSHerBinding
import com.example.sherlar2.model.model
import com.example.sherlar2.ui.home.HomeFragment


class SHerFragment : Fragment(R.layout.fragment_s_her) {
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
        name = FragmentSHerBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        model?.let {model ->

            binding.textnom.text = model.text
            binding.textsher.text = model.text1
        }
    }
 }