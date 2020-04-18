package org.palfoldesi.behavioural.strategy;

import java.util.List;

public interface PricingStrategy {
    List<LineItem> apply(List<LineItem> lineItems);
}
