package com.bornfight.libraries

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bornfight.animicons.AnimiconDrawable
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        likeBtn.setImageDrawable(
                AnimiconDrawable.create(this, R.drawable.ic_like))
        likeBtn.setOnClickListener { v -> v.isSelected = !v.isSelected }

        wellDoneBtn.setImageDrawable(
                AnimiconDrawable.create(this, R.drawable.ic_star, R.style.StarIconStyle))
        wellDoneBtn.setOnClickListener { v -> v.isSelected = !v.isSelected }
    }
}
