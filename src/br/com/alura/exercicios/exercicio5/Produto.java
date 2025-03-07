package br.com.alura.exercicios.exercicio5;

public class Produto {

    private String nome;
    private int preco;
    private int quantidade;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: R$" + getPreco();
    }
}
