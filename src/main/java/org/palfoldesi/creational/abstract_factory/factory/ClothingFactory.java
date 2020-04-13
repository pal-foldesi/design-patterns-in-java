package org.palfoldesi.creational.abstract_factory.factory;

import org.palfoldesi.creational.abstract_factory.product.Jacket;
import org.palfoldesi.creational.abstract_factory.product.Pants;

public interface ClothingFactory {
    Pants createPants();
    Jacket createJacket();
}
