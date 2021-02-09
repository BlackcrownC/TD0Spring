package demo.td0spring.DAL.repositories;

import demo.td0spring.BLL.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
