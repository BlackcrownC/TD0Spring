package demo.td0spring.DAL.services;

import demo.td0spring.BLL.Model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address create(Address address);

    Optional<Address> readOne(Long id);

    List<Address> readAll();

    void delete(Long id);
}
