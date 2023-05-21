package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMap<T extends BaseEntity, I extends Long> {

    private final Map<Long, T> map = new HashMap<>();

    T findById(I id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("YOU ARE TRYING TO SAVE EMPTY OBJECT");
        }

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    void deleteById(I id) {
        map.remove(id);
    }

    private Long getNextId() {
        if (map.isEmpty()) return 1L;
        return 1 + Collections.max(map.keySet());
    }
}
