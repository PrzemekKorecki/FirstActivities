package com.example.firstactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener { Toast.makeText(this,"hello", Toast.LENGTH_SHORT).show()
        var binaryStr:String=""
        var number:Int = editText2.text.toString().toInt()



            while (number !=0){
                if(number%2==0){
                    binaryStr="0"+binaryStr
                }
                else{
                    binaryStr="1"+binaryStr
                }
                number=number/2
            }
            textView.setText(binaryStr)
    }
    }

    override fun onPause() {
        super.onPause()
        button.setOnClickListener { Toast.makeText(this,"pause", Toast.LENGTH_SHORT).show()
    }
    }


}
