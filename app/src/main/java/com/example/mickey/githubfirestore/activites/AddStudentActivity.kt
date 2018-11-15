package com.example.mickey.githubfirestore.activites

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mickey.githubfirestore.R
import kotlinx.android.synthetic.main.activity_add_student.*

class AddStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        btn_addStudentCancel.setOnClickListener {
            edt_addStudentIDNumber.text = null
            edt_addStudentFirstName.text = null
            edt_addStudentMiddleName.text = null
            edt_addStudentLastName.text =  null
            edt_addStudentCoarse.text = null
            edt_addStudentYearLevel.text = null
        }

        
    }
}
