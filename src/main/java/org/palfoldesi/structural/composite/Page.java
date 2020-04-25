package org.palfoldesi.structural.composite;

public class Page implements NoteSheet {
    @Override
    public void rip() {
        System.out.println("Ripping page...");
    }

    @Override
    public void scribble(String note) {
        System.out.println("Writing down:\n" + note);
    }

    @Override
    public void turn() {
        System.out.println("Turning page...");
    }
}
