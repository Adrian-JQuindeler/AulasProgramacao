package Empresas;

import java.util.Date;

import RelacionadosAsEmpresas.pedido;
import RelacionadosAsEmpresas.statusDoPedido;

public class vendaVarejo {
    public static void main(String[] args){

        pedido pedido = new pedido(100, new Date(), statusDoPedido.PAGAMENTP_PENDENTE);
        System.out.println(pedido);

        statusDoPedido sp1 = statusDoPedido.ENTREGUE;
        statusDoPedido sp2 = statusDoPedido.valueOf("ENTREGUE");

        System.out.println(sp1);
        System.out.println(sp2);
    }
}
