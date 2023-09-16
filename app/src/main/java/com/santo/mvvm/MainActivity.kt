package com.santo.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.santo.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainbinding: ActivityMainBinding
    private lateinit var mainviewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding = ActivityMainBinding.inflate(layoutInflater)
        mainviewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val view = mainbinding.root
        setContentView(view)

        val sumaobserver = Observer<Double>{suma->
            mainbinding.resultadotextView.setText(suma.toString())
        }
        mainviewModel.suma.observe(this,sumaobserver)

        /*val errorMsgObserver = Observer<String>{errorMsg->
            Snackbar.make(view,errorMsg,Snackbar.LENGTH_INDEFINITE)
                .setAction("aceptar"){}
                .show()


        }*/
        val mensajeobserver = Observer<String>{mensaje->
            mainbinding.resultadotextView.setText(mensaje.toString())
        }

        mainviewModel.mensaje.observe(this,mensajeobserver)

        val restaObserver = Observer<Double>{resta->
            mainbinding.resultadotextView.setText(resta.toString())
        }
        mainviewModel.resta.observe(this,restaObserver)

        val multiplicacionobserver = Observer<Double>{multiplicacion->
            mainbinding.resultadotextView.setText(multiplicacion.toString())
        }
        mainviewModel.multiplicacion.observe(this,restaObserver)

        val divisionobserver = Observer<Double>{division->
            mainbinding.resultadotextView.setText(division.toString())
        }


        mainbinding.sumarboton.setOnClickListener {
            mainviewModel.validateNumber(mainbinding.firstnumberEditText.text.toString(),mainbinding.seconTextinput.text.toString())
            /*if(mainbinding.firstnumberEditText.text.toString().isEmpty() || mainbinding.seconTextinput.text.toString().isEmpty()){
                Snackbar.make(view,"debe digitar 2 numero",Snackbar.LENGTH_INDEFINITE)
                    .setAction("aceptar"){}
                    .show()
            } else {
                val Number1 = mainbinding.firstnumberEditText.text.toString().toDouble()
                val Number2 = mainbinding.seconTextinput.text.toString().toDouble()
                val total = Number1 + Number2
                mainbinding.resultadotextView.setText(total.toString())

            }*/


        }
        mainbinding.restbutton2.setOnClickListener {
            mainviewModel.validateNumberresta(mainbinding.firstnumberEditText.text.toString(),mainbinding.seconTextinput.text.toString())
            /*if(mainbinding.firstnumberEditText.text.toString().isEmpty() || mainbinding.seconTextinput.text.toString().isEmpty()){
                Snackbar.make(view,"debe digitar 2 numero",Snackbar.LENGTH_INDEFINITE)
                    .setAction("aceptar"){}
                    .show()
            } else {
                val Number1 = mainbinding.firstnumberEditText.text.toString().toDouble()
                val Number2 = mainbinding.seconTextinput.text.toString().toDouble()
                val total = Number1 + Number2
                mainbinding.resultadotextView.setText(total.toString())

            }*/


        }
        mainbinding.multibutton3.setOnClickListener {
            mainviewModel.validateNumbermultiplicacion(mainbinding.firstnumberEditText.text.toString(),mainbinding.seconTextinput.text.toString())
            /*if(mainbinding.firstnumberEditText.text.toString().isEmpty() || mainbinding.seconTextinput.text.toString().isEmpty()){
                Snackbar.make(view,"debe digitar 2 numero",Snackbar.LENGTH_INDEFINITE)
                    .setAction("aceptar"){}
                    .show()
            } else {
                val Number1 = mainbinding.firstnumberEditText.text.toString().toDouble()
                val Number2 = mainbinding.seconTextinput.text.toString().toDouble()
                val total = Number1 + Number2
                mainbinding.resultadotextView.setText(total.toString())

            }*/


        }
        mainbinding.divbutton4.setOnClickListener {
            mainviewModel.validateNumberdivision(mainbinding.firstnumberEditText.text.toString(),mainbinding.seconTextinput.text.toString())
            /*if(mainbinding.firstnumberEditText.text.toString().isEmpty() || mainbinding.seconTextinput.text.toString().isEmpty()){
                Snackbar.make(view,"debe digitar 2 numero",Snackbar.LENGTH_INDEFINITE)
                    .setAction("aceptar"){}
                    .show()
            } else {
                val Number1 = mainbinding.firstnumberEditText.text.toString().toDouble()
                val Number2 = mainbinding.seconTextinput.text.toString().toDouble()
                val total = Number1 + Number2
                mainbinding.resultadotextView.setText(total.toString())

            }*/


        }
    }
}