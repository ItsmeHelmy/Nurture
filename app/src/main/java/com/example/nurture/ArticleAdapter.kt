//package com.example.nurture
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class ArticleAdapter(private val articleList:ArrayList<Article>)
//    : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>(){
//
//        class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//            val imageView: ImageView = itemView.findViewById(R.id.imageView)
//            val textView: TextView = itemView.findViewById(R.id.textView)
//        }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
//        return  ArticleViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
//        val article = articleList[position]
//        holder.imageView.setImageResource(article.image)
//        holder.textView.text = article.name.toString()
//    }
//
//    override fun getItemCount(): Int {
//        return articleList.size
//    }
//}