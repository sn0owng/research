package br.com.redsearch.demo.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository repo;

    @GetMapping
    public void ok() {
        repo.save(new Person("Marcos", 15));
    }
}
