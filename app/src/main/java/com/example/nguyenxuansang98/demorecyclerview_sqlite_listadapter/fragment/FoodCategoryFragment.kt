package com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.R
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.adapter.FoodAdapter
import com.example.nguyenxuansang98.demorecyclerview_sqlite_listadapter.model.Food
import kotlinx.android.synthetic.main.fragment_food_category.*

/**
 * A simple [Fragment] subclass.
 */
class FoodCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_food_category, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fruits = mutableListOf(
            Food(1,"Cá Kho","https://ameovat.com/wp-content/uploads/2016/01/cach-kho-ca-ngon-8-600x443.png","0"),
            Food(2,"Lợn Nướng","https://thumb.ex-cdn.com/EXP/media.phunutoday.vn/resize/400x250/files/dataimages/201608/31/original/cach-lam-than-nuong-tieu-phunutodayvn_1472612146.jpg","0"),
            Food(3,"Thịt Bò Xào","https://photo-2-baomoi.zadn.vn/w700_r1/2018_05_15_181_26033803/666ae6c30382eadcb393.jpg","0"),
            Food(4,"Thịt Bò Xào Hành Lá","https://photo-2-baomoi.zadn.vn/w700_r1/2018_05_15_181_26033803/a12baf8d4acca392fadd.jpg","0")
        )
        val foodAdapter = FoodAdapter()
        recycler_foodCategory.layoutManager = LinearLayoutManager(context)
        recycler_foodCategory.adapter = foodAdapter
        foodAdapter.submitList(fruits)

    }
}
