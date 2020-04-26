package org.palfoldesi.behavioural.visitor;

public abstract class SportsEquipment {
    private boolean inUse;

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}