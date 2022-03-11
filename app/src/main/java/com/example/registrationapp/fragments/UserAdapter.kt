package com.example.registrationapp.fragments

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.registrationapp.R
import com.example.registrationapp.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserInformationAdapterViewHolder>() {
    private val users = mutableListOf<User>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): UserInformationAdapterViewHolder {
        return UserInformationAdapterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.user_design, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UserInformationAdapterViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size

    @SuppressLint("NotifyDataSetChanged")
    fun update(usersList: List<User>) {
        this.users.clear()
        this.users.addAll(usersList)
        notifyDataSetChanged()
    }

    class UserInformationAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var emailText: TextView? = null

        private var passwordText: TextView? = null

        init {

            emailText = itemView.findViewById(R.id.emailText)

            passwordText = itemView.findViewById(R.id.passwordText)
        }

        fun bind(item: User) {

            emailText?.text = item.email
            passwordText?.text = item.password

        }
    }


}
