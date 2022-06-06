package it.immobile.immobilePrj.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import it.immobile.immobilePrj.entity.Address;
import it.immobile.immobilePrj.entity.Immobile;
import it.immobile.immobilePrj.repository.AddressRepository;
import it.immobile.immobilePrj.repository.ImmobileRepository;


@Service
public class ImmobileService {

	
	private ImmobileRepository immobileRepository;	
	private AddressRepository addressRepository ;
	
	@Autowired
	public ImmobileService(ImmobileRepository immobileRepository, AddressRepository addressRepository) {
		super();
		this.immobileRepository = immobileRepository;
		this.addressRepository = addressRepository;
	}

	public Immobile addImmobile(Immobile immobile) {
		return immobileRepository.save(immobile);
	}

	public Immobile findImmobileById(int id) {
		Optional<Immobile> immobile = immobileRepository.findById(id);
		return immobile.get();
	}

	public List<Immobile> showAllImmobiles() {
		Iterable<Immobile> result = immobileRepository.findAll();
		List<Immobile> listImmobiles = Streamable.of(result).toList();
		return listImmobiles;
	}

	public void deleteImmobile(int id) {
		immobileRepository.deleteById(id);
	}

	public Immobile updateImmobileSurface(int id, int surface) {
		Immobile immobile = immobileRepository.findById(id).get();
		immobile.setSurface(surface);
		return immobileRepository.save(immobile);
	}
	public Immobile addAddressToImmobile(int idImmobile,int idAddress) {
		Address address=addressRepository.findById(idAddress).get();
		Immobile immobile = immobileRepository.findById(idImmobile).get();
		immobile.setAddress(address);
		return immobileRepository.save(immobile);
	}
}
