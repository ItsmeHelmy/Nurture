//package com.example.nurture
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
//private lateinit var recyclerView: RecyclerView
//private lateinit var articleList: ArrayList<Article>
//private lateinit var adapter: ArticleAdapter
//
//lateinit var imageId : Array<Int>
//lateinit var name : Array<String>
//
//
///**
// * A simple [Fragment] subclass.
// * Use the [HomeFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
//class HomeFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home_fragment, container, false)
//    }
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment home_fragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            HomeFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        dataInitialize()
//        val layoutManager = LinearLayoutManager(context)
//        recyclerView = view.findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.setHasFixedSize(true)
//        adapter = ArticleAdapter(articleList)
//        recyclerView.adapter = adapter
//    }
//}
//
//
//    @SuppressLint("SuspiciousIndentation")
//    private fun dataInitialize(){
//
//        articleList = arrayListOf()
//
//        imageId = arrayOf(
//            R.drawable.rectangle_1,
//            R.drawable.rectangle_2,
//            R.drawable.rectangle_67,
//            R.drawable.rectangle_69,
//            R.drawable.rectangle_70,
//            R.drawable.rectangle_72,
//            R.drawable.rectangle_74
//        )
//
//        name = arrayOf(
//            arrayOf(
//                R.string.name_1,
//                R.string.name_2,
//                R.string.name_3,
//                R.string.name_4,
//                R.string.name_5,
//                R.string.name_6,
//                R.string.name_7
//            ).toString()
//        )
//
//        for(i in imageId.indices){
//
//         val article = Article(imageId[i], name[i])
//            articleList.add(article)
//        }
//    }