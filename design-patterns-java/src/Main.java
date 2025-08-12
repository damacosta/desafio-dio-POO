package br.com.dio;

import br.com.dio.facade.OrderFacade;
import br.com.dio.strategy.BoletoPayment;
import br.com.dio.strategy.CorreiosFreight;
import br.com.dio.strategy.CreditCardPayment;
import br.com.dio.strategy.DHLFreight;

public class Main {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();

        System.out.println(">>> Pedido 1: Frete Correios, Pagamento Cartão");
        facade.processOrder(200.0, new CorreiosFreight(), new CreditCardPayment());

        System.out.println("\n");

        System.out.println(">>> Pedido 2: Frete DHL, Pagamento Boleto");
        facade.processOrder(500.0, new DHLFreight(), new BoletoPayment());
    }
}