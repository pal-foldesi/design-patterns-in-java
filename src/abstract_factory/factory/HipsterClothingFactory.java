package abstract_factory.factory;

import abstract_factory.product.HipsterJacket;
import abstract_factory.product.HipsterPants;
import abstract_factory.product.Jacket;
import abstract_factory.product.Pants;

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
