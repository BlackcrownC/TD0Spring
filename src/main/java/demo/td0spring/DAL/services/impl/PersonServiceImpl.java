package demo.td0spring.DAL.services.impl;

import demo.td0spring.BLL.Model.Person;
import demo.td0spring.DAL.repositories.PersonRepository;
import demo.td0spring.DAL.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Optional<Person> readOne(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> readAll() {
        return personRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}
