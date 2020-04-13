package org.palfoldesi.creational.abstract_factory.factory;

import org.palfoldesi.creational.abstract_factory.product.GothJacket;
import org.palfoldesi.creational.abstract_factory.product.GothPants;
import org.palfoldesi.creational.abstract_factory.product.Jacket;
import org.palfoldesi.creational.abstract_factory.product.Pants;

public class GothClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new GothPants();
    }

    @Override
    public Jacket createJacket() {
        return new GothJacket();
    }
}
