package org.palfoldesi.structural.flyweight;

public class Postcard {
    private final Size size;
    private final Design design;

    public Postcard(Size size, Design design) {
        this.size = size;
        this.design = design;
    }

    public Size getSize() {
        return size;
    }

    public Design getDesign() {
        return design;
    }

    public void send(Location origin, Location destination) {
        System.out.println("Sending postcard of size: " + size + ", design: " + design + "\n" +
                "from location: " + origin + " to location: " + destination);
    }
}