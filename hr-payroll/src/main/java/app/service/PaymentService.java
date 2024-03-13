package app.service;

import org.springframework.stereotype.Service;

import app.entity.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}