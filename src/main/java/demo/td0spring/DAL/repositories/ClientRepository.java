package demo.td0spring.DAL.repositories;

import demo.td0spring.BLL.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
