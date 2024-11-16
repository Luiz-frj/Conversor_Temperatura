package br.edu.ifsp.dmo.conversordetemperatura.model

interface TemperatureConverter {
    //Este metodo define o comportamento de todas as classes que implementam a interface
    fun converter(temperature: Double): Double;

    //O metodo retorna a escala de temperatura convertida
    fun getScale(): String;
}