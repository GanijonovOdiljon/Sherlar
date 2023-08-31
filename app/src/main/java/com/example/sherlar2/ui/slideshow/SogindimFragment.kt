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
import com.example.sherlar2.databinding.FragmentSevgiBinding
import com.example.sherlar2.databinding.FragmentSogindimBinding
import com.example.sherlar2.model.model


class SogindimFragment : Fragment() {
    private var _binding: FragmentSogindimBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSogindimBinding.inflate(inflater, container, false)
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
                findNavController().navigate(R.id.action_sogindimFragment_to_SHerFragment, bundle)
            }else if(pos == 1){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sogindimFragment_to_SHerFragment, bundle)
            }else if (pos == 2){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sogindimFragment_to_SHerFragment, bundle)
            }else if (pos == 3){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sogindimFragment_to_SHerFragment, bundle)
            }
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(
                R.drawable.img_5, "Uyg'onganda", "Uygonganda eshitar sozim,\n" +
                        "Seni jondan yaxshi koraman!\n" +
                        "Ozgasini kormaydi kozim,\n" +
                        "Men ham sizni yaxshi koraman.\n" +
                        "\n"+
                        "Qalbim ishqqa belagan inson.\n" +
                        "Qulogimga qadirdon sozi,\n" +
                        "Men nodonni telbaday suygan,\n" +
                        "Hammadan ham Mehribon ozi.\n" +
                        "\n"+
                        "Sevasanmi degan savoldan,\n" +
                        "Ayta-ayta topolmaganimsiz.\n" +
                        "Dardin to`kib solmaganmisiz?",""
            ),
            model(
                R.drawable.img_5, "Sevdim", "Sog`insamda yurak yutib,\n" +
                        "Men yoningga bormay sevdim,\n" +
                        "Sevganimni pinxon tutib,\n" +
                        "Senga dilim yormay sevdim.",""
            ),
            model(
                R.drawable.img_5,
                "Sog'indim",
                "Sogingim tunlari uyqu qochganda,\n" +
                        "Sogindim xar nafas yodga olganda,\n" +
                        "Sogindim kuzlarim bir zum yumganda,\n" +
                        "Sogindim yuraklar duk duk urganda",
                ""
            ),
            model(
                R.drawable.img_5, "Shevgi sharobi", "Sogingim tunlari uyqu qochganda,\n" +
                        "Sogindim xar nafas yodga olganda,\n" +
                        "Sogindim kuzlarim bir zum yumganda,\n" +
                        "Sogindim yuraklar duk duk urganda", ""
            )
        )
    }
}