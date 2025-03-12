package br.com.alura.exercicios.exercicio6;

public class Titulo implements Comparable<Titulo>{

    private String nome;

    public String getNome(){
        return nome;
    }

    public Titulo(String nome){
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
