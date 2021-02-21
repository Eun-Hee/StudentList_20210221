package com.tjoeun.studentlist_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.studentlist_20210221.datas.Student

class MainActivity : AppCompatActivity() {

//    실제 학생들을 담아줄 목록 변수.

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("조경진", 1988))
        mStudentList.add(Student("강서영", 1990))
        mStudentList.add(Student("김윤경", 1981))
        mStudentList.add(Student("박은희", 1970))
        mStudentList.add(Student("신정범", 1989))
        mStudentList.add(Student("오이슬", 1994))
        mStudentList.add(Student("이예슬", 1990))
        mStudentList.add(Student("이지인", 1996))
        mStudentList.add(Student("채명호", 1973))
        mStudentList.add(Student("최원종", 1967))
        mStudentList.add(Student("최윤정", 1987))

    }
}