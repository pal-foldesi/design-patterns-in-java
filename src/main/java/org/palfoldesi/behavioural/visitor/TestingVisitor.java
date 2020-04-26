package org.palfoldesi.behavioural.visitor;

public class TestingVisitor implements SportsEquipmentVisitor {

    @Override
    public void visit(AdjustableWeightBench adjustableWeightBench) {
        for (int i = 0; i <= 90; i++) {
            adjustableWeightBench.adjust(i);
        }
    }

    @Override
    public void visit(EllipticalMachine ellipticalMachine) {
        ellipticalMachine.setResistance(EllipticalMachine.Resistance.LOW);
        ellipticalMachine.setResistance(EllipticalMachine.Resistance.MEDIUM);
        ellipticalMachine.setResistance(EllipticalMachine.Resistance.HIGH);
    }

    @Override
    public void visit(Treadmill treadmill) {
        treadmill.powerOn();
        treadmill.powerOff();
    }
}
