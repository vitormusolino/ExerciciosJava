package br.com.alura.exercicios.exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{



    @Override
    public double getCalcularArea(double altura, double largura) {
        double resultadoArea = altura * largura;
        System.out.println("A área desse retângulo é: "+resultadoArea);
        return 0;
    }

    @Override
    public double getCalcularPerimetro(double altura, double largura) {
        double resultadoPerimetro =  2 * (altura + largura);
        System.out.println("O perimetro deste retângulo é: " + resultadoPerimetro);
        return 0;
    }
}
