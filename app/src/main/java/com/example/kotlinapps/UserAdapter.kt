package com.example.kotlinapps

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class UserAdapter(val userList: ArrayList<User> ,val context:Context) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userOnclick: UserItemClickListner? = null
        val name = itemView.findViewById(R.id.name) as TextView
        val grade = itemView.findViewById(R.id.grade) as TextView
        val button = itemView.findViewById(R.id.view_profile) as Button


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return UserViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
interface UserItemClickListner{
    fun onUserItemClick(view :View ,position: Int)
}
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user: User = userList[position]
        holder.name.text = user.name
        holder.grade.text = user.grade
        holder.button.setOnClickListener {
            Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show()
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("EXTRA_PEOPLE", user)
            context.startActivity(intent)
        }

    }
}