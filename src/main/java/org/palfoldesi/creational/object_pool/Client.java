package org.palfoldesi.creational.object_pool;

public class Client {
    public static void main(String[] args) {
        Pool pool = Pool.getInstance();
        Resource resource = null;
        for (int i = 1; i <= 4; i++) {
            resource = pool.acquire();
        }
        try {
            resource = pool.acquire();
        } catch (IllegalStateException exc) {
            // expected - all resources already acquired
        }

        pool.release(resource);
        Resource another = pool.acquire();
    }
}
