package service;

import entity.Entity;
import java.util.List;

public interface PersistenceService<T extends Entity> {

    T findById(Long id);

    void save(T entity);

    void delete(T entity);

}
