package br.com.alura.exercicios.exercicio5;

public class ProdutoPerecivel extends Produto{

    private int dataDeValidade;

    public ProdutoPerecivel(String nome, int preco, int dataDeValidade) {
        super(nome, preco);
        this.dataDeValidade = dataDeValidade;
    }
}
