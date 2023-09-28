package org.example;

public class Pedido {
    public String enviarPedido(){
        return PedidoFacade.verificaPendenciasEnvioPedido(this);
    }
}
