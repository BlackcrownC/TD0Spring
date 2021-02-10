package demo.td0spring.DAL.repositories;

import demo.td0spring.BLL.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
