package demo.td0spring.DAL.services;

import demo.td0spring.BLL.Model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Account create(Account account);

    Optional<Account> readOne(Long id);

    List<Account> readAll();

    void delete(Long id);
}
