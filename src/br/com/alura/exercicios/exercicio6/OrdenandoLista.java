package br.com.alura.exercicios.exercicio6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenandoLista {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.add(1);
        lista.add(6);
        lista.add(9);
        lista.add(4);

        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        Titulo nome1 = new Titulo("Vitor");
        Titulo nome2 = new Titulo("Athos");
        Titulo nome3 = new Titulo("Caio");
        Titulo nome4 = new Titulo("Luiz");
        Titulo nome5 = new Titulo("Bolivia");

        ArrayList<Titulo> listaNomes = new ArrayList<>();
        listaNomes.add(nome1);
        listaNomes.add(nome2);
        listaNomes.add(nome3);
        listaNomes.add(nome4);
        listaNomes.add(nome5);
        System.out.println(listaNomes);

        Collections.sort(listaNomes);
        System.out.println(listaNomes);

        for (Titulo titulo : listaNomes){
            System.out.println(titulo.getNome());
        }
    }
}
