package org.palfoldesi.concurrency.active_object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ActiveObject {
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public boolean queueIsNotEmpty() {
        return !queue.isEmpty();
    }

    public ActiveObject() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                while (queueIsNotEmpty()) {
                    Runnable runnable = queue.take();
                    new Thread(runnable).start();
                }
            } catch (InterruptedException iExc) {
                System.out.println("got interrupted while taking");
            }
        }).start();
    }

    public void schedule(Runnable runnable) {
        try {
            queue.put(runnable);
        } catch (InterruptedException e) {
            System.out.println("got interrupted while putting");
        }
    }
}