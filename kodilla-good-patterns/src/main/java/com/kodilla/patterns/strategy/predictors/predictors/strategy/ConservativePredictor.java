package com.kodilla.patterns.strategy.predictors.predictors.strategy;

import com.kodilla.patterns.strategy.predictors.predictors.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
