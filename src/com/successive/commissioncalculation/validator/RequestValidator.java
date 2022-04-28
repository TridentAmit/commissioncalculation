package com.successive.commissioncalculation.validator;

import com.successive.commissioncalculation.model.Trade;

public class RequestValidator {
  public Trade validateTrade(Trade trade) {
    if(!("STO".equalsIgnoreCase(trade.getSecurityType()) || "BON".equalsIgnoreCase(trade.getSecurityType()) || "FX".equalsIgnoreCase(trade.getSecurityType()))) {
      throw new IllegalArgumentException("Not a valid security type");
    }
    if(!("BUY".equalsIgnoreCase(trade.getTransactionType()) || "SELL".equalsIgnoreCase(trade.getTransactionType()))){
      throw new IllegalArgumentException("Not a valid transaction type");
    }
    if(trade.getQuantity() < 1) {
      throw new IllegalArgumentException("Quantity should be more than 0");
    }
    if(trade.getSecurityPrice() <= 0) {
      throw new IllegalArgumentException("Price must be more than 0");
    }
    return trade;
  }

}
