package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bunumberEvent(view: View) {
        val buton= view as Button
        var btnvalue:String=txtbresult.text.toString()

        if(buton.text=="1")
        {
            btnvalue+="1"

        }
        else if(buton.text=="2")
        {
            btnvalue+="2"

        }
        else if(buton.text=="3")
        {
            btnvalue+="3"

        }
        else if(buton.text=="4")
        {
            btnvalue+="4"

        }
        else if(buton.text=="5")
        {
            btnvalue+="5"

        }
        else if(buton.text=="6")
        {
            btnvalue+="6"

        }
        else if(buton.text=="7")
        {
            btnvalue+="7"

        }
        else if(buton.text=="8")
        {
            btnvalue+="8"

        }
        else if(buton.text=="9")
        {
            btnvalue+="9"

        }
        else if(buton.text=="+/-")
        {
            btnvalue="-"+btnvalue
            btnplsmin.isEnabled=false
        }
        else if(buton.text==".")
        {
            btnvalue+="."
            btndot.isEnabled=false
        }
        else if(buton.text=="0")
        {
            btnvalue+="0"
        }
   txtbresult.setText(btnvalue)
    }
    var num1=txtbresult.text.toString()
    var value="+"
    fun btnselct(view: View) {
        num1=txtbresult.text.toString()
        var btnval=view as Button
        if(btnval.text=="+")
        {
//            txtbresult.setText("${txtbresult.text} +")
            value="+"
            txtbresult.setText("")

        }
        else if (btnval.text=="-")
        {
            value="-"
            txtbresult.setText("")
        }
        else if (btnval.text=="*")
        {
            value="*"
            txtbresult.setText("")
        }
        else if (btnval.text=="/")
        {
            value="/"
            txtbresult.setText("")
        }


    }

    fun resultset(view: View) {

        var num2=txtbresult.text.toString()
        var ans:Double=0.0
        if(value=="+")
        {
            txtbresult.setText("")
            ans=num1.toDouble()+num2.toDouble()
            txtbresult.setText(ans.toString() )
        }
        else if(value=="-")
        {
            txtbresult.setText("")
            ans=num1.toDouble()-num2.toDouble()
            txtbresult.setText(ans.toString() )
        }
        else if(value=="*")
        {
            txtbresult.setText("")
            ans=num1.toDouble()*num2.toDouble()
            txtbresult.setText(ans.toString() )
        }
        else if(value=="/")
        {
            txtbresult.setText("")
            ans=num1.toDouble()/num2.toDouble()
            txtbresult.setText(ans.toString() )
        }
    }
}