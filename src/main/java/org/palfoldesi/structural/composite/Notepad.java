package org.palfoldesi.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Notepad implements NoteSheet {
    List<NoteSheet> sheets = new ArrayList<>();

    public void addPage(NoteSheet page) {
        sheets.add(page);
    }

    @Override
    public void rip() {
        sheets.forEach(NoteSheet::rip);
    }

    @Override
    public void scribble(String note) {
        sheets.forEach(sheet -> sheet.scribble(note));
    }

    @Override
    public void turn() {
        sheets.forEach(NoteSheet::turn);
    }
}
