package org.palfoldesi.structural;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.palfoldesi.structural.abstract_server.Book;
import org.palfoldesi.structural.abstract_server.Magazine;
import org.palfoldesi.structural.abstract_server.Person;

import static org.mockito.Mockito.verify;

public class AbstractServerTest {

    @Test
    public void testAbstractServer() {
        Person person = new Person();
        org.palfoldesi.structural.abstract_server.Readable mag = Mockito.spy(Magazine.class);
        org.palfoldesi.structural.abstract_server.Readable book = Mockito.spy(Book.class);
        person.setReadable(mag);
        System.out.println(person.read());
        verify(mag).read();
        person.setReadable(book);
        System.out.println(person.read());
        verify(book).read();
    }
}
