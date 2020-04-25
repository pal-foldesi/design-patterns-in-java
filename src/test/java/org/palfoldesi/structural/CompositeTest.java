package org.palfoldesi.structural;

import org.junit.jupiter.api.Test;
import org.palfoldesi.structural.composite.NoteSheet;
import org.palfoldesi.structural.composite.Page;
import org.palfoldesi.structural.composite.Notepad;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class CompositeTest {

    @Test
    public void testComposite() {
        NoteSheet noteSheet1 = spy(Page.class);
        NoteSheet noteSheet2 = spy(Page.class);
        NoteSheet noteSheet3 = spy(Page.class);

        Notepad np = new Notepad();

        np.addPage(noteSheet1);
        np.addPage(noteSheet2);
        np.addPage(noteSheet3);

        np.scribble("hi");

        verify(noteSheet1).scribble("hi");
        verify(noteSheet2).scribble("hi");
        verify(noteSheet3).scribble("hi");

        np.turn();

        verify(noteSheet1).turn();
        verify(noteSheet2).turn();
        verify(noteSheet3).turn();

        np.rip();

        verify(noteSheet1).rip();
        verify(noteSheet2).rip();
        verify(noteSheet3).rip();
    }
}
