package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, I> {

    T findById(I id);

    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deleteById(I id);
}
