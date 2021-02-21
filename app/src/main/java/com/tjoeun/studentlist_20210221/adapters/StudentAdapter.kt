package com.tjoeun.studentlist_20210221.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.tjoeun.studentlist_20210221.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}