package br.com.alura.exercicios.exercicio4;

public class ConversorTempraturaPadrao implements ConversorTemperatura{


    @Override
    public double getCelsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double getFahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
