package de.aittr.g_31_2_rest.repositories;

import java.util.List;

public interface CrudRepository<T> {

//    Create
    T save(T obj);

//    Read
    List<T> getAll();

    T getById(int id);

//    Update

    void update (T obj);

//    Delete
    void deleteById (int id);
}
