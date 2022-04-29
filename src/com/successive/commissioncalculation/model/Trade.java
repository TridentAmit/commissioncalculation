package com.successive.commissioncalculation.model;

/**
 * This class is model class for trade details
 * 
 * @author amitkumar
 *
 */
public class Trade {
	private String tradeTime; // Not using this parameter in application
								// so to keep it simple, kept data type as String
	private String securityType;
	private String transactionType;
	private long quantity;
	private double securityPrice;

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getSecurityType() {
		return securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getSecurityPrice() {
		return securityPrice;
	}

	public void setSecurityPrice(double securityPrice) {
		this.securityPrice = securityPrice;
	}
}
