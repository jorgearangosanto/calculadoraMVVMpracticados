package com.santo.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    val suma: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    val resta: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    val multiplicacion: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    val division: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    /*private val _errorMsg=MutableLiveData<String> = MutableLiveData()
    val errorMsg :LiveData<String> = _errorMsg*/
    val mensaje:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    fun validateNumber(number1: String, number2: String) {
        if (number1.isEmpty() || number2.isEmpty()) {
            mensaje.value = "debe digitar 2 numeros"
        } else {
            suma.value = number1.toDouble() + number2.toDouble()

        }
    }

    fun validateNumberresta(number1: String, number2: String) {
        if (number1.isEmpty() || number2.isEmpty()) {
            mensaje.value = "debe digitar 2 numeros"
        } else {
            resta.value = number1.toDouble() - number2.toDouble()

        }

    }

    fun validateNumbermultiplicacion(number1:  String, number2: String) {
        if (number1.isEmpty() || number2.isEmpty()) {
            mensaje.value = "debe digitar 2 numeros"
        } else {
            multiplicacion.value = number1.toDouble() * number2.toDouble()

        }

    }

    fun validateNumberdivision(number1: String, number2: String) {
        if (number1.isEmpty() || number2.isEmpty()) {
            mensaje.value = "debe digitar 2 numeros"
        } else {
            division.value = number1.toDouble() / number2.toDouble()

        }

    }


}

