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
import com.example.sherlar2.databinding.FragmentDostlikBinding
import com.example.sherlar2.databinding.FragmentSevgiBinding
import com.example.sherlar2.databinding.FragmentSlideshowBinding
import com.example.sherlar2.model.model


class Dostlik : Fragment() {

    private var _binding: FragmentDostlikBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDostlikBinding.inflate(inflater, container, false)
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
                findNavController().navigate(R.id.action_dostlik_to_SHerFragment, bundle)
            } else if (pos == 1) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_dostlik_to_SHerFragment, bundle)
            } else if (pos == 2) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_dostlik_to_SHerFragment, bundle)
            } else if (pos == 3) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_dostlik_to_SHerFragment, bundle)
            }
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(
                R.drawable.img_5, "Sog'indim demang", "Sog`indingmi demang sog`inish gapmi, \n" +
                        " Sizni sog`inmagan yurak yurakmi, \n" +
                        " Do`stlik men uchun yashash demakdir, \n" +
                        " Ahir siz-siz menga hayot kerakmi!", ""
            ),
            model(
                R.drawable.img_5, "Do'stlarim", "Tunlari titrasa yurakda zorim. \n" +
                        " Tilimda yangrasa dilimda borim. \n" +
                        " Qalbimdagi eng ezgu niyatlar bilan. \n" +
                        " Xammaga xayrli tun deyman sizga Do`stlarim!!!", ""
            ),
            model(
                R.drawable.img_5,
                "Besh kunlik",
                "O`zi umr besh kunlik, \n" +
                        " Unda yolg`on ne kerak \n" +
                        " Mol-u dunyo bir pullik, \n" +
                        " Mexr istaydi yurak \n" +
                        "\n" +
                        " Yolg`izlik xos xudoga \n" +
                        " Bandaga bir juft kerak \n" +
                        " Yaxshi-yomon kuningda. \n" +
                        " Yoningda chin do`st kerak!!!",
                ""
            ),
            model(
                R.drawable.img_5, "Baxtli etmasang", "D-o`stim senga eslash uchun deb, \n" +
                        " 'O'-lmas dilga yozdim sahifa. \n" +
                        " 'S'-evgi qalbga tushar yil sayin, \n" +
                        " 'T'-ayyorladim arzimas sovg`a. \n" +
                        "\n" +
                        " 'I'-shingizda rivoj tilayman, \n" +
                        " 'M'-uhabbatda baxtiyor bo`ling. \n" +
                        " 'G'-archi qarib 100ga kirganda, \n" +
                        " 'A'-srang buni avaylab qo`ying!. \n" +
                        "  \n" +
                        "  \n" +
                        " 'S'-evgi qalbga tushar yil sayin, \n" +
                        " 'T'-ayyorladim arzimas sovg`a. \n" +
                        " 'I'-shingizda rivoj tilayman, \n" +
                        " 'M'-uhabbatda baxtiyor bo`ling. \n" +
                        "\n" +
                        " 'G'-archi qarib 100ga kirganda, \n" +
                        " 'A'-srang buni avaylab qo`ying!. \n" +
                        " '> 'S'-evgi qalbga tushar yil sayin, \n" +
                        " 'T'-ayyorladim arzimas sovg`a. \n" +
                        "\n" +
                        " 'I'-shingizda rivoj tilayman, \n" +
                        " 'M'-uhabbatda baxtiyor bo`ling. \n" +
                        " 'G'-archi qarib 100ga kirganda, \n" +
                        " 'A'-srang buni avaylab qo`ying!. \n" +
                        "\n" +
                        " Xandon otib kulmasang, yig`latma meni. \n" +
                        " Agar obod qilmasang, qaqshatma meni. \n" +
                        " Agar baxtli etmasang, baxtim azaldan. \n" +
                        " Agar shodli qilmasang, buzlatma meni. \n" +
                        " '> \n" +
                        " Uzing dunyo kurmasdan, dunyo vada qilmagin. \n" +
                        " Daryo kurmay tashnasan, \n" +
                        " tulqin vada qilmagin. \n" +
                        " Bajarmaysan, bajarmaysan. \n" +
                        "  \n" +
                        " Sarson qilma mani. \n" +
                        " Yaramaysan, yaramaysan. \n" +
                        " Vayron qilma mani.", ""
            )
        )
    }
}