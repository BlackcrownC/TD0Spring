package demo.td0spring.DAL.services;

import demo.td0spring.BLL.Model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client create(Client client);

    Optional<Client> readOne(Long id);

    List<Client> readAll();

    void delete(Long id);
}
