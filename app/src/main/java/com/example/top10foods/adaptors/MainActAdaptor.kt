package com.example.top10foods.adaptors

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.top10foods.models.BestFoodModel
import java.security.AccessControlContext

public class MainActAdaptor(foodList: ArrayList<BestFoodModel>, context: Context) :
    RecyclerView.Adapter<MainActAdaptor.MyViewHolder>() {

    private lateinit var mContext: Context
    private lateinit var mFoodList: ArrayList<BestFoodModel>

    fun MainActAdaptor(foodList: ArrayList<BestFoodModel>, context: Context): Unit {
        this.mFoodList = foodList
        this.mContext = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}