package com.example.top10foods.models

class BestFoodModel() {

    private lateinit var foodTitle: String
    private lateinit var foodDescription: String

    public fun setTitle(title: String): Unit {
        foodTitle = title;
    }

    public fun getTitle(): String {
        return foodTitle;
    }

    public fun setFoodDescription(description: String): Unit {
        foodDescription = description
    }

    public fun getDescription(): String {
        return foodDescription
    }
}