package org.palfoldesi.structural.abstract_server;

public class Magazine implements Readable {
    @Override
    public String read() {
        return "Some articles about Covid-19, lots of ads...";
    }
}
