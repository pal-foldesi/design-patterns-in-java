package org.palfoldesi.creational.prototype;

public class Goose implements Prototype {
    @Override
    public Prototype clonePrototype() {
        return new Goose();
    }
}
