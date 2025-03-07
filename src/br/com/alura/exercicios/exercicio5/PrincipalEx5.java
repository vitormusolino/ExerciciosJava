package br.com.alura.exercicios.exercicio5;

import java.util.ArrayList;

public class PrincipalEx5 {
    public static void main(String[] args) {

        Produto produto = new Produto("Brinquedo",20);
        produto.setQuantidade(1);

        Produto produtoNovo = new Produto("Panela",35);
        produtoNovo.setQuantidade(2);

        Produto produtoAntigo = new Produto("Lápis",5);
        produtoAntigo.setQuantidade(5);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produtoAntigo);
        listaDeProdutos.add(produto);
        listaDeProdutos.add(produtoNovo);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Comida",20,2026);

        listaDeProdutos.add(produtoPerecivel);
        System.out.println(listaDeProdutos.get(3));
        System.out.println("Tamanho da lista " + listaDeProdutos.size());
        System.out.println("Lista de produtos: " + listaDeProdutos);
        System.out.println(listaDeProdutos.get(0).getNome());
    }
}
