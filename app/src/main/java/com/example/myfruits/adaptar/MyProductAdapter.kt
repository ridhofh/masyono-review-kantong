package com.example.myfruits.adaptar

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfruits.model.MyProductData


// ini bisa dihapus
// bikin adapter untuk card = cart adapter
class MyProductAdapter(private val myProductData: List<MyProductData>, context: Context) :
    RecyclerView.Adapter<MyProductAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        Glide.with(context).load(myProductData[position].primage)
//            .into<Target<Drawable>>(holder.primage)
//        holder.prprice.text = "₹." + myProductData[position].prprice
//        holder.primage.setOnClickListener(object : View.OnClickListener() {
//            fun onClick(v: View?) {
//                val intent = Intent(context, AddToCartActivity.class)
//                val imageurl = myProductData[position].primage
//                val prprice = myProductData[position].prprice
//                intent.putExtra("imageurl", imageurl)
//                intent.putExtra("prname", myProductData[position].prname)
//                intent.putExtra("prprice", prprice)
//                intent.putExtra("id", myProductData[position].id)
//                context.startActivity(intent)
//            }
//        })
    }

    override fun getItemCount(): Int {
        return myProductData.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val primage: ImageView
//        private val prprice: TextView
//
//        init {
//            primage = itemView.findViewById(R.id.primage) as ImageView
//            prprice = itemView.findViewById(R.id.txtprprice)
//        }
//
//        init {
//            this.context = context
//        }
    }

}
