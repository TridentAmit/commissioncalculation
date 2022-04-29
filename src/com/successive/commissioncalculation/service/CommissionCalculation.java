package com.successive.commissioncalculation.service;

import com.successive.commissioncalculation.model.Trade;

/**
 * This is Interface which contains method to calculate commission.
 * 
 * @author amitkumar
 *
 */
public interface CommissionCalculation {
  /**
   * This method calculates commission amount based on trade input
 * @param trade
 * @return
 */
public String getCommissionAmount(Trade trade); 
}
