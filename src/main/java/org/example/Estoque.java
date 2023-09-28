package org.example;

public class Estoque extends Step{

    private static Estoque estoque = new Estoque();

    private Estoque(){}

    public static Estoque getInstance(){
        return estoque;
    }

}
