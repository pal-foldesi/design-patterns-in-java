package org.palfoldesi.structural.abstract_server;

public class Person {
    private Readable readable;

    public Readable getReadable() {
        return readable;
    }

    public void setReadable(Readable readable) {
        this.readable = readable;
    }

    public String read() {
        return readable.read();
    }
}
