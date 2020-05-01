package com.example.kotlinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinapps.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
//lateinit var userDetails :User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    val binding: ActivityDetailsBinding = DataBindingUtil.setContentView(
        this, R.layout.activity_details)
    val intent =getIntent()
       val userDetails=intent.getSerializableExtra("EXTRA_PEOPLE")as? User
   // Toast.makeText(this,""+userDetails?.name, Toast.LENGTH_SHORT).show()
binding.user=userDetails
    }
}
