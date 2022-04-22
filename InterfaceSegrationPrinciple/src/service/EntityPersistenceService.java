package service;

import entity.Entity;

public interface EntityPersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

}
