package org.palfoldesi.behavioural.visitor;

public interface SportsEquipmentVisitor {
    void visit(AdjustableWeightBench adjustableWeightBench);
    void visit(EllipticalMachine ellipticalMachine);
    void visit(Treadmill treadmill);
}