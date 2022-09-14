package com.kodilla.patterns.strategy.predictors.predictors.strategy;

import com.kodilla.patterns.strategy.predictors.predictors.strategy.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}