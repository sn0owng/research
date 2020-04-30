package br.com.redsearch.demo.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class SimpleResearchRepository<T,ID> implements ResearchRepository<T, ID> {

    public SimpleResearchRepository() {

    }

    @Override
    public <S extends T> S save(S entity) {
        System.out.println("Chamou");
        return null;
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(ID id) {
        return false;
    }

    @Override
    public Iterable<T> findAll() {
        return null;
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(ID id) {}

    @Override
    public void delete(T entity) {}

    @Override
    public void deleteAll(Iterable<? extends T> entities) {}

    @Override
    public void deleteAll() {}
}
