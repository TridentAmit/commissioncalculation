package com.successive.commissioncalculation.service;

import com.successive.commissioncalculation.model.Trade;
import com.successive.commissioncalculation.validator.RequestValidator;

/**
 * This class acts as service layer for this application,
 * which connects controller and real business logic class
 * 
 * @author amitkumar
 *
 */
public class CommissionCalculationService {
	public String getCommissionCalculated(Trade trade) {
		RequestValidator validator = new RequestValidator();
		try{
			validator.validateTrade(trade);
		}catch(IllegalArgumentException exc) {
			return exc.getMessage();
		}
		CommissionCalculation commissionCalculation = getCalculator(trade.getSecurityType());
		return commissionCalculation.getCommissionAmount(trade);
	}
	
	private CommissionCalculation getCalculator(String securityType) {
		if("STO".equalsIgnoreCase(securityType)) {
			return new StocksCommissionCalculation();
		}else if("BON".equalsIgnoreCase(securityType)) {
			return new BondsCommissionCalculation();
		}else {
			return new ForexCommissionCalculation();
		}
	}
}
