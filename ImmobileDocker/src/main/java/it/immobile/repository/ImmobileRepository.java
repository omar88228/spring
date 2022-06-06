package it.immobile.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import it.immobile.entity.Immobile;


public interface ImmobileRepository extends CrudRepository<Immobile, Integer> {
	List<Immobile> findBySurface(int surface);
}
