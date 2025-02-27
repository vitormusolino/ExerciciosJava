package br.com.alura.exercicios.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double getConverterDolarParaReal(double valorDolar) {
        double valorReal;
        double cotacaoDolar = 5.81;
        valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é R$" + valorReal);

        return valorReal;
    }
}
