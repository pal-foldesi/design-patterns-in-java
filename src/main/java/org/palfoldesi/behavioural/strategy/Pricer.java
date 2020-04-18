package org.palfoldesi.behavioural.strategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pricer {
    Map<String, PricingStrategy> strategies = new HashMap<>();

    public Pricer() {
        strategies.put("every3rdItemFree", new EveryNthFree(3));
        strategies.put("33%OffEveryItem", new PercentageOff(BigDecimal.valueOf(0.33)));
    }

    BigDecimal calculateDiscountedTotal(String strategyName, List<LineItem> lineItems) {
        PricingStrategy strategy = strategies.get(strategyName);
        return strategy.apply(lineItems).stream()
                .map(LineItem::getDiscountedPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}