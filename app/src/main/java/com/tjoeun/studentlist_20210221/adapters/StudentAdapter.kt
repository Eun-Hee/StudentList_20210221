package com.tjoeun.studentlist_20210221.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeun.studentlist_20210221.R
import com.tjoeun.studentlist_20210221.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

//    student_list_item xml을 가지고 => 코틀린에서 다룰수 있게 도와주는 변수. (inf) 클래스 (LayoutInflater)
      val inf = LayoutInflater.from(mContext)

    @SuppressLint("InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        return row
    }
}