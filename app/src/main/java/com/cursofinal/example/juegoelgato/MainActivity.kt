package com.cursofinal.example.juegoelgato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cursofinal.example.juegoelgato.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding



    private val boxes = arrayOfNulls<Button>(10)
    val array = arrayOf("X,O,X,O,X,O,X,O,X")
    private val jugadorUno = "X"
    private val jugadorDos = "O"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        asignarBotones()
    }

    private fun asignarBotones (){

        with(binding){
            boxes[0] = button1
            boxes[1] = button2
            boxes[2] = button3

            boxes[3] = button4
            boxes[4] = button5
            boxes[5] = button6

            boxes[6] = button7
            boxes[7] = button8
            boxes[8] = button9
        }

        boxes.forEach {
            it.setOnClickListener {

            }
        }



    }

}