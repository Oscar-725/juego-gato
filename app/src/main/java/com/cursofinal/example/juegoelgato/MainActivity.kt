package com.cursofinal.example.juegoelgato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.cursofinal.example.juegoelgato.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var arr = Array<CharArray>(3) { CharArray(3) { ' ' } }
    var tirada1 = true
    var isPlayerWinner: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        asignarBotones()
        restarting()

    }

    private fun validatePlayerWinner(playerCharacter: Char) {
        // Validacion horizaontal
             for (row in arr) {
                if (row[0] == playerCharacter && row[1] == playerCharacter && row[2] == playerCharacter) {
                    mensajeGanador(playerCharacter)
                    break
                }
             }
        // validacion vertical
        for (i in 0..2) {
                if (arr[0][i] == playerCharacter && arr[1][i] == playerCharacter && arr[2][i] == playerCharacter) {
                    mensajeGanador(playerCharacter)
                    break
                }
            }
        // validacion diagonal
            if (arr[0][0] == playerCharacter && arr[1][1] == playerCharacter && arr[2][2] == playerCharacter) {
                mensajeGanador(playerCharacter)
            }
            if (arr[0][2] == playerCharacter && arr[1][1] == playerCharacter && arr[2][0] == playerCharacter) {
                mensajeGanador(playerCharacter)
            }
    }
    private fun asignarBotones (){
        with(binding){
            var arrayButton =
        }
        binding.button1.setOnClickListener(){
            if (tirada1){
                arr[0][0] = 'x'
                binding.button1.text= "x"
                tirada1 = false
            }else{
                arr[0][0] = 'o'
                binding.button1.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[0][0])
        }
        binding.button2.setOnClickListener(){
            if (tirada1){
                arr[0][1] = 'x'
                binding.button2.text= "x"
                tirada1 = false
            }
            else{
                arr[0][1] = 'o'
                binding.button2.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[0][1])
        }
        binding.button3.setOnClickListener(){
            if (tirada1){
                arr[0][2] = 'x'
                binding.button3.text= "x"
                tirada1 = false
            }
            else{
                arr[0][2] = 'o'
                binding.button3.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[0][2])
        }
        binding.button4.setOnClickListener(){
            if (tirada1){
                arr[1][0] = 'x'
                binding.button4.text= "x"
                tirada1 = false
            }
            else{
                arr[1][0] = 'o'
                binding.button4.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[1][0])
        }
        binding.button5.setOnClickListener(){
            if (tirada1){
                arr[1][1] = 'x'
                binding.button5.text= "x"
                tirada1 = false
            }
            else{
                arr[1][1] = 'o'
                binding.button5.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[1][1])
        }
        binding.button6.setOnClickListener(){
            if (tirada1){
                arr[1][2] = 'x'
                binding.button6.text= "x"
                tirada1 = false
            }
            else{
                arr[1][2] = 'o'
                binding.button6.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[1][2])
        }
        binding.button7.setOnClickListener(){
            if (tirada1){
                arr[2][0] = 'x'
                binding.button7.text= "x"
                tirada1 = false
            }
            else{
                arr[2][0] = 'o'
                binding.button7.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[2][0])
        }
        binding.button8.setOnClickListener(){
            if (tirada1){
                arr[2][1] = 'x'
                binding.button8.text= "x"
                tirada1 = false
            }
            else{
                arr[2][1] = 'o'
                binding.button8.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[2][1])
        }
        binding.button9.setOnClickListener(){
            if (tirada1){
                arr[2][2] = 'x'
                binding.button9.text= "x"
                tirada1 = false
            }
            else{
                arr[2][2] = 'o'
                binding.button9.text= "o"
                tirada1 = true
            }
            validatePlayerWinner(arr[2][2])
        }

    }

    private fun restarting() {
        binding.buttonRestarting.setOnClickListener(){
            arr = Array<CharArray>(3) { CharArray(3) { ' ' } }
            binding.button1.text= ""
            binding.button2.text= ""
            binding.button3.text= ""
            binding.button4.text= ""
            binding.button5.text= ""
            binding.button6.text= ""
            binding.button7.text= ""
            binding.button8.text= ""
            binding.button9.text= ""
        }


    }

    private fun mensajeGanador(playerCharacter: Char){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Ganaste")
        builder.setMessage("${playerCharacter}")
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }



}


