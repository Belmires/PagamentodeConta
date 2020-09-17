package com.example.pagamentodeconta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            if (editTextNumber.toString() != "" && editTextNumber2.toString() != ""){
                val valorConta = editTextNumber.text.toString().toDouble()
                val valorRecebido = editTextNumber2.text.toString().toDouble()
                val taxa = 15.00

                val total = valorConta + taxa
                textView6.text = "R$ $total"

                val troco = valorRecebido - total
                textView8.text = "R$ $troco"
            }
            button.setOnClickListener {
//                editTextNumber.text = ""
//                editTextNumber2.text = ""
                textView6.text = ""
                textView8.text = ""
            }
        }

    }


}


