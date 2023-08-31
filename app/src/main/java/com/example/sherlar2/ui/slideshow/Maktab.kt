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
import com.example.sherlar2.databinding.FragmentMaktabBinding
import com.example.sherlar2.databinding.FragmentSevgiBinding
import com.example.sherlar2.databinding.FragmentSlideshowBinding
import com.example.sherlar2.model.model


class Maktab : Fragment() {

    private var _binding: FragmentMaktabBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaktabBinding.inflate(inflater, container, false)
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
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            } else if (pos == 1) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            } else if (pos == 2) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            } else if (pos == 3) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            }
            else if (pos == 4) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            } else if (pos == 5) {
                val bundle = bundleOf("model" to it)
                findNavController().navigate(R.id.action_maktab_to_SHerFragment, bundle)
            }
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(
                R.drawable.img_5, "Maktab", "Qani endi qaytsam edi maktab davriga \n" +
                        " Har kun uzib berar edim gul uning qo`liga \n" +
                        " Maktab davrida sevmoq na qadar go`zal \n" +
                        " Qizlarni labidan tomar bol oqar asal", ""
            ),
            model(
                R.drawable.img_5, "So'ngi qo'ng'iroq", "Yuragimda bu kun cheksiz ehtirom, \n" +
                        " Yuragimdan chiqar dil izxorlarim. \n" +
                        " Opalarim akalarim ketishar bu kun, \n" +
                        " Chunki chalinmoqda so`ngi qo`ng`iroq. \n" +
                        "\n" +
                        " Dillarni titratib so`ngi qo`ng`roq, \n" +
                        " Maktab dargohidan qiladi yiroq. \n" +
                        " Ustozlarim ko`zidan tirqiraydi yosh, \n" +
                        " Chunki chalinmoqda so`ngi qo`ng`iroq. \n" +
                        "\n" +
                        " Ko`zimdan qalqiydi quvonch yoshlarim, \n" +
                        " Maktab dargohini tark etar bu kun. \n" +
                        " Yangi hayotga ham qo`yishar qadam, \n" +
                        " Chunki chalinmoqda so`ngi qo`ng`iroq. \n" +
                        "\n" +
                        " Men ham bir kun kelib tark etarman deb, \n" +
                        " Ustozim ko`ziga mayus boqaman. \n" +
                        " Opalarim maktabni tark etib ketdi, \n" +
                        " Chunki chalinmoqda so`ngi qo`ng`roq. \n" +
                        "\n" +
                        " Maktab dargohini tark etib ketish, \n" +
                        " Men uchun azobdir bu axir azob. \n" +
                        " Yuragimni ezar og`ir bir qiynoq, \n" +
                        " Chunki chalinmoqda so`ngi qo`ng`iroq", ""
            ),
            model(
                R.drawable.img_5,
                "So'ngi qo'ng'iroq 25 - may",
                "Bu oqshom osmonda yulduz yig`laydi \n" +
                        " Ko`k aro to`lin oy unsiz yig`laydi \n" +
                        " Majnuntol yonida maktab bog`ida \n" +
                        " Yurakda dard bilan bir qiz yig`laydi \n" +
                        "\n" +
                        " Bunchalar yuraklarga solasan titroq chalinmay qo`yaqol \n" +
                        " ``So`nggi qo`ng`iroq`` \n" +
                        " Ayriliq onlari bunchalar azob \n" +
                        " Chalinmay qo`yaqol ``So`nggi qo`ng`iroq`` \n" +
                        "\n" +
                        " Aytilmay qoldiku aytilmas gaplar \n" +
                        " Goh oshkor goh pinhon bitilgan xatlar \n" +
                        " Bir bora yurakdan chiqmagan suhbat \n" +
                        " Ranglar sarg`ayib ko`nglimni ezar \n" +
                        "\n" +
                        " Qizlar qo`lidagi estalik daftar \n" +
                        " Nahot armonga aylansa endi \n" +
                        " Sinfdosh qiz bilan tushgan suratlar \n" +
                        " Bunchalar yuraklarga solasan titroq \n" +
                        "\n" +
                        " Chalinmay qo`yaqol ``So`nggi qo`ng`iroq`` \n" +
                        " Ayrilgim kelmaydi munis maktabdan \n" +
                        " Ko`nglimga abadiy yoqding sen chiroq \n" +
                        " Yashirgim kelmaydi men ham yoshlarim \n" +
                        "\n" +
                        " Chalinmay turaqol ``So`nggi qo`ng`iroq`` \n" +
                        " Nelar kutmoqda bizlarni hali \n" +
                        " Qayg`uli muhabbat, xijronli firoq \n" +
                        " Nahot tark etmoqda sho`xli davrimiz \n" +
                        " Chalinmay turaqol ``So`nggi qo`ng`iroq``",
                ""
            ),
            model(
                R.drawable.img_5, "Maktabdagi qiz", "Olganimda maktab tomon yo`l, \n" +
                        " Uchratardim hamon bir qizni. \n" +
                        " Tikilib qolardim ko`rganda go`yo, \n" +
                        " Aytmoqchi bo`lgandek bir so`zni. \n" +
                        "\n" +
                        " Uchrasha olmasdim qizla bemalol, \n" +
                        " Ta`qibli nazarlar qo`ymas edi tinch. \n" +
                        " Tabassumla boqsa ba`zan u xushhol, \n" +
                        " Oydek jamoliga to`yolmasdim hech. \n" +
                        "\n" +
                        " Hayot esa davom etardi, \n" +
                        " Va lek aytolmasdim ushbu so`zimni. \n" +
                        " Chiqib qolganda u yo`limdan nogoh, \n" +
                        " Uzolmasdim undan yana ko`zimni.", ""
            ),
            model(
                R.drawable.img_2, "Maktabim!", " Maktabim bag`ringda o`ynab yurgandim, \n" +
                        " Ilk sevgi hayolin o`zingda surdim. \n" +
                        " Katta bo`lishga ham qachon ulgurdim, \n" +
                        " Bu savol javobin topib ber maktab. \n" +
                        "\n" +
                        " Yodimda darslarda yozgan xatlarim, \n" +
                        " Yuraklar rasmiga to`lgan daftarim. \n" +
                        " Doim tergab turgan sinf rahbarim, \n" +
                        " Qadringni sanog`in topib ber maktab. \n" +
                        "\n" +
                        " Farzanding ulg`aydi bu sening bahting, \n" +
                        " O`n bir yil shaxt berdi onalik mehring. \n" +
                        " Ko`zimga qadrdon har bir daraxting, \n" +
                        " Mehringning adog`in topib ber maktab. \n" +
                        "\n" +
                        " Bag`ringdan ketyapmiz uchib xar tomon, \n" +
                        " Qochgan darslarimiz biz uchun armon. \n" +
                        " Bilimlar ulashgan bilimdon makon, \n" +
                        " O`zingdek ardog`in topib ber maktab. \n" +
                        "\n" +
                        " Kelajak xayotda sening yuzingmiz, \n" +
                        " Bir biridan erka o`g`il qizingmiz. \n" +
                        " Sen bilan qoladi bizning mehrimiz, \n" +
                        " Biz uchun bir umr qolib ber maktab.", ""
            ), model(
                R.drawable.img_2, "Maktab sevgisi", "Bir sinfda o`qib yonma-yon, \n" +
                        " O`tkazdik bir be parvo yilni. \n" +
                        " Bilmay qoldim qay laxza qay on, \n" +
                        " Bong urganin senga ko`nglimni. \n" +
                        "\n" +
                        " Sung tarqaldik bizlar xartomon baxt izlagan yulchi singari, \n" +
                        " Seni juda sogindim ishon. Qancha olis ketganim sari. \n" +
                        " Yillar utdi daryoday oqib. Mani ortdga qaydgim keladi. \n" +
                        " Sani guzal kuzinga boqib.sevaman deb aytgim keladi", ""
            ),
        )
    }
}