import org.example.Estoque;
import org.example.Pagamento;
import org.example.Pedido;
import org.example.PedidoFacade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {


    @Test
    void deveRetornarItemSemEstoque(){
        Pedido pedido = new Pedido();

        Estoque.getInstance().addPedidoPendente(pedido);
        assertEquals("Item fora de estoque",
                PedidoFacade.verificaPendenciasEnvioPedido(pedido));
    }

    @Test
    void deveRetornarPagamentoPendente(){
        Pedido pedido = new Pedido();

        Pagamento.getInstance().addPedidoPendente(pedido);
        assertEquals("Falha no pagamento do pedido",
                PedidoFacade.verificaPendenciasEnvioPedido(pedido));
    }


    @Test
    void deveRetornarEnvioPedido(){
        Pedido pedido = new Pedido();
        assertEquals("Pedido efetuado com sucesso, pronto para envio",
                pedido.enviarPedido());
    }

}
