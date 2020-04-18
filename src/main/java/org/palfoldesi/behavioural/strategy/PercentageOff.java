package org.palfoldesi.behavioural.strategy;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class PercentageOff implements PricingStrategy {
    private BigDecimal percentage;

    public PercentageOff(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public List<LineItem> apply(List<LineItem> lineItems) {
        return lineItems.stream().map(lineItem -> {
            lineItem.setDiscountedPrice(lineItem.getListPrice().multiply(percentage));
            return lineItem;
        }).collect(Collectors.toList());
    }
}
