package exercicios.service;

import exercicios.entities.Sub1;
import exercicios.entities.Sub2;

public class MainSub {

	// contract service

	Interface onlinePaymentService;

	public MainSub(Interface onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Sub1 contract, Integer months) {

		Double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			Double interest = onlinePaymentService.interest(basicQuota, i);

			contract.getInstallments().add(
					new Sub2(contract.getDate().plusMonths(i), onlinePaymentService.paymentFee(interest)));
		}

	}

}
