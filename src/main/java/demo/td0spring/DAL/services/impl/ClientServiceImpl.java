package demo.td0spring.DAL.services.impl;

import demo.td0spring.BLL.Model.Client;
import demo.td0spring.DAL.repositories.ClientRepository;
import demo.td0spring.DAL.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client create(Client client) {
        return repository.save(client);
    }

    @Override
    public Optional<Client> readOne(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Client> readAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
