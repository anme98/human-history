package de.anybytes.humanhistorybackend.controller;

import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import de.anybytes.humanhistorybackend.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class HistoryController {

    private final HistoryService historyService;

    @Autowired
    public HistoryController (HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping(value = "/country")
    public ResponseEntity<Iterable<Country>> getAllCountries () {
        return new ResponseEntity<>(this.historyService.getAllCountries(), HttpStatus.OK);
    }

    @GetMapping(value = "/country/{id}")
    public ResponseEntity<Country> getCountry (@PathVariable Long id) {
        return new ResponseEntity<>(this.historyService.getCountry(id), HttpStatus.OK);
    }

    @PostMapping(value = "/country")
    public ResponseEntity<Country> saveCountry (@RequestBody Country country) {
        return new ResponseEntity<>(this.historyService.saveCountry(country), HttpStatus.CREATED);
    }

    @PutMapping(value = "/country")
    public ResponseEntity<Country> updateCountry (@RequestBody Country country) {
        return new ResponseEntity<>(this.historyService.updateCountry(country), HttpStatus.OK);
    }

    @GetMapping(value = "/historicalFigure")
    public ResponseEntity<Iterable<HistoricalFigure>> getAllHistoricalFigures () {
        return new ResponseEntity<>(this.historyService.getAllHistoricalFigures(), HttpStatus.OK);
    }

    @GetMapping(value = "/historicalFigure/{id}")
    public ResponseEntity<HistoricalFigure> getHistoricalFigure (@PathVariable Long id) {
        return new ResponseEntity<>(this.historyService.getHistoricalFigure(id), HttpStatus.OK);
    }

    @PostMapping(value = "/historicalFigure")
    public ResponseEntity<HistoricalFigure> saveHistoricalFigure (@RequestBody HistoricalFigure historicalFigure) {
        return new ResponseEntity<>(this.historyService.saveHistoricalFigure(historicalFigure), HttpStatus.CREATED);
    }

    @PutMapping(value = "/historicalFigure")
    public ResponseEntity<HistoricalFigure> updateHistoricalFigure (@RequestBody HistoricalFigure historicalFigure) {
        return new ResponseEntity<>(this.historyService.updateHistoricalFigure(historicalFigure), HttpStatus.OK);
    }

    @GetMapping(value = "/historyCategory")
    public ResponseEntity<Iterable<HistoryCategory>> getAllHistoryCategories () {
        return new ResponseEntity<>(this.historyService.getAllHistoryCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "/historyCategory/{id}")
    public ResponseEntity<HistoryCategory> getHistoryCategory (@PathVariable Long id) {
        return new ResponseEntity<>(this.historyService.getHistoryCategory(id), HttpStatus.OK);
    }

    @GetMapping(value = "/historyEvent")
    public ResponseEntity<Iterable<HistoryEvent>> getAllHistoryEvents () {
        return new ResponseEntity<>(this.historyService.getAllHistoryEvents(), HttpStatus.OK);
    }

    @GetMapping(value = "/historyEvent/{id}")
    public ResponseEntity<HistoryEvent> getHistoryEvent (@PathVariable Long id) {
        return new ResponseEntity<>(this.historyService.getHistoryEvent(id), HttpStatus.OK);
    }

    @PostMapping(value = "/historyEvent")
    public ResponseEntity<HistoryEvent> saveHistoryEvent (@RequestBody HistoryEvent historyEvent) {
        return new ResponseEntity<>(this.historyService.saveHistoryEvent(historyEvent), HttpStatus.CREATED);
    }

    @PutMapping(value = "/historyEvent")
    public ResponseEntity<HistoryEvent> updateHistoryEvent (@RequestBody HistoryEvent historyEvent) {
        return new ResponseEntity<>(this.historyService.updateHistoryEvent(historyEvent), HttpStatus.OK);
    }
}
