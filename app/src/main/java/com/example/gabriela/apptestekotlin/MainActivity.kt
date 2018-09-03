package com.example.gabriela.apptestekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //lateinit para que a váriavel não precise ser inincializada, atribui o valor nulo a ela
    private lateinit  var edit_nome1: EditText
    private lateinit  var edit_nome2: EditText
    private lateinit  var txt_nome1: TextView
    private lateinit  var txt_nome2: TextView
    private lateinit  var txt_result: TextView
    private lateinit  var btn_consultar: Button
    private lateinit var nome1: String
    private lateinit var nome2: String
    private lateinit var nome1lenght: String
    private lateinit var nome2lenght: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        edit_nome1 = findViewById(R.id.edit_nome1) as EditText
        edit_nome2 = findViewById(R.id.edit_nome2) as EditText
        txt_nome1 = findViewById(R.id.txt_nome1) as TextView
        txt_nome2 = findViewById(R.id.txt_nome2) as TextView
        txt_result = findViewById(R.id.txt_result) as TextView
        btn_consultar = findViewById<Button>(R.id.btn_consultar) as Button

        fun tamanhoNomes(n1: String, n2: String){

            if (n1 > n2){
                txt_result.setText("O maior nome é: " + nome1)
            }

            else if (n1 == n2){
                txt_result.setText("Tem o mesmo tamanho")
            }

            else{
                txt_result.setText("O maior nome é: " + nome2)
            }


        }


        btn_consultar.setOnClickListener(View.OnClickListener {

                nome1 = edit_nome1.text.toString()
                nome1lenght = nome1.length.toString()
                txt_nome1.setText("nome 1= " + nome1lenght + " letras")

                nome2 = edit_nome2.text.toString()
                nome2lenght = nome2.length.toString()
                txt_nome2.setText("nome 2= " + nome2lenght + " letras")

                tamanhoNomes( nome1lenght,nome2lenght)


        })



    }
}
