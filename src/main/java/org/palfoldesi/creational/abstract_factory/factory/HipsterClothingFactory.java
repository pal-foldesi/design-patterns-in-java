package org.palfoldesi.creational.abstract_factory.factory;

import org.palfoldesi.creational.abstract_factory.product.HipsterJacket;
import org.palfoldesi.creational.abstract_factory.product.HipsterPants;
import org.palfoldesi.creational.abstract_factory.product.Jacket;
import org.palfoldesi.creational.abstract_factory.product.Pants;

public class HipsterClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new HipsterPants();
    }

    @Override
    public Jacket createJacket() {
        return new HipsterJacket();
    }
}
