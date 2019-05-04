package abstract_factory.factory;

import abstract_factory.product.GothJacket;
import abstract_factory.product.GothPants;
import abstract_factory.product.Jacket;
import abstract_factory.product.Pants;

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
