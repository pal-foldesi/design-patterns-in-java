package org.palfoldesi.behavioural.strategy;

import java.math.BigDecimal;

// In real life, this would most certainly not be a conrete class,
// however the focus of this example is the Strategy, not this class
public class LineItem {
    public BigDecimal getListPrice() {
        return listPrice;
    }

    private BigDecimal listPrice;
    private BigDecimal discountedPrice;

    public LineItem(BigDecimal listPrice) {
        this.listPrice = listPrice;
        this.discountedPrice = listPrice;
    }

    public LineItem(BigDecimal listPrice, BigDecimal discountedPrice) {
        this.listPrice = listPrice;
        this.discountedPrice = discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }
}
