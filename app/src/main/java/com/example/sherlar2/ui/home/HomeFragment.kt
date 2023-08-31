package com.example.sherlar2.ui.home

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
import com.example.sherlar2.databinding.FragmentHomeBinding
import com.example.sherlar2.model.model

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter2 by lazy { Adapter() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.adapter = adapter2
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        adapter2.submitList(list())

        adapter2.onClick = { it ,pos->
            val bundle = bundleOf("model" to it)
            findNavController().navigate(R.id.action_asosiy_to_SHerFragment, bundle)
        }
    }

    private fun list(): List<model> {
        return listOf(
            model(
                R.drawable.img,
                "Diydorni unutib qoymayapmizmi",
                "Mushkulim borida tog’ bo’lgan jo’ra\n" +
                        "Yaqinsiz siz menga har kimdan ko’ra\n" +
                        "Oqibat yo’qolib endi bir yo’la\n" +
                        "Diydorni unutib qo’ymayabmizmi\n" +
                        "\n" +
                        "Sevinch yoshlariga to’lib bu ko’zlar\n" +
                        "Bolalik onidan bir ertak so’zlar\n" +
                        "Riyoga berilib endi ey do’stlar\n" +
                        "Diydorni unutib qo’ymayabmizmi\n" +
                        "\n" +
                        "Yelkadosh do’stlarim ey ulfatlarim\n" +
                        "Bugun bu maydonda holimiz yarim\n" +
                        "Ko’rinib turing ey endi jigarim\n" +
                        "Diydorni unutib qo’ymayabmizmi\n" +
                        "\n" +
                        "Intizor ko’ngilni intizor etib\n" +
                        "Musofir yurtlarga qolibsiz ketib\n" +
                        "Do’stingiz oldiga tez keling yetib\n" +
                        "Diydorni unutib qo’ymayabmizmi\n" +
                        "\n" +
                        "Sher bo’lib men mardman deying mayli ho’p\n" +
                        "Siz uchun savollar keragidan ko’p\n" +
                        "Bir bora jigarlar bo’ling endi to’p\n" +
                        "Diydorni unutib qo’ymayabmizmi\n", ""
            ),
            model(
                R.drawable.img, "Ey hayot", "Qaldirg’och bo’lsamda uchsam keng samo\n" +
                        "Bulutning qoshiga tegsa qanotim\n" +
                        "Vujudimda o’ylar bir telbanamo\n" +
                        "Nahotki shu ekan mening hayotim\n" +
                        "\n" +
                        "Hapqirib uchgan o’sha ming bir satrlar\n" +
                        "Olis tarixlardan kelgan surondir\n" +
                        "Charxpalak misoli aylanib yillar\n" +
                        "Uchqunlar jilosin tutgan olovdir\n" +
                        "\n" +
                        "Bugun bo’shliq endi bugun sukunat\n" +
                        "Tegramda ming turfa o’ylar hukumron\n" +
                        "Taqdirdan nolimay, nolimay faqat\n" +
                        "Endi oila deb yashayin har on\n" +
                        "\n" +
                        "Qalbimga ozimni ko’mib qo’ymasdan \n" +
                        "Hayotim deya men kurashay endi\n" +
                        "Ko’ngillar fig’onin dilga yo’ymasdan \n" +
                        "Qadringga yetayin ey hayot seni\n", ""
            ),
            model(
                R.drawable.img, "Musulmon ahli", "G’animat dunyoning bu subhi uzra \n" +
                        "Dasht-u sar sahrolar kezmadim hali\n" +
                        "Hayollar og’ushi ummonlar suza\n" +
                        "Husumat-u, kibrdan o’tmadim nari\n" +
                        "\n" +
                        "Nabotot olami keng va bepayon\n" +
                        "Razolat botqog’i yondirar olov\n" +
                        "Qismatlar taqdiri bo’lganda ayon\n" +
                        "Yuragim to’ri ham yonar edi lov\n" +
                        "\n" +
                        "Bemajol ko’nglimni xotirjam tutmoq\n" +
                        "Qiyin bir masala bo’ldi-ku endi\n" +
                        "Bu rixlat vodiysin esa unutmoq\n" +
                        "Bezaksiz yastangan biro lam edi\n" +
                        "\n" +
                        "Naxot o’tkazar zulm insonga inson\n" +
                        "Gumrohlik qilmagin ey g’ofil banda \n" +
                        "Hamroh bo’lsin senga har doim iymon\n" +
                        "Shaxodat keltirgin jon bo’lsa tanda\n" +
                        "\n" +
                        "Nurli bu oshyonga nur bezak bo’lgan \n" +
                        "Musulmon ahliga qutlovlar ming bor\n" +
                        "Qalblari islomning nuriga to’lgan \n" +
                        "Boshlari sajdada mo’mini bisyor\n" +
                        "\n" +
                        "Mazlumlarga ishonch yov uchun o’lim\n" +
                        "Muslimlar qalban bir diyonatda ham \n" +
                        "Bag’ri keng qalblarga jannati so’lim\n" +
                        "Inshalloh birgamiz qiyomatda ham\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Onam uchun", "Gulim so’lmay turgin onam kulgunicha \n" +
                        "Farzandlarin kamolini ko’rgunicha\n" +
                        "Hasta yurak armonlari to’lgunicha\n" +
                        "Gulim so’lmay turgin endi onam uchun\n" +
                        "\n" +
                        "Menku g’arib ul vasfida zor yig’ladim\n" +
                        "Bolalikda qolib ketdi armonlarim\n" +
                        "Meni deya hasta bo’lgan ko’ngli yarim\n" +
                        "Gulim so’lmay turgin endi onam uchun\n" +
                        "\n" +
                        "Tunlar bedor halovat yo’q uyqusida\n" +
                        "Bolam deydi duosi-yu har so’zida \n" +
                        "Nur ham qolmay masumgina bu ko’zida\n" +
                        "Gulim so’lmay turgin endi onam uchun\n" +
                        "\n" +
                        "Faryodlarim yetib borsa samoga ham \n" +
                        "Sen yig’lama onang borku axir bolam \n" +
                        "Jannatlardan ifor bergan munis onam \n" +
                        "Gulim so’lmay turgin endi onam uchun\n" +
                        "\n" +
                        "Matonatning timsolisiz sodda onam\n" +
                        "Chakkangizga yarashibdi rayxonlar ham\n" +
                        "Gul yuzingiz siypalaydi tonggi shabnam\n" +
                        "Gulim so’lmay turgin endi onam uchun \n", ""
            ),
            model(
                R.drawable.img,
                "Ey ona vatanim boringa shukur",
                "Buyuk siymolarning buyuk qo’rg’oni \n" +
                        "Ne-ne shaxidlarnig yotibdi joni\n" +
                        "Gullarga burkangan to’rtta tomoni\n" +
                        "Ko’ksimda gullagan poyonlaring hur\n" +
                        "Ey ona vatanim boringga shukur\n" +
                        "\n" +
                        "Bu keng jahonda sen zalvorla turib \n" +
                        "Javhar ila yurtni yangidan qurib\n" +
                        "Yosh bir nihol ekib farzand o’stirib\n" +
                        "Sen bu maydon ichra endi dadil tur \n" +
                        "Ey ona vatanim boringga shukur\n" +
                        "\n" +
                        "Million gul rayxoni bog’larga tutash\n" +
                        "Asrlar armoni dillarda yupanch\n" +
                        "Vataning imkoni aylamadi ranj\n" +
                        "Avlodlar ongida yashnar tafakkur\n" +
                        "Ey ona vatanim boringga shukur\n" +
                        "\n" +
                        "Ko’ngillar mavjlandi vatan ohlar\n" +
                        "Jamoli vasfingda bo’lib nigohlar \n" +
                        "Tuprog’ingga ko’zyosh to’kilgan chog’lar\n" +
                        "Shams – u dilyor yurtim senga tashakkur\n" +
                        "Ey ona vatanim boringga shukur\n" +
                        "\n" +
                        "Sarchashma diyorim tuprog’ing surtib\n" +
                        "O’g’loning bo’lay har soniya kutib\n" +
                        "Viqorla yuksakda bayrog’ing tutib\n" +
                        "Boshimda jarang sochgan o’sha shuur\n" +
                        "Ey ona vatanim boringga shukur\n", ""
            ),
            model(
                R.drawable.img, "Chaqaloq", "Samolar ham titraydi shu on\n" +
                        "Sevinch Yoshi to’kilar har yoq\n" +
                        "Vujudiga kirganida jon\n" +
                        "Bu olamga kelar chaqaloq\n" +
                        "\n" +
                        "Yig’lar ekan tug’ilgan zahot\n" +
                        "Ummonlardan sadosi kelar\n" +
                        "Shu lahzadan boshlanib hayot \n" +
                        "Shamollarda ingrashi yelar\n" +
                        "\n" +
                        "Ey chaqaloq murg’ak bir vujud\n" +
                        "Diling kulib yursin hamisha\n" +
                        "Bu dunyoning g’amlarin unut\n" +
                        "Yaxshilikka talpinib yasha \n" +
                        "\n" +
                        "Bunchalar ham bo’lma bag’ritosh \n" +
                        "Yuraginga iymoning solgin\n" +
                        "Saxiy bo’lgin erisin quyosh\n" +
                        "Ota – onang duosin olgin\n" +
                        "\n" +
                        "Ig’volardan bo’lib sen nari\n" +
                        "Vatan degan mard bir o’g’lon bo’l\n" +
                        "Qadam tashlab kelajak sari\n" +
                        "Maqsadinga topgaydirsan yo’l\n", ""
            ),
            model(
                R.drawable.img, "Onam", "Jannatga tutashgan qalbi cheksizim\n" +
                        "Umrimga sayqallik bergan farishtam\n" +
                        "Butun bu olamda yakka tengsizim\n" +
                        "Dunyoni iforga bezar sarishtam\n" +
                        "\n" +
                        "Boshimni silagan umrim tilagan\n" +
                        "Bolajonim deb tinmagan har on\n" +
                        "O’g’li uchun hatto tin ham olmagan\n" +
                        "Doim duogo’yim bo’ling onajon\n" +
                        "\n" +
                        "Halovat yo’q sizda tunlari bedor\n" +
                        "Murg’ak qalbim uchun mudom parvonam\n" +
                        "Meni deya axir cheksa ham ozor\n" +
                        "Kulib turib ichida yig’lagan onam\n" +
                        "\n" +
                        "Million bahorning nafosatidan \n" +
                        "Bir tabassumingiz naqadar go’zal\n" +
                        "Husningiz jarangi latofatidan \n" +
                        "Majnuntol visoli bo’ladi o’sal\n" +
                        "\n" +
                        "Mehringiz daryodir qalbi quyoshim\n" +
                        "Matonat timsoli qadog’ kaftingiz\n" +
                        "Hayotdan umidsiz to’kilsa yoshim\n" +
                        "Malham erur menga iliq taftingiz\n" +
                        "\n" +
                        "Gullardan payondoz to’shayin sizga \n" +
                        "Fazolarda tanho o’zi yagonam\n" +
                        "Foniy zamon uzra oy bo’lib bizga \n" +
                        "Boqiylikda quyosh bo’lingiz onam\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Bir so'z", "Bir so’z inson ko’nglini\n" +
                        "Shodu hursand etadi\n" +
                        "Topolmasa yo’lini\n" +
                        "Yovuzlikka eltadi\n" +
                        "\n" +
                        "Bir so’z maxtal bog’larning\n" +
                        "Shon-shuhratin oshirar\n" +
                        "Bir so’z baland tog’larning\n" +
                        "Poymonsin toshirar\n" +
                        "\n" +
                        " Arang turgan xarsangtosh\n" +
                        "Bir so’z ila quladi\n" +
                        "O’z bag’riga qo’yar bosh\n" +
                        "Taqdiri ne bo’ladi\n" +
                        "\n" +
                        "So’z qudrati har zamon\n" +
                        "Yuksaklarda jaranglar\n" +
                        "So’z boyiydi va hamon\n" +
                        "Qudrat erur qaranglar\n" +
                        "\n" +
                        "Rutubat cheksa ko’ngil\n" +
                        "Demak biling so’z Malham\n" +
                        "Bul oshyonda esa dil\n" +
                        "Malham bo’lur sizga ham\n" +
                        "\n" +
                        "Inson ko’nglini,obod etgusi ham o’sha so’z\n" +
                        "Onikim qarang,vayron etgusi ham o’sha so’z\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Andijon", "Bir yurt tuprog’ida gullaydi oltin\n" +
                        "Zarhal kitoblarda bitilgan doston\n" +
                        "Yurtiga ayovsiz bo’lsada bosqin\n" +
                        "Bir musht bo’lib yenggan yurtdir andijon\n" +
                        "Yurtlar ichra o’zing  yurti shohimsan\n" +
                        "Bo’ynimda tumorim Andijonimsan\n" +
                        "\n" +
                        "G’ururi osmonim metinqalb qo’rg’on \n" +
                        "Parvozda yuksagu ko’ngli bir ummon\n" +
                        "Iymoni diliga bolsa magar jo \n" +
                        "G’animning ishonchi poymona shu on \n" +
                        "Olamlar ko’shkida o’zing bir jahon\n" +
                        "Mahobat bobida tengsiz Andijon\n" +
                        "\n" +
                        "Nigohlarga qadar qadalgan bu yosh \n" +
                        "Qalbimni yemirib borayotgan g’am\n" +
                        "Bu otash sinovga berolmay bardosh\n" +
                        "Seni sog’indi-ku boburlaring ham\n" +
                        "Talpingan yurakni qiynama hijron \n" +
                        "O’zinga intizor etma Andijon\n" +
                        "\n" +
                        "Jilvagar olam aro endi yoshlar\n" +
                        "Oltin asr yaratdi nurli kelajak\n" +
                        "Bul oshyonga yuksak qadamlar tashlar\n" +
                        "Yurtbosh yangi barpo etajak\n" +
                        "Yoshlar-la yangilanar endi zamon\n" +
                        "Buyuklikka qadam qo’ygan Andijon\n" +
                        "\n" +
                        "Kelajakka yuksak nazar tashlagan on\n" +
                        "O’tmish unut bo’lmagaydir bil hech qachon\n" +
                        "Boburiylar barpo etgan subhiy zabon \n" +
                        "Ko’nglimda bir qal’adursan ey Andijon\n" +
                        "Ko’nglim uzra suzgan oqqush o malagim \n" +
                        "Falakda sen jarang sochgan kamalagim \n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Alloh yagona", "Alloh yagona o’zi bilguvchi\n" +
                        "Yarim ko’ngilni butun qilguvchi\n" +
                        "Tog’dek azim gunohing bo’lsa\n" +
                        "Bilginki faqat ul kechirguvchi\n" +
                        "\n" +
                        "Do’zaxlardan darix tutguvchi\n" +
                        "Jannatlarga seni eltguvchi\n" +
                        "Namoz degan amal unutma\n" +
                        "Foniy oshyon bir zum o’tginchi\n" +
                        "\n" +
                        "O’zi berguvchidir o’zi olguvchi\n" +
                        "Yuraklarga iymon solguvchi\n" +
                        "Senga agar sinov bersa ham\n" +
                        "Mudom Raxiym dilda qolguvchi\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Ona sog'inchi", "Tushimda onamni ko’rdim men bir on \n" +
                        "Xayollari doim menga  parishon\n" +
                        "Misoli farishta juda mehribon\n" +
                        "Sofdil pok qalbi eng yaxshi inson \n" +
                        "Onamni qumsab yashayman har on\n" +
                        "\n" +
                        "Sog`inchim ming afsus bekordir endi\n" +
                        "Bu sog`inch onamga yetaklar meni\n" +
                        "Mening farishtam onam yo`q endi\n" +
                        "Sevinay ,sevinay nimadan endi\n" +
                        "Farishtang aslida onangdir seni \n" +
                        "\n" +
                        "Onang borligida yetgin qadriga \n" +
                        "Har azobiga  har bir dardiga \n" +
                        "U uchun nima qilding sen o`zi\n" +
                        "Onaning allasi-yu har bitta so’zi\n" +
                        "Murg`ak dillarning mehr qalb ko`zi\n" +
                        "\n" +
                        "Murg`ak dilimga oro bergan yor\n" +
                        "Dunyo menga gohi bo`lar juda tor\n" +
                        "Ko`nglimni payvandi ey dilozor  \n" +
                        "Allohdan umr berilsa bir bor \n" +
                        "Sizni asrardim ey onaizor \n" +
                        "\n" +
                        "Ko`nglim mushtoqdir, mushtoqdir sizga\n" +
                        "Qaytaman derdingiz doimo bizga \n" +
                        "Endi na derman o`g`lingizu qizingizga \n" +
                        "So`lmas gullar qo`yay qabringizga \n" +
                        "Mehr berolmay ketdingiz bizga\n" +
                        "\n" +
                        "Haftalar oylar ham o`tmoqda mana \n" +
                        "O`ksik qalbim kutadi yana \n" +
                        "Hisoblab adashdim har bitta sana \n" +
                        "Kutaman charchamay gavdamu tanam \n" +
                        "Ey mening soddadil ,soddadil onam\n" +
                        "\n" +
                        "Yulduzdek charaqlab menga parvona \n" +
                        "Oq yuvib  oq tarab har kuni yona \n" +
                        "Birgina singlim menga durdona \n" +
                        "Ey tinim bilmas jonimsiz ona\n" +
                        "Siz yo`q zulmat tubidir  xona\n" +
                        " \n" +
                        "Xayollarga bog`lanib sirli bu onlar \n" +
                        "Sizsiz o`tmoqda qayg`uli tonglar\n" +
                        "Yurak kabi urmoqda har kuni bonglar\n" +
                        "Onamni eslasam yurak ezilar \n" +
                        "Onamning yo`qligi mudom sezilar\n" +
                        "\n" +
                        "Xamisha samoda doim pok ruhi\n" +
                        "Menda quvonch o`rniga qayg`u shukuhi\n" +
                        "Yosh kelar ko`zimgaonamni o`ylasam \n" +
                        "Bilmam ta`rifini qanday so`ylasam\n" +
                        "Ey mening soddadil soddadil onam \n" +
                        "\n" +
                        "Jannatlarda ko`rayin sizni onajon \n" +
                        "Kuta kuta yurak bo`ldi qon \n" +
                        "Mehringizga to`ymaganim men uchun armon\n" +
                        "Garchi hayotim bo`lsa farovon \n" +
                        "Maktabda a`loga o`qiyman ravon \n" +
                        "\n" +
                        "Inson o`zi shunday ekan \n" +
                        "Gohi yig`lar gohi shod \n" +
                        "Aziz insoni o`tsa \n" +
                        "Yig`lar ekan umrbod\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Navro'z", "Yangi kunni qutlaymiz\n" +
                        "Navro`z yangi kun demak\n" +
                        "Go`zal bahor navro`zida\n" +
                        "Pishirilar sumalak.\n" +
                        "\n" +
                        "Varraklar ham uchadi\n" +
                        "Keng samoni quchadi\n" +
                        "Qadriyat belgisi bo`lar\n" +
                        "Navro`z shu bilan to`lar.\n" +
                        "\n" +
                        "Sumalakni kovlaganda \n" +
                        "Niyat bo`lar har bir so`z\n" +
                        "Hammamizga muborak\n" +
                        "Yangi kun, go`zal navro`z.\n" +
                        "\n" +
                        "Uyushtirilar bazmlar ham\n" +
                        "Navro`z mahal chog`ida\n" +
                        "Qushlar ham sayrar mudom\n" +
                        "Nafis bahor bog`ida.\n" +
                        "\n" +
                        "Bahor fasli navro`zi\n" +
                        "Eng go`zal bayram\n" +
                        "Yasharishning bu fasli\n" +
                        "Muborak sizga ham.\n", ""
            ),
            model(
                R.drawable.img, "Nogiron", "Sog`lommiz biz barhayot\n" +
                        "Nogiron emasmiz yo hasta\n" +
                        "Tuzalay deb kutarlar najot\n" +
                        "Yuray deb intilar asta.\n" +
                        "\n" +
                        "Bir insonning dardini \n" +
                        "Tushunadi bir inson\n" +
                        "Allohimga shukur deying\n" +
                        "Bo`lmagansiz nogiron.\n" +
                        "\n" +
                        "Bu dard balosini\n" +
                        "Bermagan sizga Alloh\n" +
                        "Nogironni ranjitgan\n" +
                        "Oladi katta gunoh.\n" +
                        "\n" +
                        "Robbimizning qudratin\n" +
                        "His eting ey inson\n" +
                        "Eng suygan bandasidir\n" +
                        "Allohimning nogiron.\n" +
                        "\n" +
                        "Doim olg`a yurishdan \n" +
                        "To`xtamaydi hech bir on\n" +
                        "Quchmoqda ko`p marralarni\n" +
                        "Nogirondek bir inson.\n" +
                        "\n" +
                        "Sog` bo`lib bu dunyoda\n" +
                        "Qing`ir ishga qo`l urgan\n" +
                        "Kimsalar ham uchraydi\n" +
                        "Noto`g`ri yo`ldan yurgan.\n" +
                        "\n" +
                        "Nogiron deb ajratma\n" +
                        "U bilan bo`l do`st-o`rtog`\n" +
                        "Mushkuliga yordam ber\n" +
                        "Axir sening taning sog`.\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Gul ifori", "Bog`da bir gul bor edi\n" +
                        "U tomonga uchardim\n" +
                        "Sen kelmagan kuningda\n" +
                        "O`sha gulni quchardim.\n" +
                        "\n" +
                        "Sirdosh edi, do`st edi\n" +
                        "Ayrim kimsadan ko`ra\n" +
                        "Seni qanday sevganim\n" +
                        "O`sha gulimdan so`ra.\n" +
                        "\n" +
                        "Yovuz g`animlar buni\n" +
                        "Ko`rolmay soya soldi\n" +
                        "Sirdosh gulginam buni\n" +
                        "Bilmay g`aflatda qoldi.\n" +
                        "\n" +
                        "Sen ham kelmay qo`ygansan \n" +
                        "Ayrildim gulimdan ham\n" +
                        "Ayriliqlar azobi\n" +
                        "Battardir o`limdan ham\n", ""
            ),
            model(
                R.drawable.img, "Mehnat qadri", "Birgina gul insonga \n" +
                        "Xush kayfiyat bersa gar\n" +
                        "Kim mehnatdan qochmasa \n" +
                        "Unga Alloh rizq berar.\n" +
                        "\n" +
                        "Peshona teri bilan\n" +
                        "Ishlaganlar haloldir\n" +
                        "Kimdir ishlar shundayin \n" +
                        "Kimga esa maloldir.\n" +
                        "\n" +
                        "Boshlagan ishimizni\n" +
                        "Oxirigacha qilaylik\n" +
                        "Har bir kasb egasiga\n" +
                        "Muvaffaqiyat tilaylik\n" +
                        "\n" +
                        "O`zi sevgan sohaga\n" +
                        "Kirsin har bir inson\n" +
                        "Orzusiga yetishishdan \n" +
                        "To`xtamasin hech bir on\n" +
                        "\n" +
                        "Inson umri xuddi\n" +
                        "Qo`yilgan narx misoli\n" +
                        "Kim yahshilik qilsa gar\n" +
                        "Jannat eshik timsoli.\n", ""
            ),
            model(
                R.drawable.img, "Dard", "Insonning ichida \n" +
                        "Ko`p bo`lar dardi\n" +
                        "Ayrilsa bilinar\n" +
                        "Odamning qadri\n" +
                        "\n" +
                        "Oftobga qiyosdir\n" +
                        "Kishining bag`ri\n" +
                        "Hech vaqt sochmasin\n" +
                        "Birovga qaxrin\n" +
                        "\n" +
                        "Aslida insonning \n" +
                        "Ko`ksida zaxri.\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Vatanim", "Bilmadim, gapni nedan boshlasam\n" +
                        "Vatan degan so`z nimadir asli.\n" +
                        "Men vatan deya ko`zim yoshlasam\n" +
                        "Yashnarmi bu go`zal asriylik fasli.\n" +
                        "\n" +
                        "Vatan deb kimlar o`lmadi\n" +
                        "Vatan deya to`kildi qon.\n" +
                        "Qancha buyuk inson so`lmadi.\n" +
                        "Vatan uchun ketganda ham jon.\n" +
                        "\n" +
                        "Men uchun vatan tug`ilgan go`sham\n" +
                        "Aziz ona tuprog`im bildim\n" +
                        "Inson uchun bu jannatning\n" +
                        "Hayotbaxsh visoli qadrini bildim.\n" +
                        "\n" +
                        "O`sha og`ir zamonlarda ham\n" +
                        "Qotgan qattiq nonni yeganlar\n" +
                        "Ular so`nggi nafasida ham\n" +
                        "Ona tuprog`im vatan deganlar.\n" +
                        "\n" +
                        "Ey o`g`lon mard bo`lgin \n" +
                        "Yuragingga g`ururingni sol.\n" +
                        "O`sha olis makoningni sen\n" +
                        "Oddiygina vatana deya qol.\n" +
                        "\n" +
                        "Axir Alloh vatan bergan\n" +
                        "Daraxtlar-u hatto yaproqqa\n" +
                        "Sen bir kun o`tganingdan so`ng\n" +
                        "Ko`milursan ona tuproqqa\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Yalpiz", "Bahor kelishi bilan\n" +
                        "Ufurdi shirin ifor\n" +
                        "Uning hidi shunchalar\n" +
                        "Go`zal edi betakror\n" +
                        "\n" +
                        "Uni gul desam lekin\n" +
                        "Gul emas nafis ifor\n" +
                        "Olam ichra yagona\n" +
                        "Ajib go`zalligi bor\n" +
                        "\n" +
                        "Ariq bo`yida mahzun\n" +
                        "O`simlik o`sar yalpiz\n" +
                        "Uning tanxoligidan\n" +
                        "Qolib ketar har bir qiz\n" +
                        "\n" +
                        "Bunday go`zallikni sen\n" +
                        "Qaysi guldan olgansan\n" +
                        "Nafis iforing bilan\n" +
                        "Yurakka o`t solgansan.\n", ""
            ),
            model(
                R.drawable.img, "Kapalak", "Shunchalar beg`uborki\n" +
                        "Nozik bir malak\n" +
                        "Chiroyidan yig`laydi toki\n" +
                        "Uni deya o`rtangan falak\n" +
                        "\n" +
                        "Maysazorlar ichra uchardi \n" +
                        "Nafisligim oppoq kapalak\n" +
                        "Keng osmonu samo quchardi\n" +
                        "Farishtadek beozor malak\n" +
                        "\n" +
                        "Qanotlarin qoqqanda har cho`g`\n" +
                        "Ko`z-ko`z etar o`zini go`yo\n" +
                        "Sirli bo`lgan o`sha go`zal bog`\n" +
                        "Ertak bu kun aylanar ro`yo\n" +
                        "\n" +
                        "Bir kuni dunyoga kelar\n" +
                        "O`sha kuni so`nadi \n" +
                        "Qanot qoqib ojizligim \n" +
                        "Jannatlarga qo`nadi\n", ""
            ),
            model(
                R.drawable.img, "Zulfiyaxonim", "She`riyat osmoniga nazar tashlasak\n" +
                        "Ne-ne siymolarni unda ko`ramiz \n" +
                        "Agar Uvaysiydan gapni boshlasak\n" +
                        "Nodira qoshida g`amgin turamiz\n" +
                        "\n" +
                        "Yo Robbim ilohiy karaming ila\n" +
                        "Sen ayol zotini shohsuvor etding\n" +
                        "G`azal bo\t`stoniga nur-ziyo tarab\n" +
                        "Munisa ayolga mo`yqalam tutding\n" +
                        "\n" +
                        "Uvaysiy,Nodira,Zulfiyaxonim\n" +
                        "Xulkar yulduziydi g`azal osmonin\n" +
                        "Ular bezab she`riyat bo`stonin\n" +
                        "Tarixda qoldirdi muqaddas nomin.\n" +
                        "\n" +
                        "Ular avvalida bir ayol edi\n" +
                        "Munisa qalbida olovni tutgan\n" +
                        "Mening ona yurtim muqaddas derdi\n" +
                        "She`riyat osmonida yorini kutgan\n" +
                        "\n" +
                        "Necha yillar o`tib bir yuduz balqib\n" +
                        "She`riyat osmonin munavvar etdi\n" +
                        "O`tli nigohidan bu olam qalqib\n" +
                        "Bir ajib dunyoga yetaklab ketdi.\n" +
                        "\n" +
                        "Hamid olimjonga bo`lib vafodor\n" +
                        "Mo`yqalam tebratdi olam qoshida\n" +
                        "Ba`zida u bo`lib ushalmas hayol\n" +
                        "Ona bo`lib turdi o`z bardoshida\n" +
                        "\n" +
                        "Muzaffar hayolin quchib satrlar \n" +
                        "Tunlari taradi olam sochini\n" +
                        "Hayotga burkanib qir-u adirlar\n" +
                        "She`rga jo ayladi ko`z-u yoshini.\n" +
                        "\n" +
                        "Zulfiyaxonimning she`rin o`qisam\n" +
                        "Qoshimga keladi bir mo`jaz hayol\n" +
                        "Uning ruh-pokiga timsol to`qisam\n" +
                        "Mangu siymo turar muqaddas ayol\n", ""
            ),
            model(
                R.drawable.img, "Kuy", "Tarannum etdi dunyo\n" +
                        "Ne mo`jiza san`ati\n" +
                        "Ne ajib kuylar aro\n" +
                        "Insoniyat madaniyati\n" +
                        "\n" +
                        "Bu navolar, bu kuylar\n" +
                        "Taraqqiy etmoqda bu kun\n" +
                        "Har kuyning o`z ma`nosi\n" +
                        "Hikoya bo`lur uzun.\n" +
                        "\n" +
                        "Shoirlar navo yaratmas\n" +
                        "Lek navo bo`lar bir kun\n" +
                        "Zamon bugun boshqacha\n" +
                        "Zamon o`zgardi bugun.\n" +
                        "\n" +
                        "Ta`sirlanar inson ham\n" +
                        "Eshitsa mungli navo\n" +
                        "Kuy mangu bo`lgaydir\n" +
                        "Inson o`lmaguncha to.\n", ""
            ),
            model(
                R.drawable.img, "Amir Temur", "NE  KECHMISHLAR  O’TDI  BOSHINGDA\n" +
                        "TARIX  GUVOX  AZALDAN-AZAL\n" +
                        "YANGI  ZAMON  BUGUN QOSHINGDA \n" +
                        "O’TMISHINGNI  O’YLAGAN  MAHAL\n" +
                        "\n" +
                        "BUTUN OSIYO  TAN  BERGAN CHOG’DA\n" +
                        "ADOLAT  BOSH,  USTUVOR  QONUN \n" +
                        "G’ANIMLARNI  QOLDIRIB  DOG’DA\n" +
                        "JON  BERMOQQA  TAYYOR  VATAN –CHUN \n" +
                        "\n" +
                        "BUYUK  TEMUR  NOMI ULUG’VOR\n" +
                        "VATAN  UNGA  SHA’NDIR, G’URUR, OR\n" +
                        "YURT  TINCHLIGI   BOYNIGA  TUMOR\n" +
                        "IYMON  DEGAN TUYG’UDA  XOK-SOR\n" +
                        "\n" +
                        "DUSHMANINI  SIYLAGAN  INSON  \n" +
                        "ADOLATNING  SO’ZI  BU  DEYDI\n" +
                        "BIR  QARICH   YER  UCHUN  KETSA  JON\n" +
                        "DESA  MAGAR  VATANIM  DEDI\n" +
                        "\n" +
                        "O’ZBEK  ELIN DONG’I  KETMISHKI\n" +
                        "SOHIBQIRON  DOVRUG’IGA  BOQ\n" +
                        "HAR DAVLATNI  MAG’LUB   ETMISHKI\n" +
                        "KO’Z  QIRI –LA  TASHLASA  NIGOH\n" +
                        "\n" +
                        "BUYUK  DAVLAT  TUZMOQLIK  UCHUN \n" +
                        "HAR  SARHADDA  BAYROG’IN  TUTDI\n" +
                        "YEVROPAGA  KO’RSATIB KUCHIN  \n" +
                        "BOYAZITNI  U  HAYRON  ETDI \n" +
                        "\n" +
                        "SHAMSHIRINI  KO’TARGAN  BIR  ON \n" +
                        "ZIRQIRARDI  BU  OLAM  ZAMON  \n" +
                        "YURT  TUPROG’I  UCHUN KETSIN JON\n" +
                        "DEYA  QANCHA  TO’KILDI –KU  QON \n" +
                        "\n" +
                        "BUGUN  MILLAT  TINCH  VA  FAROVON  \n" +
                        "ELU-ELAT  DO’STONA  YASHAR\n" +
                        "SONIYA  SAYIN  O’ZGARIB  ZAMON \n" +
                        "TINCHLIK  HUKMIN  SURADI  BASHAR\n" +
                        "\n" +
                        "BUL  DIYORNI  ASRAMOQ  UCHUN  \n" +
                        "FIDO  BO’LIB  BUGUN  BARIMIZ \n" +
                        "VATAN DEBKI, BIR  BAG’RI BUTUN \n" +
                        "TEMURIYNING IZDOSHLARIMIz  \n", ""
            ),
            model(
                R.drawable.img, "Vatan", "FAQAT  YORNIKIMAS  SOG’INCHU  MEHR\n" +
                        "AVVALO  VATANNI  SEVISHNI  O’RGAN \n" +
                        "BOSHQA  JOYDAN  IZLAMA  SEHR\n" +
                        "TANGRIM  UNI  VATANGA  QURGAN\n" +
                        "\n" +
                        "QAYERGA   QARASANG  YORISHSA  DILLAR\n" +
                        "NE  HOJAT  UYALIB,  YASHIRIB  UNI\n" +
                        "O’Z-O’ZIDAN  SAYRASIN  TILLAR\n" +
                        "YASHIRGIN  KO’Z-KO’ZLAB  SHUNI\n" +
                        "\n" +
                        "VATANNI  SEVGIN UNI  ARDOQLA\n" +
                        "OSMONLARGA  CHIQSIN SEVGING  NOLASI\n" +
                        "LEKIN  SHU ZAMINDA  QOLSIN  OBKETMA\n" +
                        "VATAN  DEB  OQARGAN SOCHLAR TOLASI\n" +
                        "\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Mahallam", "Tandiridan issiq nonlar yedik birga\n" +
                        "To`planishib ne o`yinlar o`ynaganmiz\n" +
                        "Ko`nikamiz ne der edik bu taqdirga\n" +
                        "Aslo unut bo`lmagaydir mahallamiz.\n" +
                        "\n" +
                        "Qo`shnilarning oqibati metin qo`rg`on\n" +
                        "Har kun ular mehri ila suhbat qurar\n" +
                        "Yopilganda beriladi kulchami non\n" +
                        "Inoq bo`lib bu hayotning zavqin surar.\n" +
                        "\n" +
                        "Oqsoqollar qarilikning gashtin surib\n" +
                        "Tilaydilar duosila baxtni bizga\n" +
                        "Ajin tushgan yuzlarila sekin kulib\n" +
                        "Ulg`ayibsan deb qo`yadi o`g`il-qizga.\n" +
                        "\n" +
                        "Arafa kun ko`ring bo`lar qanday diydor\n" +
                        "Osh tarqatib bir-birlarin xushnud aylar\n" +
                        "Ko`ngilda yo`q zarrachalik hatto g`ubor\n" +
                        "Yumush bo`lsa bormiz deya ular shaylar.\n" +
                        "\n" +
                        "Har haftada hasharlarni qilishadi\n" +
                        "Ulfat bilan choyxona ham qolib ketmas\n" +
                        "Do`stlik degan rishtani ham bilishadi\n" +
                        "Axir ular bir vatandan, o`zga emas.\n" +
                        "\n" +
                        "Demak do`stlar mahallam bor shunday ko`rkam\n" +
                        "Asragayman daraxtinig yaprog`ini\n" +
                        "Shu yo`sinda unutmasdan vatanni ham\n" +
                        "Abad qalbda saqlagayman ardog`ini.\n", ""
            ),
            model(
                R.drawable.img, "Yomg'ir", "Suv sathidan ko`tarilib hovurlar ham\n" +
                        "Samo tomon harakatni boshlaydilar\n" +
                        "Tepalikka chiqqan sari bo`libmi nam\n" +
                        "Bulutlarning ko`zlarini yoshlaydilar\n" +
                        "\n" +
                        "Shunday qilib bir mo`jiza yaraladi\n" +
                        "Donalari dur-u gavhar kabi bo`lib\n" +
                        "Undan ajib munis hislar taraladi\n" +
                        "Hursandlikka chog`lanarsan ko`ngling to`lib\n" +
                        "\n" +
                        "Shitir etgan tovushga bo`lib shaydo\n" +
                        "Ko`ngling yumshab ketar hatto malhamdayin\n" +
                        "Yog`yotgan fursatidan tinguncha to\n" +
                        "Go`zallashib borar ekan u vaqt sayin.\n" +
                        "\n" +
                        "Yomg`ir shunday mo`jizaki bilsang agar\n" +
                        "Har tomchisi o`qilmagan bir kitobdir\n" +
                        "Unum ila foydalanar ekan bashar\n" +
                        "Ochilmasdan qolaverar undagi sir.\n" +
                        "\n" +
                        "Samo tomon chiqqunicha mas`um suvlar\n" +
                        "Dil tubidan ajib mungli qo`shiq aytar\n" +
                        "Bu falakni kezib esa endi ular\n" +
                        "Yomg`ir degan ulug` ne`mat bo`lib qaytar.\n" +
                        "\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Oy", "Zarrin nuring ostida \n" +
                        "Bir olam bor bepoyon \n" +
                        "Taratgaysan nuringni\n" +
                        "Bu zaminga har tomon\n" +
                        "\n" +
                        "Tunlari fonus misol\n" +
                        "Oq soching yerni quchar\n" +
                        "Husning bo`lib bir timsol\n" +
                        "Zulmat ustidan uchar\n" +
                        "\n" +
                        "Yulduzlar ekan hamroh\n" +
                        "Lek senchalik bo`lmaydi\n" +
                        "Quyoshning ham nuri goh\n" +
                        "Yerga buncha to`lmaydi\n" +
                        "\n" +
                        "Chiroyingdan yig`lab yer \n" +
                        "Toshitadi suvlarin\n" +
                        "Samo tomon qarab der\n" +
                        "Ne erur buning siri\n" +
                        "\n" +
                        "Yarqira yoqutdayin\n" +
                        "Yulduzlarni ham tortib\n" +
                        "O`tgan soniya sayin\n" +
                        "Nuring jilosi ortib.\n", ""
            ),
            model(
                R.drawable.img, "Dehqon", "Sahiylik bobida tengi yo`q inson\n" +
                        "To`ydirar xalqini mehnati bilan\n" +
                        "Odamlar ham undan o`rgansin iymon\n" +
                        "Kibrlanib men zo`rman degani bilan\n" +
                        "\n" +
                        "Uning mehnati pokiza halol\n" +
                        "Shundayin ter to`kib rizqin teradi\n" +
                        "Aytadi doim berganini ol\n" +
                        "Qolganin albatta Alloh beradi\n" +
                        "\n" +
                        "Dehqonchilikning ko`pdir zahmati\n" +
                        "Barcha ne`matlar tabiiy va sarhil\n" +
                        "Osiy banda uchun elning rahmatin\n" +
                        "Olish savob ekanligin bil\n" +
                        "\n" +
                        "Dehqonlar xalqin duosin olib\n" +
                        "Noz-u ne`matin to`kib sochadi\n" +
                        "Hozirgi ajib zamona qolib\n" +
                        "Yangi sirli dunyo ochadi.\n", ""
            ),
            model(
                R.drawable.img, "Kelnoyi", "Oppoq ko`ylak yarashib buncha\n" +
                        "Kirib keldi kelinoyim ham\n" +
                        "Sizni kutib tonglar otguncha\n" +
                        "Shu bir uyga bo`ldik bugun jam\n" +
                        "\n" +
                        "Go`zal kunlar endi boshlanar\n" +
                        "Asli bugun go`zal kun axir\n" +
                        "Ko`nglingiz ham bir zum yoshlanar\n" +
                        "Demak baxtli sizdagi taqdir\n" +
                        "\n" +
                        "Juft-u halol degan bu nomga\n" +
                        "Erishdingiz kelinchak bo`lib\n" +
                        "Endi esa bundayin shonga \n" +
                        "Yuragingiz kuladi to`lib\n" +
                        "\n" +
                        "Chexrangiz sizni bunchalar gulgun\n" +
                        "Tabassum qilasiz dunyo esa lol\n" +
                        "Oy uyalib hatto siz uchun\n" +
                        "Chiqmas ekan tunda bemalol\n" +
                        "\n" +
                        "Yulduzlarni parvona etib \n" +
                        "Qo`yar ekan sizdagi visol\n" +
                        "Sochingizni qaylarga eltib\n" +
                        "Uchurarkin bu mayin shamol\n" +
                        "\n" +
                        "Yumush bo`lsa bemalol \n" +
                        "Doim tayyor bilagim\n" +
                        "Tilim esa bo`lib bol\n" +
                        "Baxtdir sizga tilagim.\n", ""
            ),
            model(
                R.drawable.img, "Adolat", "Yurtda adolat bo`lsin\n" +
                        "Shunda vatan farovon\n" +
                        "Yurtda adolat bo`lsa\n" +
                        "Yo`llar ham bo`lar ravon\n" +
                        "\n" +
                        "Tinch yurt O`zbekistonda\n" +
                        "Yashayabmiz biz ozod\n" +
                        "Adolatli bu yurtning\n" +
                        "Har maskani bir obod\n" +
                        "\n" +
                        "Kuch ham adolatdadir\n" +
                        "Adolat kuchda emas\n" +
                        "Adolatli bo`lsalar\n" +
                        "Bu xalq hech yengilmas\n" +
                        "\n" +
                        "Urush bo`lmasin desang \n" +
                        "Sen adolatli bo`l\n" +
                        "Adolatli bo`lish ham\n" +
                        "Senga bo`lar to`gri yo`l\n", ""
            ),
            model(
                R.drawable.img, "Bahor", "Qaldirg`ochlar  yayrashar \n" +
                        "Bahor keldi hoynahoy\n" +
                        "Sho`h bulbular sayrashar  \n" +
                        "Gular ham ochib chiroy\n" +
                        "\n" +
                        "Boychechagim chiqdi mana\n" +
                        "Bahordan berib darak\n" +
                        "Uchib keldi qushlar yana\n" +
                        "Pishirarmiz sumalak\n" +
                        "\n" +
                        "Biz tomonga keldi bahor\n" +
                        "Fasllarning kelinchagi\n" +
                        "Gullar edi chamanzor \n" +
                        "Tebratib belinchagin.\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Yangicha Zamon", "Ortga nazar tashlasak bir on \n" +
                        "Qanday og`ir zamonlar kechdi\n" +
                        "Bugungi  endi yangicha zamon\n" +
                        "Muammolarni bir zumda yechdi\n" +
                        "\n" +
                        "Muloqot qilish uchun ham \n" +
                        "Bizda yangi telefon bor\n" +
                        "Zamonaviy texnikaga ham\n" +
                        "To`ladigan bo`ldiku bozor\n" +
                        "\n" +
                        "Otda yurmaysan,mashinalar bor\n" +
                        "Uy supurmaysan changyutgich tayyor\n" +
                        "Hatto turadi muzlatgichda qor\n" +
                        "Uchishni istasang samolyot bisyor\n" +
                        "\n" +
                        "Konditsioner isitar uyni \n" +
                        "Kompyuterlar berar ma’lumot\n" +
                        "Sintizator chaladi kuyni\n" +
                        "Texnikadan olib talimot\n" +
                        "\n" +
                        "Axborot beradi oytnaijahon\n" +
                        "Eltar manzilingga afrosiyob\n" +
                        "Musiqa hamrohing bo`ladi har on\n" +
                        "Sharbat ichishchun blenderni top\n" +
                        "\n" +
                        "Ularning manbai tokdir bilasan\n" +
                        "Ovqating sovusa isitgichlar bor\n" +
                        "Quloqchin taqvolib ishni qilasan\n" +
                        "Temirdan robotlar ishingga tayyor\n" +
                        "\n" +
                        "Taraqqiy etmoqda yangicha zamon\n" +
                        "Bu asriy yillardan har bir inson shod \n" +
                        "Bizki yuksaklikka chiqamiz har on \n" +
                        "Bizdanda o`tar kelajak avlod\n", ""
            ),
            model(
                R.drawable.img, "Ayoz", "Samodan yog`ar kichik bir mayin\n" +
                        "Oppoq zarra mo`jazgina qor\n" +
                        "Men qishni sevganim sayin \n" +
                        "Uning fusuni ortadi takror\n" +
                        "\n" +
                        "Ayoz oynalarga naqshin soladi \n" +
                        "Go`yoki u mohir musavvir\n" +
                        "Qorda yurgan sari izlar qoladi \n" +
                        "Bu ajiblik o`zi ham bir sir\n" +
                        "\n" +
                        "Izg`irin uvullar qishning ayozi\n" +
                        "Yog’adi falakdan oppoqqina qor\n" +
                        "Shamol ham ufurar sovuq ovozi\n" +
                        "Qishning ham ajib go`zalligi bor\n" +
                        "\n" +
                        "Sening sovuq nigohlaringdan \n" +
                        "Qor ham qotib bo`lar yaxmalak\n" +
                        "Seni bugun yetkazdi menga\n" +
                        "Olis samo osmonu falak\n", ""
            ),
            model(
                R.drawable.img, "Yulduz", "Osmonda bir miltillagan ko`z\n" +
                        "Go`yo bizga boqib turadi\n" +
                        "Topolmaysan ta’rifiga so`z\n" +
                        "Qanday xomush hayol suradi\n" +
                        "\n" +
                        "Sayyoralar ichra tanxo u\n" +
                        "Kechlari ham udir sirdoshim \n" +
                        "Charos yuzli chexrasini u\n" +
                        "Qaydan oldi ekan sirdoshim\n" +
                        "\n" +
                        "Kechlari ham fonus misoli \n" +
                        "Yorug`ligin menga eltadi\n" +
                        "Ertak kabi sirli dunyoga \n" +
                        "Meni bir zum olib ketadi\n", ""
            ),
            model(
                R.drawable.img, "Yurtboshim", "Ming chamanlar kezgan chog`da bog`lar aro\n" +
                        "Bir suluvning go`zalligin derlar qaro\n" +
                        "Ming asrlar ichra kelsa bir kun balo\n" +
                        "Yurtboshimdan bo`lak o`zga darmon bo`lmas.\n" +
                        "\n" +
                        "Millatlarni birlashtirgan sarbon o`zi\n" +
                        "Bir so`zlasa charaqlagan yulduz ko`zi\n" +
                        "Dillarni mavh etrgandirki uning so`zi\n" +
                        "Yurtboshimning doim abad nomi o`lmas.\n" +
                        "\n" +
                        "Xalqim deya halovatsiz tunlar bedor\n" +
                        "Har jabhada har bir ishin salmog`i bor\n" +
                        "Tinim bilmas millat uchun olmay mador\n" +
                        "Shu yurt uchun xalqim debki qo`li tolmas.\n" +
                        "\n" +
                        "Qad ko`tardi bugun qancha binolar ham \n" +
                        "Ne kasallik keldi lekin bo`ldi bardam\n" +
                        "Kelajakka qo`ydi endi katta qadam\n" +
                        "Albat yurti yuksak davlat bo`lmay qolmas.\n" +
                        "\n" +
                        "Mustaqilmiz erkimiz ham bordir bugun\n" +
                        "Dilimizda ne maqsadlar bo`lib tugun\n" +
                        "Shukronalar aytaylik biz tinchlik uchun\n" +
                        "Shunday kunga noshukurlik qilmasak bas.\n" +

                        "Ishonchimiz osmonlarga borib yetdi\n" +
                        "O`zbekiston degan yurtning dong`i ketdi\n" +
                        "Qay millatlar orzu bilan havas etdi\n" +
                        "Polvonlari maydonda  bo`lib zabardast.\n" +
                        "\n" +
                        "Yuksalishga qadamini qo`ygan sari\n" +
                        "Bobom deya qo`llamoqda farzandlari\n" +
                        "Farovonlik zavqin sursa yosh-u qari\n" +
                        "Bayrog`ini yuksaklarda ko`tarsa dast.\n" +
                        "\n" +
                        "Bu kunlardan shod bo`lmoqda har bir inson\n" +
                        "Vatan uchun arzir do`stlar bermoqlik jon\n" +
                        "Asriy yillar ichra keldi yangi zamon\n" +
                        "Vatan gullar uni deya olsak nafas.\n" +
                        "\n" +
                        "O`z xalqidan shijoatni kuchni olib\n" +
                        "Yuragiga iymon degan hisni solib\n" +
                        "Shu onda ham marralarda bo`lib g`olib\n" +
                        "Yurtboshimga qilar boshqa ellar havas\n" +
                        "\n" +
                        "Vatan uchun kelajakdir bugun yoshlar\n" +
                        "Yurtboshimiz bu ishonchga bizni boshlar\n" +
                        "Bir-biriga qo`lin bersa zamondoshlar\n" +
                        "O`zbek eli hech sohada ortda emas\n" +
                        "\n" +
                        "Bugun o`zbek eliga dunyo bo`lib lol\n" +
                        "Sabru matonatda ham mehnatda halol\n" +
                        "Yurtimning jamolini ko`ring bemalol\n" +
                        "Husnu tarovatiga kim havas qilmas\n" +
                        "\n" +
                        "Yurtboshimni yozsam men bir doston bo`lar\n" +
                        "Ta’rif ham ko`pligidan daftarim to`lar\n" +
                        "Ona vatanga mendan shu misram qolar\n" +
                        "Vatandoshlar hech bir yurt bizlardek emas.", ""
            ),
            model(
                R.drawable.img, "Yerga Husn Beraylik", "\n" +
                        "Daryo ham mavjlanib to`lqini toshib\n" +
                        "Suvning sathidan ketadi oshib\n" +
                        "Yerning ham ko`rkiga ko`rk qo`sha\n" +
                        "O`tlaru gullar ham o`sadi shoshib\n" +
                        "\n" +
                        "Ko`klam yashil rangdadir endi\n" +
                        "Bahor keldi O`zbekistonga\n" +
                        "Bu tarovat bir go`zal edi\n" +
                        "Chambarakdek bo`ldi makonga\n" +
                        "\n" +
                        "Daraxt, gul, o`t – maysalar\n" +
                        "Bular bari o`simlik\n" +
                        "Yerni go`zal qilgani biz\n" +
                        "Xo`sh aytaylik ne qildik?\n" +
                        "\n" +
                        "Go`zallikning  jilvasidan\n" +
                        "Biroz bo`lsa teraylik\n" +
                        "Bu go`zal zamin uzra\n" +
                        "Yerga husn beraylik.\n", ""
            ),
            model(
                R.drawable.img, "Lola Haqidagi Tush", "Tog` tomon ketdim birdan\n" +
                        "Lolani ko`rib qoldim\n" +
                        "Ne bo`lsa ham taqdirdan\n" +
                        "Deya qo`limga oldim\n" +
                        "\n" +
                        "Hidi dimog`imni ham\n" +
                        "Shunchalar maftun etdi\n" +
                        "Lolalarni qilsam jam\n" +
                        "Shamolda uchib ketdi\n" +
                        "\n" +
                        "Anor yuzligim deya\n" +
                        "Erkalatdim har birin\n" +
                        "Ular esa biz deya\n" +
                        "Aytib berdi o`z sirin\n" +
                        "\n" +
                        "Bizlar qizil lolalar\n" +
                        "Ko`p oldin yaralganmiz\n" +
                        "Bizni ko`rgan bolalar\n" +
                        "Uchun ham taralganmiz\n" +
                        "\n" +
                        "Hursand bo`lib ketgan chog`\n" +
                        "Shamol ufurdi birdan\n" +
                        "Ajib bo`lgan sirli bog`\n" +
                        "Ko`rindi uzoq qirdan\n" +
                        "\n" +
                        "U bog` tomon men borsam\n" +
                        "Gullar suhbat qurardi\n" +
                        "Qizil yuzli lolam ham\n" +
                        "Mening nomimdir qayin\n" +
                        "Bo`y – bastim ham hashamdor\n" +
                        "Yo`qdur hech ham mendayin\n" +
                        "\n" +
                        "O`rmonda ham holat shu\n" +
                        "Hamma maqtar o`zini\n" +
                        "Mayli hayr dedimu\n" +
                        "Eshitmasdan so`zini\n" +
                        "\n" +
                        "Endi manzilim bo`ldi\n" +
                        "O`sha dengiz tomonlar\n" +
                        "Birdan suvlari to`ldi\n" +
                        "Bir – birini yomonlar\n" +
                        "\n" +
                        "Loyqa suving bilan sen\n" +
                        "Qay tomonda turasan\n" +
                        "Tiniq suvli bo`lsam men\n" +
                        "Yer tagida yurasan\n" +
                        "\n" +
                        "Suvlarda ham tinchlik yo`q\n" +
                        "Dedim o`zim – o`zimga\n" +
                        "Ko`nglim bo`lmay hech ham to`q\n" +
                        "Har bir aytgan so`zimga\n" +
                        "\n" +
                        "Shu nasihat deb bulut\n" +
                        "Gullar asli ko`p edi\n" +
                        "Qolganlarin sen unut\n" +
                        "Lolangchalik yo`q dedi\n" +
                        "\n" +
                        "O`ylanib rosa shu dam\n" +
                        "Olib lolamni qo`lga\n" +
                        "Uy tomon borib bardam\n" +
                        "Tushdimku endi yo`lga\n" +
                        "\n" +
                        "Uyga yetdim ham oxir\n" +
                        "Onamga lola berdim\n" +
                        "Bunda yo`q dedimki sir\n" +
                        "Chakkasiga gul terdim\n" +
                        "\n" +
                        "Sarguzashtlar tugab so`ng\n" +
                        "Choy ichishga yo`q hushim\n" +
                        "Quyosh otib tushdi tong\n" +
                        "Asli ekan bu tushim.\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Nihol", "Uyimizga daraxt berar fayzli ko`rkni\n" +
                        "Mevasin yeymiz so`ng sotamiz\n" +
                        "Bir nihol eksak agar\n" +
                        "Barakalla o`g`lim deydi otamiz\n" +
                        "\n" +
                        "Niholni ekkan chog`ing\n" +
                        "Parvarish qil qaragin\n" +
                        "Har zamonda habar olib\n" +
                        "Suv quyishga yaragin\n" +
                        "\n" +
                        "Bu nihol o`sadi yillar mobayni\n" +
                        "Daraxt bo`lganida meva ham solar\n" +
                        "Sendan farzandingga davlating bilan\n" +
                        "Meros bo`lib daraxting qolar.\n", ""
            ),
            model(
                R.drawable.img, "Mevalar",
                "Qizaribdi bog`larda\n" +
                        "Olma uzum giloslar\n" +
                        "Mevalarni shoirlar\n" +
                        "Ko`p narsaga qiyoslar\n" +
                        "Uzumlarni navi ko`p\n" +
                        "Xusayni – yu charoslar\n" +
                        "Olmalar ham bo`lib to`p\n" +
                        "Gullar edi giloslar\n" +
                        "\n" +
                        "Biz tomonda pishadi\n" +
                        "Qovun tarvuz handalak\n" +
                        "Osmonda rang sochib\n" +
                        "Turar doim kamalak\n" +
                        "\n" +
                        "Yomg`irgarchilik bo`lsa\n" +
                        "Hosillar zo`r bo`ladi\n" +
                        "Yerning o`zi zo`r bo`lsa\n" +
                        "Mevalar ham to`ladi\n" +
                        "\n" +
                        "Bizning  yurtimizda ham\n" +
                        "Mevalar  ko`pdir asli\n" +
                        "Ko`chat ekaylik biz ham\n" +
                        "Daraxt bo`lar o`z fasli\n", ""
            ),
            model(
                R.drawable.img, "Suvdayn Oqqan Umr", "Suvda shivirlar hayot\n" +
                        "Umr suvday oqadi\n" +
                        "Qalbi pok insonga\n" +
                        "Omad kulib boqadi\n" +
                        "\n" +
                        "Xar zaxmatning bir toti\n" +
                        "Bo`ladi doim albat\n" +
                        "Suvda oqqan umrday\n" +
                        "Bo`lar bunda ham zahmat\n" +
                        "\n" +
                        "Inson umri bebaxo\n" +
                        "Xar bir soniya  g`animat\n" +
                        "Umr ham biz uchun\n" +
                        "Ajib bir yaxshi ne`mat\n" +
                        "\n" +
                        "Bu suvda oqqan umr\n" +
                        "O`tadi – yu ketadi\n" +
                        "Xayotining  qadriga\n" +
                        "Tushunganlar yetadi\n" +
                        "\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Yangi Yil", "Yangi yilga biz mana\n" +
                        "Bezatyabmiz archani\n" +
                        "Bunday go`zal bayramga\n" +
                        "Taklif etdik barchani\n" +
                        "\n" +
                        "Qorbobo tog`lar oshib\n" +
                        "Kelmoqda juda shoshib\n" +
                        "Bolalar ham quvonib\n" +
                        "Kutmoqda zavqi  oshib\n" +
                        "\n" +
                        "Sovg`alar ko`pdur juda\n" +
                        "Sovg`alar bisyor\n" +
                        "Falakdan yog`moqda \n" +
                        "Mo`jazgina oppoq qor\n" +
                        "\n" +
                        "Yangi yilda kiyimlar ham\n" +
                        "O`zgachadir va har xil\n" +
                        "Hammamizga muborak  \n" +
                        "Kelayotgan yangi yil\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Yurtim", "Qanday go`zal O`zbekiston\n" +
                        "Xur Vatan bizning diyor\n" +
                        "Salobatli mag`rur tog`laring\n" +
                        "Juda go`zal bog`laring bor\n" +
                        "\n" +
                        "Shaxring ham gullamoqda\n" +
                        "Xar maskaning bir gulzor\n" +
                        "Sen ham gulla Vatanim\n" +
                        "Huddi bir lola misol\n" +
                        "\n" +
                        "Sening bu davringga \n" +
                        "Guvoxdir keksa chinor\n" +
                        "Millatingning tili ham\n" +
                        "Bo`lib shunda shirin bol\n" +
                        "\n" +
                        "Vataningga foyda keltir\n" +
                        "Shu maskanga bir uy sol\n" +
                        "Sen tayyor tur xar ishga\n" +
                        "Qalbingga quloq solgin\n" +
                        "\n" +
                        "Boshinga kelgan tashvishga\n" +
                        "Keksalar duosin olgin\n" +
                        "Vatan uchun kerak bo`lsa\n" +
                        "Jon fido qil vaqtida\n" +
                        "\n" +
                        "Erkak turar o`z vadasi\n" +
                        "Qasamyodi shaxdida\n" +
                        "Amir Temur bobomizning\n" +
                        "Bir kursisi taxtida\n" +
                        "\n" +
                        "Vatanin asrash bo`lgan\n" +
                        "O`z burchi xam axtida\n" +
                        "Vatan tuprog`in ko`zinga surgin\n" +
                        "Vatan aziz erur shubxasiz\n" +
                        "\n" +
                        "Birgalikda bu chamanni \n" +
                        "Asragaymiz barchamiz !!!\n", ""
            ),
            model(
                R.drawable.img, "Singlim", "Parivashlar qolar husnu jamolingdan \n" +
                        "Oy uyalar hatto sening visolingdan\n" +
                        "Shuncha sherlar bitibmanu va lekin\n" +
                        "So`z topmabman sening bitta timsolingdan\n" +
                        "\n" +
                        "Bugun o`sha so`zni topmoq uchun men \n" +
                        "Dilimdan bir misrani bitdim\n" +
                        "Akajonim degan onda sen\n" +
                        "Bu yorug` olamni bir on unutdim\n" +
                        "\n" +
                        "Singlim mening borlig`im o`zing\n" +
                        "Sochlaring tolasin asta silayman\n" +
                        "Bir bora aka degan bu so`zing\n" +
                        "O`zimning jigarim borim bilay man\n" +
                        "\n" +
                        "Men sen uchun o’tda yonaman \n" +
                        "Jon fido qilay jajji yuraging uchun \n" +
                        "Seni kuylab dildan tonaman \n" +
                        "Bu sherni bitdim senga men bugun \n" +
                        "\n" +
                        "Iforing hidiga to’ymayman hech ham\n" +
                        "Uzoqlarga ketsang intizor ko’zim \n" +
                        "Dilim tubidan chiqqan ohang ham \n" +
                        "Seni deya o’ylaydi so’zim \n" +
                        "\n" +
                        "Sen ham meni o’ylaysan har on\n" +
                        "Singlim mening chehrasi gulgun \n" +
                        "Doim birga bo’lamiz ishon\n" +
                        "Qiyomat kuni kelsa ham bir kun ", ""
            ),
            model(
                R.drawable.img, "Samo Ham Yeg'laydi", "Tabiat qotilin ko`rib samo ham\n" +
                        "Bir zum mayus o`yga toladi\n" +
                        "Uning ham bugun ko`zlarida nam\n" +
                        "O`zining g`azabin yerga solida\n" +
                        "\n" +
                        "Yer yonar chaqmoqdan alanga olib\n" +
                        "Lek samo yig`ladi olov ham o`chdi\n" +
                        "Diliga u g`ururin solib\n" +
                        "G`amgin yuragi yuziga ko`chdi\n" +
                        "\n" +
                        "Mayus xomush turgan zaxoti\n" +
                        "Nogiron ojizga ko`rsatdi yo`lin\n" +
                        "Shunda uning dodu faryodi\n" +
                        "Falakda charaqlar oydanda to`lin…\n", ""
            ),
            model(
                R.drawable.img, "Huquq", "Kaftimda bir hovuch vatan tuprog’i\n" +
                        "Onaday ulug’ zotning mehr quchog’i\n" +
                        "Intizor yorlarning quvonchli chog’i\n" +
                        "Muqaddas ajdodim ota merosim \n" +
                        "\n" +
                        "Beshiklar tebranar allalar tinmas \n" +
                        "O’zbekistonimdan hech kim yuz burmas \n" +
                        "Mehr toblanadi  va lekin sinmas \n" +
                        "Adolatli hukm meni asosim\n" +
                        "\n" +
                        "Oddiy tinchlikdadir dunyoning baxti \n" +
                        "Hech zavol topmasin hayot daraxti\n" +
                        "Oddiy mehnatdadir insonning baxti \n" +
                        "Nohaqlik insonga bermasin bosim\n" +
                        "\n" +
                        "Oddiy adolatdan tug’ilgan huquq\n" +
                        "Har qanday insonga beradi uquv \n" +
                        "Tinchlik  osmonida suradi shukuh\n" +
                        "Kundan-kun yurtimga ortar havasim\n" +
                        "\n" +
                        "Huquq hayot tarzi so’z erkinligi\n" +
                        "Turli milllatlarning do’stu tengligi\n" +
                        "O’zbekistonimning bag’ri kengligi\n" +
                        "Diyorim dunyoga qilar tabbasum \n" +
                        "\n" +
                        "Deydilar har yerni qilmagin orzu \n" +
                        "Chunki har yerda bor toshu tarozi\n" +
                        "Kim kimlar  qilmaydi yurtimni orzu\n" +
                        "Men ona yurtimga qilaman tazim \n" +
                        "\n" +
                        "Adolatli yurtning tinchdur osmoni  \n" +
                        "Vijdon hayot tarsi butdir iymoni \n" +
                        "Kelajak xalqimning buyuk imkoni\n" +
                        "Poytaxtim, Toshkentim non shahri azim \n" +
                        "\n" +
                        "Halqimning huquqi erki qo’lida \n" +
                        "Kuchlar safarbardir tinchlik yo’lida\n" +
                        "Orzular –ezgular o’ngu-so’lida \n" +
                        "Men ona yurtimga qilaman ta’zim\n", ""
            ),
            model(
                R.drawable.img, "Musavvir", "Rasmlarni jonlantirgan istedodsan \n" +
                        "Mo’yqalamning  sohibisan  musavvir\n" +
                        "Bu jonlangan rasmlaring rangida\n" +
                        "Tuyg’uyingda yashiringan qanday  sir\n" +
                        "\n" +
                        "Tabiatni oq qog’ozga joylagan o’zing\n" +
                        "Rasm chizasan qilasan sabr \n" +
                        "Bunday voqeylikni shu oq qog’ozga \n" +
                        "Mehr bilan chizgan musavvir\n" +
                        "\n" +
                        "Portret-u natyurmort  usullarini\n" +
                        "Tirikdek tasvirlab amalda\n" +
                        "Ilhoming keldimi shoirga o’xshab \n" +
                        "Chizarsan tun-u kun mahalda\n" +
                        "\n" +
                        "Iqtidoring Xudodan ne`mat\n" +
                        "Bu yo’lning ham mashaqqati bor\n" +
                        "Ijodingdan to’xtama hech ham\n" +
                        "Shunda senga Alloh madadkor\n" +
                        "\n", ""
            ),
            model(
                R.drawable.img, "Bayrog'im", "O’zbekiston mening vatanim \n" +
                        "Bayrog`im xilpirar tinch osmonida\n" +
                        "Unga qurbon bo`lsin jonim-u tanim \n" +
                        "Mehri jo`sh uradi qizil qonimda \n" +
                        "\n" +
                        "Tog`laring go`zalmi saxiy bog`laring \n" +
                        "Ming ehson ulashar aziz tuprog`ing\n" +
                        "Onamday allalar dil ardoqlaring \n" +
                        "Men uchun azizdur chashmu qarog`ing \n" +
                        "\n" +
                        "Osuda tonglaring olamni qutlar \n" +
                        "Bayrog`im tinchlik deb beradi ovoz\n" +
                        "Olis bo’lsa hamki u o`zga yurtlar\n" +
                        "Ehtirom aylaydi o’zbeklarga xos\n" +
                        "\n" +
                        "To’lin oy yonida o`n ikki yulduz \n" +
                        "Chordona aylaydi yil sanog`ini\n" +
                        "Bu olamda yo`qdur ta`rifiga so`z\n" +
                        "Tugatib bo’lmaydi hech adog`ini\n" +
                        " \n" +
                        "Bugun o`zbek qizin olam taniydi\n" +
                        "Yigitlarin shuhrati shoni osmonda \n" +
                        "Ularday bayroqdor bolsam qaniydi \n" +
                        "Shundayin muborak qutlug` zamonda \n" +
                        "\n" +
                        "Bayrog`im muqaddas kuning muborak \n" +
                        "To`rt hil turfa rangda keding dunyoga\n" +
                        "Ming yilar ortidan sen berib darak \n" +
                        "Yarashib turibsan ko`hna ro`yoga \n" +
                        "\n" +
                        "Senga boqqanimda g`ururim ortib\n" +
                        "Shiddatim ufurar qaynoq qonimda \n" +
                        "Ona vatanimga mehrim ming ortib \n" +
                        "Ajdodlarim ruhi turar yonimda \n", ""
            ),
            model(
                R.drawable.img, "Xotira va Qadr", "Xotira o`tganlar xaqqi-hurmati\n" +
                        "Ajdodlar merosi mangu dastxati\n" +
                        "Shahidlar qonidan yaralgan exrom\n" +
                        "Mangu qurbonlarga mangu ehtirom\n" +
                        "\n" +
                        "Mushtipar  onaning mushfiq siymosi \n" +
                        "Poyida alanga o`rtab yonadi\n" +
                        "Onaizorlarning unsiz nidosi\n" +
                        "Farzandlar dog`iga qachon qonadi\n" +
                        "\n" +
                        "Ox essiz ox essiz sanoqsiz qurbon\n" +
                        "O`n sakkiz bahorni ko`rmay ketganlar\n" +
                        "Olamga hayqirib deya qonga qonib \n" +
                        "Go`yo murodiga mangu yetganlar\n" +
                        "\n" +
                        "Ox essiz ox essiz ajal deb uchgan \n" +
                        "O`qqa nishon bo`ldi gupurgan yurak\n" +
                        "Yorini visolin tushlarda quchgan\n" +
                        "Begunoh bir begunoh ko`krak\n" +
                        "    \n" +
                        "Ajaldan qo`rqmagan o`lim topmaydi\n" +
                        "Ul mardu maydonlar mangu sukutda \n" +
                        "Ular quyosh yanglig` mangu botmaydi\n" +
                        "Suvda cho`kmaydilar  yonmaydi o`tda \n" +
                        "\n" +
                        "Tinchi buzilmasin qutlug` zaminni\n" +
                        "Hech ham yovlashmasin elu elatlar\n" +
                        "Tinchi buzilmasin shu sokin tunni\n" +
                        "Do`st bo`lib yashasin turli millatlar \n" +
                        "\n" +
                        "Keksa ulug` faxriylarni ham \n" +
                        "Borligida qadr qilaylik\n" +
                        "Mushkuliga bo`lib bir malham \n" +
                        "Tinchlikni biz buyuk bilaylik\n" +
                        "\n" +
                        "Qonli janggohlardan sog` omon qaytib\n" +
                        "Vatan deb yongan buyuk insonlar \n" +
                        "Tinchlik deya hayqirib aytib \n" +
                        "Fido bo`lgan millionlab jonlar\n" +
                        "\n" +
                        "Shuncha daxshatlarni ko`rdingiz\n" +
                        "Shu dam xalqda bo`lingiz aziz \n" +
                        "Vatanni asragan ey fidoiylar\n" +
                        " Bugun tarixda qolar nomingiz  \n", ""
            ),
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}