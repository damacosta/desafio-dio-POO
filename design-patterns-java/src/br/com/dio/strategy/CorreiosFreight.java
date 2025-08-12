package br.com.dio.strategy;

public class CorreiosFreight implements FreightCalculationStrategy {
    @Override
    public double calculate(double orderTotal) {
        return 15.0;
    }
}
