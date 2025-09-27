package in.raja.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.  raja.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
