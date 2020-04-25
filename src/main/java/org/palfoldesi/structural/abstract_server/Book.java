package org.palfoldesi.structural.abstract_server;

public class Book implements Readable {
    @Override
    public String read() {
        return "A gripping story of heroism and naivety";
    }
}
