package org.palfoldesi.architectural.data_access_object;

import java.util.List;
import java.util.Optional;

public interface GenericDao<T> {
    void create (T t);
    Optional<T> read(long id);
    List<T> readAll();
    void update(T t);
    void delete(long id);
}
