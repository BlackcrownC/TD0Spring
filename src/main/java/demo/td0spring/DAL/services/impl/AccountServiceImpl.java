package demo.td0spring.DAL.services.impl;

import demo.td0spring.BLL.Model.Account;
import demo.td0spring.DAL.repositories.AccountRepository;
import demo.td0spring.DAL.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public Account create(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> readOne(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> readAll() {
        return accountRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
}
