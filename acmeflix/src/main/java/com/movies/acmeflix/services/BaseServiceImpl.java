package com.movies.acmeflix.services;

import com.movies.acmeflix.base.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class BaseServiceImpl<T extends BaseModel> implements BaseService<T,Long> {

    abstract JpaRepository<T,Long> getRepository();

    @Override
    public T create(final T clazz) {
        return getRepository().save(clazz);
    }

    @Override
    public List<T> createAll(T... clazzes) {
        return createAll(List.of(clazzes));
    }

    @Override
    public List<T> createAll(final List<T> categories) {
        final List<T> updatedEntities = new ArrayList<>();
        for (final T clazz : categories) {
            updatedEntities.add(create(clazz));
        }
        return updatedEntities;
    }

    @Override
    public void update(final T clazz) {
        getRepository().save(clazz);
    }

    @Override
    public void delete(final T clazz) {
        getRepository().delete(clazz);
    }

    @Override
    public void deleteById(final Long id) {
        final T clazzFound = getRepository().getReferenceById(id);
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(final T clazz) {
        return getRepository().existsById(clazz.getId());
    }

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T find(Long id) {
        return getRepository().findById(id).orElseThrow(NoSuchElementException::new);
    }

    public T get(Long id) {
        return getRepository().getReferenceById(id);
    }
}
