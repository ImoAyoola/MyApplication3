package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentMove = "X"
    private lateinit var winLoseText: TextView = findViewById(R.id.winLose)
    private lateinit var button0: Button = findViewById(R.id.button0)
    private lateinit var button1: Button = findViewById(R.id.button1)
    private lateinit var button2: Button = findViewById(R.id.button2)
    private lateinit var button3: Button = findViewById(R.id.button3)
    private lateinit var button4: Button = findViewById(R.id.button4)
    private lateinit var button5: Button = findViewById(R.id.button5)
    private lateinit var button6: Button = findViewById(R.id.button6)
    private lateinit var button7: Button = findViewById(R.id.button7)
    private lateinit var button8: Button = findViewById(R.id.button8)
    private val buttonArray =
        button0,
        button1,
        button2,
        button3,
        button4,
        button5,
        button6,
        button7,
        button8,


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun changeCurrentMove() {
        if (currentMove == "X") {
            currentMove = "O"
        }else{
            currentMove = "X"
        }
    }

    private fun handleMove() {
        val win : Boolean = checkForWin()
        if(win){
            handleWin()
        }
        changeCurrentMove()
    }

    private fun handleWin(){

    }

    private fun checkRowForWin() : Boolean {
        for(row in 0..2){
            if(buttonArray[3*row] == buttonArray[3*row+1] && buttonArray[3*row+2] == buttonArray[2]){
                return true
            }
        }
        return false
    }

    private fun checkColForWin() : Boolean {
        for(row in 0..2){
            if(buttonArray[col] == buttonArray[col+3] && buttonArray[col+6] == buttonArray[2]){
                return true
            }
        }
        return false
    }

    private fun checkLDiagForWin() : Boolean {
        return (buttonArray[0] == buttonArray[4] && buttonArray[0] == buttonArray[8])
    }

    private fun checkRDiagForWin() : Boolean {
        return (buttonArray[2] == buttonArray[4] && buttonArray[2] == buttonArray[6])
    }

    private fun checkForWin() : Boolean {
        if(checkColForWin()) {
            return true
        } else if (checkRowForWin()){
            return true
        } else if (checkLDiagForWin()){
            return true
        } else if (checkRDiagForWin()){
            return true
        }
    }
    fun button0Clicked(view: View) {
        if (button0.text== ""){
            button0.text = currentMove
            handleMove()
        }
    }

    fun button1Clicked(view: View) {
        if (button1.text== ""){
            button1.text = currentMove
            handleMove()
        }
    }

    fun button2Clicked(view: View) {
        if (button2.text== ""){
            button2.text = currentMove
            handleMove()
        }
    }

    fun button3Clicked(view: View) {
        if (button3.text== ""){
            button3.text = currentMove
            handleMove()
        }
    }

    fun button4Clicked(view: View) {
        if (button4.text== ""){
            button4.text = currentMove
            handleMove()
        }
    }

    fun button5Clicked(view: View) {
        if (button5.text== ""){
            button5.text = currentMove
            handleMove()
        }
    }

    fun button6Clicked(view: View) {
        if (button6.text== ""){
            button6.text = currentMove
            handleMove()
        }
    }

    fun button7Clicked(view: View) {
        if (button7.text== ""){
            button7.text = currentMove
            handleMove()
        }
    }

    fun button8Clicked(view: View) {
        if (button8.text== ""){
            button8.text = currentMove
            handleMove()
        }
    }
}