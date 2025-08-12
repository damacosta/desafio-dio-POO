package br.com.dio.strategy;

public class DHLFreight implements FreightCalculationStrategy {
    @Override
    public double calculate(double orderTotal) {
        return orderTotal * 0.1;
    }
}
