package br.com.dio.strategy;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Gerando boleto para pagamento de R$" + amount + ".");
        return true;
    }
}
