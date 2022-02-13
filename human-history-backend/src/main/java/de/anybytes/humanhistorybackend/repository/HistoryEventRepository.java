package de.anybytes.humanhistorybackend.repository;

import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import org.springframework.data.repository.CrudRepository;

public interface HistoryEventRepository extends CrudRepository<HistoryEvent, Long> {

}
