package com.shopxx.pojo;
import java.io.Serializable;

public class XxPaymentShippingMethodKey  implements Serializable{
    private static final long serialVersionUID = 4341565363296741715L;

	private Long paymentMethods;

    private Long shippingMethods;

    public Long getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(Long paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Long getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(Long shippingMethods) {
        this.shippingMethods = shippingMethods;
    }
}