package in.raja.billingsoftware.controller;

import com.razorpay.RazorpayException;
import in.raja.billingsoftware.io.OrderResponse;
import in.raja.billingsoftware.io.PaymentRequest;
import in.raja.billingsoftware.io.PaymentVerificationRequest;
import in.raja.billingsoftware.io.RazorpayOrderResponse;
import in.raja.billingsoftware.service.OrderService;
import in.raja.billingsoftware.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
