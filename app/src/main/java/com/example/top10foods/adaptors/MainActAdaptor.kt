package com.example.top10foods.adaptors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.top10foods.R
import com.example.top10foods.interfaces.IMainActivityClickListener
import com.example.top10foods.models.BestFoodModel

public class MainActAdaptor(
    private val foodList: ArrayList<BestFoodModel>,
    private val mainActivityClickListener: IMainActivityClickListener
) : RecyclerView.Adapter<MainActAdaptor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val foodModel = foodList[position]
        holder.title.text = foodModel.getTitle()
        holder.description.text = foodModel.getDescription()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var title: TextView = itemView.findViewById(R.id.tv_title)
        var description: TextView = itemView.findViewById(R.id.tv_description)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            mainActivityClickListener.recyclerViewClickListener(
                foodList.get(adapterPosition).getTitle(), foodList.get(adapterPosition).getTitle()
            )
        }
    }

}