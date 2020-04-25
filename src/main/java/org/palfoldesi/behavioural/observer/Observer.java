package org.palfoldesi.behavioural.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}