package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Recuperar os componentes EditText
        //Criar uma variavel e associar o componente de UI

        val edt_peso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edt_altura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btn_calcular =findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener{
            val peso: Float = edt_peso.text.toString().toFloat()
            val altura: Float = edt_altura.text.toString().toFloat()

           val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
            println("açao do botao Herick" + resultado )
        }

    }
}