package de.anybytes.humanhistorybackend.dto;

import de.anybytes.humanhistorybackend.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateHistoryEventDTO {

    private String name;
    private LocalDate dateOfEvent;
    @ManyToOne
    @JoinColumn(name = "place_of_event_id")
    private Country placeOfEvent;
    private String description;
}
