package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMap<T, I> {

    private final Map<I, T> map = new HashMap<>();

    T findById(I id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(I id, T object) {
        return map.put(id, object);
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    void deleteById(I id) {
        map.remove(id);
    }
}
