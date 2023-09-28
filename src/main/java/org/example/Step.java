package org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Step {

    private List<Pedido> pedidosPendentes = new ArrayList<>();

    public void addPedidoPendente(Pedido pedido){
        this.pedidosPendentes.add(pedido);
    }

    public boolean verificarPedidoComPendencia(Pedido pedido){
        return this.pedidosPendentes.contains(pedido);
    }
}
