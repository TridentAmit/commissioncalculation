package com.successive.commissioncalculation.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.successive.commissioncalculation.model.Trade;
import com.successive.commissioncalculation.service.CommissionCalculationService;
import com.successive.commissioncalculation.validator.RequestValidator;

/**
 * This is entry point of application
 * 
 * @author amitkumar
 *
 */
public class CommissionCalculationController {
	/*
	 * We can control number of threads, ideal pool size should be equal to number
	 * of cores available.
	 */
	private ExecutorService executors = Executors.newFixedThreadPool(4);

	public CompletableFuture<List<String>> getCommissionAmount(final List<Trade> trades) {
		final CommissionCalculationService service = new CommissionCalculationService();

		return CompletableFuture.supplyAsync(() -> trades).thenApplyAsync(tradeList -> {
			List<String> commissionAmounts = new ArrayList<>();
			for (Trade trade : tradeList) {
				commissionAmounts.add(service.getCommissionCalculated(trade));
			}
			return commissionAmounts;
		}, executors);
				

	}

}
