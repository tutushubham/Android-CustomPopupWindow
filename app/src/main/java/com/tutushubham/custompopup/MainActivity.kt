package com.tutushubham.custompopup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mypopup = CustomPopupComponent(this, R.layout.popup_dialog)

        showBtn.setOnClickListener {
            mypopup.showPopup(root_layout)
        }

        hideBtn.setOnClickListener {
            mypopup.hidePopup()
        }


    }
}