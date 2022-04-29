package com.successive.commissioncalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.successive.commissioncalculation.controller.CommissionCalculationController;
import com.successive.commissioncalculation.model.Trade;

/**
 * This class is main class of this application, Which would act as entry point for this
 * application.
 * 
 * This application supports asynchronous call, 
 * and uses CompletableFuture and Executor service,
 * All the calculation of commission is happening in parallel.
 * 
 * @author amitkumar
 *
 */
public class CommissionCalculationApplication {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    CommissionCalculationController controller = new CommissionCalculationController();
    List<String> commissionPrice = controller.getCommissionAmount(getTradeList()).get();
    System.out.println(commissionPrice);
  }

  private static List<Trade> getTradeList() {
    List<Trade> tradeList = new ArrayList<>();
    Trade trade1 = new Trade();
    trade1.setTradeTime("01/01/2019 10:00:00");
    trade1.setSecurityType("STO");
    trade1.setTransactionType("BUY");
    trade1.setQuantity(10);
    trade1.setSecurityPrice(11.23);
    tradeList.add(trade1);

    Trade trade2 = new Trade();
    trade2.setTradeTime("01/01/2019 10:00:00");
    trade2.setSecurityType("STO");
    trade2.setTransactionType("BUY");
    trade2.setQuantity(-10);
    trade2.setSecurityPrice(11.23);
    tradeList.add(trade2);

    return tradeList;
  }
}
