package com.example.registrationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.registrationapp.FoodMenuAdapter
import com.example.registrationapp.FoodItemsViewModel
import com.example.registrationapp.R



class FoodMenuFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL,false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<FoodItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
//        for (i in 1..20) {
//            data.add(ItemsViewModel(R.drawable.ic_baseline, "Item " + i))
//        }
        data.add(FoodItemsViewModel(R.drawable.pizza,"3000dram"))
        data.add(FoodItemsViewModel(R.drawable.sushi,"3500 dram"))
        data.add(FoodItemsViewModel(R.drawable.xorovac,"5000 dram"))
        data.add(FoodItemsViewModel(R.drawable.cocacola,"450 dram"))
        data.add(FoodItemsViewModel(R.drawable.gril,"2500 dram"))


        // This will pass the ArrayList to our Adapter
        val adapter = FoodMenuAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }


}