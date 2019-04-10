package com.example.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val billAmount = billEditText.text.toString().toDouble()
            val tipPercentage = tipPercentageEditText.text.toString().toDouble()
            val tip = (billAmount * tipPercentage) / 100
            val total = billAmount + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(total)}"

        }

    }

    fun doubleToDollar(number:Double) : String {
        return "$" + String.format("%.2f", number)
    }
}
