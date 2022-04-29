package com.successive.commissioncalculation.controller;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import com.successive.commissioncalculation.model.Trade;
import com.successive.commissioncalculation.validator.RequestValidator;

public class CommissionCalculationController {
  public List<String> getCommissionAmount(final List<Trade> trades){
    final RequestValidator validator = new RequestValidator();
    Function<Trade, Trade> func = validator::validateTrade;
    CompletionStage.thenApplyAsync(func);
    
  }
}
