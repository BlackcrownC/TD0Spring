package demo.td0spring.DAL.services.impl;

import demo.td0spring.BLL.Model.AccountManager;
import demo.td0spring.DAL.repositories.AccountManagerRepository;
import demo.td0spring.DAL.services.AccountManagerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountManagerServiceImpl implements AccountManagerService {
    private final AccountManagerRepository accountManagerRepository;

    public AccountManagerServiceImpl(AccountManagerRepository accountManagerRepository) {
        this.accountManagerRepository = accountManagerRepository;
    }

    @Override
    public AccountManager create(AccountManager accountManager) {
        return accountManagerRepository.save(accountManager);
    }

    @Override
    public Optional<AccountManager> readOne(Long id) {
        return accountManagerRepository.findById(id);
    }

    @Override
    public List<AccountManager> readAll() {
        return accountManagerRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        accountManagerRepository.deleteById(id);
    }
}
