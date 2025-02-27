package br.com.alura.exercicios.exercicio3;

public class TabuadaMultiplicacao implements Tabuada{


    @Override
    public int getTabuada(int numeroTabuada) {
        int i = 0;
        int valorMultiplicacao;
         for(int x = 0; x <= 10; x++){
            valorMultiplicacao = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + valorMultiplicacao );
            i++;
         }
        return 0;
    }
}
