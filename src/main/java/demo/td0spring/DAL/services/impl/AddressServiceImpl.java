package demo.td0spring.DAL.services.impl;

import demo.td0spring.BLL.Model.Address;
import demo.td0spring.DAL.repositories.AddressRepository;
import demo.td0spring.DAL.services.AddressService;

import java.util.List;
import java.util.Optional;

public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Optional<Address> readOne(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> readAll() {
        return addressRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }
}
