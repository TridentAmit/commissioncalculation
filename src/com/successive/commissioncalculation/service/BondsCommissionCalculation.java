package com.successive.commissioncalculation.service;

import com.successive.commissioncalculation.model.Trade;

public class BondsCommissionCalculation implements CommissionCalculation{

  @Override
  public String getCommissionAmount(Trade trade) {
    double commissionAmount = 0;
    if("BUY".equalsIgnoreCase(trade.getTransactionType())) {
      commissionAmount = getCommissionAmountForBuy(trade.getQuantity(),trade.getSecurityPrice());
    }else if("SELL".equalsIgnoreCase(trade.getTransactionType())) {
      commissionAmount = getCommissionAmountForSell(trade.getQuantity(),trade.getSecurityPrice());
    }
    return new StringBuilder("$").append(String.valueOf(commissionAmount)).toString();
  }
  private double getCommissionAmountForBuy(long quantity, double securityPrice) {
    return (quantity * securityPrice)*(0.02/100);
  }
  
  private double getCommissionAmountForSell(long quantity, double securityPrice) {
    return (quantity * securityPrice)*(0.01/100);
  }
  

}
