package com.example.top10foods.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.top10foods.R

class DescriptionActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        initView()
        initVariable()
    }

    override fun initView() {

    }

    override fun initVariable() {
        val intent: Intent = intent
        val title = intent.getStringExtra("TITLE")
        val description = intent.getStringExtra("DESCRIPTION")
        Toast.makeText(this, "$title $description",Toast.LENGTH_SHORT).show()
    }
}