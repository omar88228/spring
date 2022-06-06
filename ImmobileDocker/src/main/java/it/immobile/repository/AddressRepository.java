package it.immobile.repository;

import org.springframework.data.repository.CrudRepository;
import it.immobile.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
