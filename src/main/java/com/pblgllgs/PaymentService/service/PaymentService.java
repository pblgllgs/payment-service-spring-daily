package com.pblgllgs.PaymentService.service;

import com.pblgllgs.PaymentService.model.PaymentRequest;
import com.pblgllgs.PaymentService.model.PaymentResponse;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
