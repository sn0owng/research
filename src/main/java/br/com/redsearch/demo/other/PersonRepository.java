package br.com.redsearch.demo.other;

import br.com.redsearch.demo.repository.ResearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ResearchRepository<Person, String> {}
