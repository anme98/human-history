package de.anybytes.humanhistorybackend.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class HistoryEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfEvent;
    @ManyToOne
    @JoinColumn(name = "place_of_event_id")
    private Country placeOfEvent;
    private String description;

    public Country getPlaceOfEvent() {
        return placeOfEvent;
    }

    public HistoryEvent(String name, LocalDate dateOfEvent, Country placeOfEvent, String description) {
        this.name = name;
        this.dateOfEvent = dateOfEvent;
        this.placeOfEvent = placeOfEvent;
        this.description = description;
    }

    public HistoryEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(LocalDate dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
