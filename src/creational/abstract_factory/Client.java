package creational.abstract_factory;

import creational.abstract_factory.factory.ClothingFactory;
import creational.abstract_factory.factory.GothClothingFactory;
import creational.abstract_factory.factory.HipsterClothingFactory;
import creational.abstract_factory.product.Jacket;
import creational.abstract_factory.product.Pants;

public class Client {
    public static void main(String[] args) {
        ClothingFactory gothClothingFactory = new GothClothingFactory();
        Jacket gothJacket = gothClothingFactory.createJacket();

        ClothingFactory hipsterClothingFactory = new HipsterClothingFactory();
        Pants hipsterPants = hipsterClothingFactory.createPants();
    }
}