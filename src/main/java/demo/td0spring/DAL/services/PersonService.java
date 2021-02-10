package demo.td0spring.DAL.services;

import demo.td0spring.BLL.Model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Person create(Person person);

    Optional<Person> readOne(Long id);

    List<Person> readAll();

    void delete(Long id);
}
