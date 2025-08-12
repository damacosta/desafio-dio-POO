package br.com.dio.strategy;

public interface PaymentStrategy {
    boolean processPayment(double amount);
}