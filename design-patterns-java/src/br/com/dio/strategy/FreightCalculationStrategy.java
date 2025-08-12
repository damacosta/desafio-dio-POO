package br.com.dio.strategy;

public interface FreightCalculationStrategy {
    double calculate(double orderTotal);
}