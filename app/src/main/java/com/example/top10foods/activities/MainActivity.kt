package com.example.top10foods.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.top10foods.R
import com.example.top10foods.adaptors.MainActAdaptor
import com.example.top10foods.interfaces.IMainActivityClickListener
import com.example.top10foods.models.BestFoodModel

class MainActivity : BaseActivity(), IMainActivityClickListener {
    private lateinit var mRecyclerViewFood: RecyclerView
    private lateinit var mTypesOfFoodList: ArrayList<BestFoodModel>
    private lateinit var mMainActAdaptor: MainActAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initVariable()
    }

    override fun initView() {
        mTypesOfFoodList = ArrayList();
        mRecyclerViewFood = findViewById<RecyclerView>(R.id.rv_foods)
    }

    override fun initVariable() {
        initData()
        mMainActAdaptor = MainActAdaptor(mTypesOfFoodList, this)
        val linearLayoutManager = LinearLayoutManager(this)
        mRecyclerViewFood.layoutManager = linearLayoutManager
        mRecyclerViewFood.adapter = mMainActAdaptor
        mMainActAdaptor.notifyDataSetChanged()
    }

    private fun initData() {
        val bestFoodModel = BestFoodModel()
        bestFoodModel.setTitle("10 Best Foods For Easy Weight Loss")
        bestFoodModel.setFoodDescription("Speed Up your weight loss")
        mTypesOfFoodList.add(bestFoodModel)

        // second
        val bestFoodModel2 = BestFoodModel()
        bestFoodModel2.setTitle("10 Best Foods For Flat Abd")
        bestFoodModel2.setFoodDescription("Melt away belly Fsy")
        mTypesOfFoodList.add(bestFoodModel2)

        // third
        val bestFoodModel3 = BestFoodModel()
        bestFoodModel3.setTitle("10 Best Foods For Healthy Skin")
        bestFoodModel3.setFoodDescription("Reduce you cholesterol")
        mTypesOfFoodList.add(bestFoodModel3)

    }

    override fun recyclerViewClickListener(title: String, description: String) {
        val intent = Intent(this, DescriptionActivity::class.java)
        intent.putExtra("TITLE", title)
        intent.putExtra("DESCRIPTION", description)
        startActivity(intent)
    }
}