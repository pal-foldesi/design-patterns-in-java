package org.palfoldesi.structural.decorator;

public class CombatDrone extends DroneDecorator {
    public CombatDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Fly aggressively, deterring enemies");
    }
}
