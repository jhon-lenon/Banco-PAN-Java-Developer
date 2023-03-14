package dioclass.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    @GetMapping("/")
    public String helloWord() {
        return "This is my first API in Spring Boot!";
    }

    // Estão dispostos os métodos de requisição
    @GetMapping("/persons")
    public List<Person> consultAllPerson() {
        return repositoryPerson.findAll();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> consultById(@PathVariable Long id) {
        return repositoryPerson.findById(id);
    }
}
