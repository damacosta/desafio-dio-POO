package br.com.dio.facade;

import br.com.dio.singleton.StoreSettings;
import br.com.dio.strategy.FreightCalculationStrategy;
import br.com.dio.strategy.PaymentStrategy;

public class OrderFacade {
    private StoreSettings settings;

    public OrderFacade() {
        this.settings = StoreSettings.getInstance();
    }

    public void processOrder(double orderTotal,
                             FreightCalculationStrategy freightStrategy,
                             PaymentStrategy paymentStrategy) {
        System.out.println("--- Novo Pedido ---");

        double freightCost = freightStrategy.calculate(orderTotal);
        double totalWithFreight = orderTotal + freightCost;
        System.out.println("Frete calculado: R$" + freightCost);

        boolean paymentSuccessful = paymentStrategy.processPayment(totalWithFreight);
        if (paymentSuccessful) {
            System.out.println("Pagamento processado com sucesso!");

            System.out.println("Notificando cliente via e-mail. Usando a API: " + settings.getEmailServiceApiKey());
        } else {
            System.out.println("Falha no processamento do pagamento.");
        }
        System.out.println("--------------------");
    }
}