package demo.td0spring.DAL.repositories;

import demo.td0spring.BLL.Model.AccountManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountManagerRepository extends JpaRepository<AccountManager, Long> {
}
