package com.example.registrationapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.registrationapp.R
import com.example.registrationapp.User
import com.example.registrationapp.Users


class ClientFragment : Fragment() {
    lateinit var reciclerViewUser:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_client, container, false)
        val recyclerView = view?.findViewById(R.id.recyclerviewUser) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)


        val users = ArrayList<User>()
        users.addAll(Users.users.values)
        val adapter = UserAdapter()
        adapter.update(users)
        recyclerView.adapter = adapter
        return view


    }




    }
