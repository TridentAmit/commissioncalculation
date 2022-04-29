package com.successive.commissioncalculation.validator;

import com.successive.commissioncalculation.model.Trade;

/**
 * This class validates the request for correct input set in Trade object
 * 
 * @author amitkumar
 *
 */
public class RequestValidator {
  public String validateTrade(Trade trade) {
    if (!("STO".equalsIgnoreCase(trade.getSecurityType())
        || "BON".equalsIgnoreCase(trade.getSecurityType())
        || "FX".equalsIgnoreCase(trade.getSecurityType()))) {
      return "Not a valid security type";
    }
    if (!("BUY".equalsIgnoreCase(trade.getTransactionType())
        || "SELL".equalsIgnoreCase(trade.getTransactionType()))) {
      return "Not a valid transaction type";
    }
    if (trade.getQuantity() < 1) {
      return "Quantity should be more than 0";
    }
    if (trade.getSecurityPrice() <= 0) {
      return "Price must be more than 0";
    }
    return null;
  }

}
