package com.hakboub;

public class Context {

    private Strategy strategy = new DefaultStrategyImpl();

    public void perform() {
        System.out.println("########### Début de l'opération ####");
        System.out.println("*********** Initialisation ***********");
        strategy.apply();
        System.out.println("======= Nettoyage =====");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = (strategy == null) ? new DefaultStrategyImpl() : strategy;
    }
}