package org.example;

public class Pagamento extends Step{
    private static Pagamento pagamento = new Pagamento();

    private Pagamento(){}

    public static Pagamento getInstance(){
        return pagamento;
    }
}
