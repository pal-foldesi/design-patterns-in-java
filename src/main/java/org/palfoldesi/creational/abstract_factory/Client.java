package org.palfoldesi.creational.abstract_factory;

import org.palfoldesi.creational.abstract_factory.factory.ClothingFactory;
import org.palfoldesi.creational.abstract_factory.factory.GothClothingFactory;
import org.palfoldesi.creational.abstract_factory.factory.HipsterClothingFactory;
import org.palfoldesi.creational.abstract_factory.product.Jacket;
import org.palfoldesi.creational.abstract_factory.product.Pants;

public class Client {
    public static void main(String[] args) {
        ClothingFactory gothClothingFactory = new GothClothingFactory();
        Jacket gothJacket = gothClothingFactory.createJacket();

        ClothingFactory hipsterClothingFactory = new HipsterClothingFactory();
        Pants hipsterPants = hipsterClothingFactory.createPants();
    }
}