package Construtores;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Honda Fit EXL 2021", 93.999, 1);
        Produto p2 = new Produto("Pacote Salsicha Sadia 500g", 14.99, 16);
        Produto p3 = new Produto("Pão de Cachorro Quente 900g", 20.99, 10);
        ProdutoPerecivel pp1 = new ProdutoPerecivel("Talharim Frango", 16.14, 1, "01/01/2025");



        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
        System.out.println(pp1);



    }
}
