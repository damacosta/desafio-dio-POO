package br.com.dio.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processando pagamento de R$" + amount + " via Cartão de Crédito.");
        return true;
    }
}