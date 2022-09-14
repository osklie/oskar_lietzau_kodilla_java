package com.kodilla.patterns.strategy.predictors.predictors.strategy;

import com.kodilla.patterns.strategy.predictors.predictors.strategy.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {

        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}