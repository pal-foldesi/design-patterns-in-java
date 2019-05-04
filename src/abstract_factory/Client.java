package abstract_factory;

import abstract_factory.factory.ClothingFactory;
import abstract_factory.factory.GothClothingFactory;
import abstract_factory.factory.HipsterClothingFactory;
import abstract_factory.product.Jacket;
import abstract_factory.product.Pants;

public class Client {
    public static void main(String[] args) {
        ClothingFactory gothClothingFactory = new GothClothingFactory();
        Jacket gothJacket = gothClothingFactory.createJacket();

        ClothingFactory hipsterClothingFactory = new HipsterClothingFactory();
        Pants hipsterPants = hipsterClothingFactory.createPants();
    }
}