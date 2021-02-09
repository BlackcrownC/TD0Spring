package demo.td0spring.DAL.repositories;

import demo.td0spring.BLL.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
