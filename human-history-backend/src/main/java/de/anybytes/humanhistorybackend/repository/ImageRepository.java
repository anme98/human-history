package de.anybytes.humanhistorybackend.repository;

import de.anybytes.humanhistorybackend.entity.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
