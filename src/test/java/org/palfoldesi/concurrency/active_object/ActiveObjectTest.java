package org.palfoldesi.concurrency.active_object;

import org.junit.jupiter.api.Test;
import java.util.concurrent.ThreadLocalRandom;

import static org.awaitility.Awaitility.await;

public class ActiveObjectTest {

    @Test
    public void itExecutesThenExits() {
        ActiveObject activeObject = new ActiveObject();
        for (int i = 0; i < 10; i++) {
            activeObject.schedule(() -> System.out.println(
                    ThreadLocalRandom.current().nextInt() * 2
            ));
        }
        await().until(() -> !activeObject.queueIsNotEmpty());
    }
}