package org.palfoldesi.creational.factory;

public class CanvasFactoryImpl implements CanvasFactory {
    @Override
    public Canvas createCanvas() {
        return new Canvas();
    }
}
