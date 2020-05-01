package com.example.kotlinapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   // lateinit var userList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userList=ArrayList<User>()
        userList.add(User("Ahmed","Good","15","Suez"))
        userList.add(User("Mohamed","Bad","15","Suez"))
        userList.add(User("Samer","Exclent","15","Suez"))
        userList.add(User("Sief","Bad","15","Suez"))
        userList.add(User("Youssef","Bad","15","Suez"))
        recycleview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
       val userAdapter=UserAdapter(userList,this)
recycleview.adapter=userAdapter
    }
}
