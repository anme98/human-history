package de.anybytes.humanhistorybackend.repository;

import de.anybytes.humanhistorybackend.entity.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
