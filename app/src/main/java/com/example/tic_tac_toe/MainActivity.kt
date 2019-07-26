package com.example.tic_tac_toe

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var text:String = "X"
    var turn:String="0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener {

            if(btn1.text==""){
                btn1.text=text
                if(btn1.text==btn2.text&&btn1.text==btn3.text||btn1.text==btn4.text&&btn1.text==btn7.text||
                    btn1.text==btn5.text&&btn1.text==btn9.text){
                    Toast.makeText(this,"${btn1.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()
            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }


        }


        btn2.setOnClickListener {

            if(btn2.text==""){
                btn2.text=text
                if(btn2.text==btn1.text&&btn2.text==btn3.text||btn2.text==btn5.text&&btn2.text==btn8.text){
                    Toast.makeText(this,"${btn2.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn3.setOnClickListener {

            if(btn3.text==""){
                btn3.text=text
                if(btn3.text==btn1.text&&btn3.text==btn2.text||btn3.text==btn6.text&&btn3.text==btn9.text||
                    btn3.text==btn5.text&&btn3.text==btn7.text){
                    Toast.makeText(this,"${btn3.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn4.setOnClickListener {
            if(btn4.text==""){
                btn4.text=text
                if(btn4.text==btn1.text&&btn4.text==btn7.text||btn4.text==btn5.text&&btn4.text==btn6.text){
                    Toast.makeText(this,"${btn4.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn5.setOnClickListener {
            if(btn5.text==""){
                btn5.text=text

                if(btn5.text==btn1.text&&btn5.text==btn9.text||btn5.text==btn3.text&&btn5.text==btn7.text||
                    btn5.text==btn2.text&&btn5.text==btn8.text||btn5.text==btn4.text&&btn5.text==btn6.text
                        ){
                    Toast.makeText(this,"${btn5.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }

                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn6.setOnClickListener {
            if(btn6.text==""){
                btn6.text=text
                if(btn6.text==btn3.text&&btn6.text==btn9.text||btn6.text==btn4.text&&btn6.text==btn5.text){
                    Toast.makeText(this,"${btn6.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn7.setOnClickListener {
            if(btn7.text==""){
                btn7.text=text
                if(btn7.text==btn1.text&&btn7.text==btn4.text||btn7.text==btn8.text&&btn7.text==btn9.text||
                    btn7.text==btn3.text&&btn7.text==btn5.text){
                    Toast.makeText(this,"${btn7.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn8.setOnClickListener {
            if(btn8.text==""){
                btn8.text=text
                if(btn8.text==btn2.text&&btn8.text==btn5.text||btn8.text==btn7.text&&btn8.text==btn9.text){
                    Toast.makeText(this,"${btn8.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }
        btn9.setOnClickListener {
            if(btn9.text==""){
                btn9.text=text
                if(btn9.text==btn1.text&&btn9.text==btn5.text||btn9.text==btn3.text&&btn9.text==btn6.text||
                    btn9.text==btn7.text&&btn9.text==btn8.text){
                    Toast.makeText(this,"${btn9.text} is a winner",Toast.LENGTH_LONG).show()
                    showdialog()

                }
                if(text=="X"){
                    text="O"
                }else if(text=="O"){
                    text="X"
                }
                checkdraw()

            }else{
                Toast.makeText(this,"No space available",Toast.LENGTH_SHORT).show()
            }
        }


    }
    fun checkdraw(){
        if (btn1.text != "" &&
            btn2.text != "" &&
            btn3.text != "" &&
            btn4.text != "" &&
            btn5.text != "" &&
            btn6.text != "" &&
            btn7.text != "" &&
            btn8.text != "" &&
            btn9.text != ""
        ){
            showdialog()
            Toast.makeText(this,"Game Draw",Toast.LENGTH_SHORT).show()
        }
    }
    fun cleartext(){
        btn1.text=""
        btn2.text=""
        btn3.text=""
        btn4.text=""
        btn5.text=""
        btn6.text=""
        btn7.text=""
        btn8.text=""
        btn9.text=""

    }
    fun showdialog(){
        val dialog=AlertDialog.Builder(this)
        val dialogview= layoutInflater.inflate(R.layout.custom_dialog,null)
        var ettext=dialogview.findViewById<TextView>(R.id.texttodisplay)
        dialog.setView(dialogview)
        dialog.setPositiveButton("Start a new Game",{dialogInterface: DialogInterface, i: Int -> cleartext()})
        dialog.show()

    }

}
