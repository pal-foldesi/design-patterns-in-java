package abstract_factory.factory;

import abstract_factory.product.Jacket;
import abstract_factory.product.Pants;

public interface ClothingFactory {
    Pants createPants();
    Jacket createJacket();
}
