package org.example;

public class PedidoFacade {

    public static String verificaPendenciasEnvioPedido(Pedido pedido){
        if(Estoque.getInstance().verificarPedidoComPendencia(pedido)){
            return "Item fora de estoque";
        }
        if(Pagamento.getInstance().verificarPedidoComPendencia(pedido)){
            return "Falha no pagamento do pedido";
        }
        return "Pedido efetuado com sucesso, pronto para envio";
    }
}
