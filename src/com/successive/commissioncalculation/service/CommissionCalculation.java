package com.successive.commissioncalculation.service;

import com.successive.commissioncalculation.model.Trade;

/**
 * This is Interface which contains method to calculate commission.
 * 
 * @author amitkumar
 *
 */
public interface CommissionCalculation {
  public String getCommissionAmount(Trade trade); 
}
