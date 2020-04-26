package org.palfoldesi.behavioural.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class VisitorTest {

    @Test
    public void testTestingVisitor() {
        Treadmill treadmill = new Treadmill();
        EllipticalMachine elliptical = new EllipticalMachine();
        AdjustableWeightBench bench = new AdjustableWeightBench();
        SportsEquipmentVisitor visitor = Mockito.spy(TestingVisitor.class);
        treadmill.accept(visitor);
        elliptical.accept(visitor);
        bench.accept(visitor);
        verify(visitor).visit(treadmill);
        verify(visitor).visit(elliptical);
        verify(visitor).visit(bench);
    }
}
