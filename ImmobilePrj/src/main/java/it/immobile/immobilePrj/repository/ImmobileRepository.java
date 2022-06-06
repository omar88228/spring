package it.immobile.immobilePrj.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.immobile.immobilePrj.entity.*;

public interface ImmobileRepository extends CrudRepository<Immobile, Integer> {
	List<Immobile> findBySurface(int surface);
}
