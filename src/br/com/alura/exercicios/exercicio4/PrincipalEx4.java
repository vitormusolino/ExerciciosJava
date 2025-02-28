package br.com.alura.exercicios.exercicio4;

public class PrincipalEx4 {
    public static void main(String[] args) {
        ConversorTempraturaPadrao conversor = new ConversorTempraturaPadrao();

        double temperaturaFahrenheit = 40;
        double temperaturaCelsius = conversor.getFahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " é igual a " + temperaturaCelsius + " graus celsius.");

        temperaturaCelsius = 30;
        temperaturaFahrenheit = conversor.getCelsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " é igual a " + temperaturaFahrenheit + " fahrenheits.");
    }
}
