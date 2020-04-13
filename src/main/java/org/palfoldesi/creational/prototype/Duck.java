package org.palfoldesi.creational.prototype;

public class Duck implements Prototype {
    @Override
    public Prototype clonePrototype() {
        return new Duck();
    }
}
