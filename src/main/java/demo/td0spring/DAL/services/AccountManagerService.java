package demo.td0spring.DAL.services;

import demo.td0spring.BLL.Model.AccountManager;

import java.util.List;
import java.util.Optional;

public interface AccountManagerService {
    AccountManager create(AccountManager accountManager);

    Optional<AccountManager> readOne(Long id);

    List<AccountManager> readAll();

    void delete(Long id);
}
