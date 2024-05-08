package com.example.primera

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var total = 0
    private fun sumar(){
        total++
    }
    private fun restar(){
        total--

    }
    private fun multiplicar(){
        total = total * total
    }

    private fun dividir(){
        total = total / total
    }

    override fun onCreate(savedInstanceState: Bundle?) {
0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoContador.text = "0"

        botonSumar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                sumar()
                textoContador.text = total.toString()
                }
        })
        botonRestar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                restar()
                textoContador.text = total.toString()
            }
        })
        //haciendo funciones multiplicar
        botonMultiplicar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                multiplicar()
                textoContador.text = total.toString()
            }
        })
        //haciendo funciones division
        botonDividir.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                dividir()
                textoContador.text = total.toString()
            }


        })


    }

}