package br.com.redsearch.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ResearchRepository<T,ID> extends CrudRepository<T, ID> {}
