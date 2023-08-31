package com.example.sherlar2.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sherlar2.R
import com.example.sherlar2.adapter.Adapter
import com.example.sherlar2.databinding.FragmentSevgiBinding
import com.example.sherlar2.databinding.FragmentSlideshowBinding
import com.example.sherlar2.model.model


class SevgiFragment : Fragment() {

    private var _binding: FragmentSevgiBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSevgiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler2.adapter = adapter2
        binding.recycler2.layoutManager = LinearLayoutManager(requireContext())
        adapter2.submitList(list())

        adapter2.onClick = { it, pos ->

            if (pos == 0) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sevgiFragment_to_SHerFragment, bundle)
            }else if(pos == 1){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sevgiFragment_to_SHerFragment, bundle)
            }else if (pos == 2){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sevgiFragment_to_SHerFragment, bundle)
            }else if (pos == 3){
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_sevgiFragment_to_SHerFragment, bundle)
            }
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(
                R.drawable.img_5, "Seva Boshlayman", "Yeat shuncha sukut saqladim,\n" +
                        "Yuragimni so`kib tashlayman,\n" +
                        "Odamlarday ochiqchasiga,\n" +
                        "Jonim, seni seva boshlayman.", ""
            ),
            model(
                R.drawable.img_5, "Sevgi Azobi", "Qachon tugar sevgi azobi?\n" +
                        "Qachon yetgun osha tilakka?\n" +
                        "Tinmay faqat seni sorasa\n" +
                        "Ne deb javob beray yurakka?", ""
            ),
            model(
                R.drawable.img_5,
                "Sevgilim G'am Chekma",
                "Sevgilim gam chekma, qalbim be armon.\n" +
                        "Talpinar tunu-kun yolgiz sen tomon.\n" +
                        "Dilimni tirnaydi tikanli armon:\n" +
                        "Sogindim ozingni juda ham yomon.",
                ""
            ),
            model(
                R.drawable.img_5, "Aybdor", "Kimnidur soginsa yurakmi aybdor?\n" +
                        "Kimnidur kutsachi, kozmi aybdor?\n" +
                        "Kim-u gunohkor jazoga loyiq,\n" +
                        "Yurak sizni sog`insa menmi aybdor?", ""
            )
        )
    }
}