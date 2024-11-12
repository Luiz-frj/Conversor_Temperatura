package br.edu.ifsp.dmo.conversordetemperatura.model

class CelsiusStrategy: ConversorTemperatura{
    override fun converter(temperature: Double): Double = (temperature - 32) / 1.8;

    /*
    override fun converter(temperature: Double): Double {
        return (temperature - 32) / 1.8;
    }
     */

    override fun getScale(): String = "ºC";

    /*
    override fun getScale(): String{
        return "ºC";
    }
     */

}