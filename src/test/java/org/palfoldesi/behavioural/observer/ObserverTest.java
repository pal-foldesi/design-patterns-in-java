package org.palfoldesi.behavioural.observer;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class ObserverTest {

    @Test
    public void testObserver() {
        Subject subject = new Subject();
        Observer lighthouseGuard = Mockito.spy(new LighthouseGuard(subject));
        Observer portAuthority = Mockito.spy(new PortAuthority(subject));
        Observer passenger = Mockito.spy(new Passenger(subject));

        subject.add(lighthouseGuard);
        subject.add(portAuthority);
        subject.add(passenger);

        Ship ship = new Ship("Bounty");

        subject.setLatest(ship);

        verify(lighthouseGuard).update();
        verify(portAuthority).update();
        verify(passenger).update();
    }
}
