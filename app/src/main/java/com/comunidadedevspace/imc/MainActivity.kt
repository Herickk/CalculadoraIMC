package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Recuperar os componentes EditText
        //Criar uma variavel e associar o componente de UI

        val edt_peso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edt_altura = findViewById<TextInputEditText>(R.id.edt_altura)
       //validar_campos_vazio
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener {
            val pesoStr: String = edt_peso.text.toString()
            val alturaStr: String = edt_altura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                //Mostrar mensagem para usuario
                Snackbar
                    .make(
                    edt_peso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val peso= pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2



        val btn_calcular =findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener{
            val peso: Float = edt_peso.text.toString().toFloat()
            val altura: Float = edt_altura.text.toString().toFloat()

           val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            }
                 //Navegar para proxima tela
                //criar o layout da proxima tela
                //passar dados (resultado)para proxima tela

                //Intent- Classe do propio android
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("KEY_RESULT_IMC", resultado)
                startActivity(intent)




                println("Essa e a altura indicada" + alturaStr)
            }

        }
    }
}