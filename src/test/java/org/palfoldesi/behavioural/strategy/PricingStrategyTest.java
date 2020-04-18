package org.palfoldesi.behavioural.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PricingStrategyTest {
    BigDecimal firstLineItemListPrice = BigDecimal.valueOf(72.6);
    BigDecimal secondLineItemListPrice = BigDecimal.valueOf(12.3);
    BigDecimal thirdLineItemListPrice = BigDecimal.valueOf(72.3);

    @Test
    public void testEvery3rdItemFreePricingStrategy() {
        List<LineItem> lineItems = List.of(
                new LineItem(firstLineItemListPrice),
                new LineItem(secondLineItemListPrice),
                new LineItem(thirdLineItemListPrice)
        );
        Pricer pricer = new Pricer();
        List<LineItem> lineItemsExpected = List.of(
                new LineItem(firstLineItemListPrice),
                new LineItem(secondLineItemListPrice),
                new LineItem(thirdLineItemListPrice, BigDecimal.ZERO));
        BigDecimal expectedDiscountedTotal = lineItemsExpected.stream()
                .map(lineItem -> lineItem.getDiscountedPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal actualDiscountedTotal = pricer.calculateDiscountedTotal("every3rdItemFree", lineItems);
        assertThat(actualDiscountedTotal).isEqualTo(expectedDiscountedTotal);
    }

    @Test
    public void test33PercentOffEveryItemPricingStrategy() {
        List<LineItem> lineItems = List.of(
                new LineItem(firstLineItemListPrice),
                new LineItem(secondLineItemListPrice),
                new LineItem(thirdLineItemListPrice)
        );
        Pricer pricer = new Pricer();
        BigDecimal percentage = BigDecimal.valueOf(0.33);
        List<LineItem> lineItemsExpected = List.of(
                new LineItem(firstLineItemListPrice, firstLineItemListPrice.multiply(percentage)),
                new LineItem(secondLineItemListPrice, secondLineItemListPrice.multiply(percentage)),
                new LineItem(thirdLineItemListPrice, thirdLineItemListPrice.multiply(percentage)));
        BigDecimal expectedDiscountedTotal = lineItemsExpected.stream()
                .map(lineItem -> lineItem.getDiscountedPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal actualDiscountedTotal = pricer.calculateDiscountedTotal("33%OffEveryItem", lineItems);
        assertThat(actualDiscountedTotal).isEqualTo(expectedDiscountedTotal);
    }
}
