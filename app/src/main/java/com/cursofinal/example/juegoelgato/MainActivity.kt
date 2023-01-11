package com.cursofinal.example.juegoelgato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.cursofinal.example.juegoelgato.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    //var arr = arrayOf(charArrayOf(' ',' ',' '), charArrayOf(' ',' ',' '), charArrayOf(' ',' ',' '))
    val arr = Array<CharArray>(3) { CharArray(3) { ' ' } }

    private val boxes = arrayOfNulls<Button>(9)
    private var turno1 = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        asignarBotones()
        arr[0][0]== 'x' && arr[1][0]== 'x' && arr[2][0]== 'x'
    }

    private fun validatePlayerWinner(playerCharacter: Char) {
        var isPlayerWinner: Boolean = false
        // Validacion horizaontal
        for (row in arr) {
            if(row[0] == playerCharacter && row[1] == playerCharacter && row[2] == playerCharacter) {
                println("Winner player${playerCharacter}")
                break
            }
        }

        // validacion vertical
        for (i in 0..2) {
            if(arr[0][i] == playerCharacter && arr[1][i] == playerCharacter && arr[2][i] == playerCharacter) {
                println("Winner player${playerCharacter}")
                break
            }
        }

        // validacion diagonal
        if(arr[0][0] == playerCharacter && arr[1][1] == playerCharacter && arr[2][2] == playerCharacter) {

        }

        if(arr[0][2] == playerCharacter && arr[1][1] == playerCharacter && arr[2][0] == playerCharacter) {

        }




        /*

        [(0,0),(0,1),(0,2)
        (1,0),(1,1),(1,2)
        (2,0),(2,1),(2,2)]

        [(0),(1),(2)
        (0),(1),(2)
        (0),(1),(2)]

         */
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

        boxes.forEach {button ->
            button?.setOnClickListener {
                    jugada(button)
                }
        }
        binding.buttonRestarting.setOnClickListener {
            clearAll()
        }
    }

    private fun jugada(button: Button) {
        if(button.text.toString() == "") {
            if (turno1) {
                button.text = "X"
                turno1=false
            } else {
                button.text = "O"
                turno1=true
            }
        }
        asignacionSimbolos()
    }

    private fun asignacionSimbolos() {
        val arrayTiradas = arrayOfNulls<String>(9)
        with(binding){

            arrayTiradas[0] = button1.text.toString()
            arrayTiradas[1] = button2.text.toString()
            arrayTiradas[2] = button3.text.toString()
            arrayTiradas[3] = button4.text.toString()
            arrayTiradas[4] = button5.text.toString()
            arrayTiradas[5] = button6.text.toString()
            arrayTiradas[6] = button7.text.toString()
            arrayTiradas[7] = button8.text.toString()
            arrayTiradas[8] = button9.text.toString()
        }






       /*val matriz = arrayOf(
            arrayOf(arrayTiradas[0], arrayTiradas[1],arrayTiradas[2]),
            arrayOf(arrayTiradas[3], arrayTiradas[4],arrayTiradas[5]),
            arrayOf(arrayTiradas[6], arrayTiradas[7],arrayTiradas[8]))*/

        for (i in 0..arrayTiradas.size-1){
            

        }


       /* if (arrayTiradas[0] == "X" && arrayTiradas[1] == "X" && arrayTiradas[2] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[3] == "X" && arrayTiradas[4] == "X" && arrayTiradas[5] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[6] == "X" && arrayTiradas[7] == "X" && arrayTiradas[8] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[0] == "X" && arrayTiradas[3] == "X" && arrayTiradas[6] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[1] == "X" && arrayTiradas[4] == "X" && arrayTiradas[7] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[2] == "X" && arrayTiradas[5] == "X" && arrayTiradas[8] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[0] == "X" && arrayTiradas[4] == "X" && arrayTiradas[8] == "X"){
            mensajeGanadorUno()
        }
        if (arrayTiradas[6] == "X" && arrayTiradas[4] == "X" && arrayTiradas[2] == "X"){
            mensajeGanadorUno()
        }

        if (arrayTiradas[0] == "O" && arrayTiradas[1] == "O" && arrayTiradas[2] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[3] == "O" && arrayTiradas[4] == "O" && arrayTiradas[5] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[6] == "O" && arrayTiradas[7] == "O" && arrayTiradas[8] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[0] == "O" && arrayTiradas[3] == "O" && arrayTiradas[6] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[1] == "O" && arrayTiradas[4] == "O" && arrayTiradas[7] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[2] == "O" && arrayTiradas[5] == "O" && arrayTiradas[8] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[0] == "O" && arrayTiradas[4] == "O" && arrayTiradas[8] == "O"){
            mensajeGanadorDos()
        }
        if (arrayTiradas[6] == "O" && arrayTiradas[4] == "O" && arrayTiradas[2] == "O"){
            mensajeGanadorDos()
        }*/
    }

    private fun mensajeGanadorUno(){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Ganaste")
        builder.setMessage("Jugador X")
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    private fun mensajeGanadorDos(){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Ganaste ")
        builder.setMessage("Jugador O")
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun clearAll(){
        boxes.forEachIndexed { index, button ->
            button?.text = ""
        }
        turno1 = true
    }

}