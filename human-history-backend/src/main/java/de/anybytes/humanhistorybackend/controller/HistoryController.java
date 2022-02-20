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
        return new ResponseEntity<>(historyService.getAllCountries(), HttpStatus.OK);
    }

    @GetMapping(value = "/country/{id}")
    public ResponseEntity<Country> getCountry (@PathVariable Long id) {
        return new ResponseEntity<>(historyService.getCountry(id), HttpStatus.OK);
    }

    @PostMapping(value = "/country")
    public ResponseEntity<Country> saveCountry (@RequestBody Country country) {
        return new ResponseEntity<>(historyService.saveCountry(country), HttpStatus.CREATED);
    }

    @PutMapping(value = "/country")
    public ResponseEntity<Country> updateCountry (@RequestBody Country country) {
        return new ResponseEntity<>(historyService.updateCountry(country), HttpStatus.OK);
    }

    @DeleteMapping(value = "/country/{id}")
    public ResponseEntity<Void> deleteCountry (@PathVariable Long id) {
        historyService.deleteCountryById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/historicalFigure")
    public ResponseEntity<Iterable<HistoricalFigure>> getAllHistoricalFigures () {
        return new ResponseEntity<>(historyService.getAllHistoricalFigures(), HttpStatus.OK);
    }

    @GetMapping(value = "/historicalFigure/{id}")
    public ResponseEntity<HistoricalFigure> getHistoricalFigure (@PathVariable Long id) {
        return new ResponseEntity<>(historyService.getHistoricalFigure(id), HttpStatus.OK);
    }

    @PostMapping(value = "/historicalFigure")
    public ResponseEntity<HistoricalFigure> saveHistoricalFigure (@RequestBody HistoricalFigure historicalFigure) {
        return new ResponseEntity<>(historyService.saveHistoricalFigure(historicalFigure), HttpStatus.CREATED);
    }

    @PutMapping(value = "/historicalFigure")
    public ResponseEntity<HistoricalFigure> updateHistoricalFigure (@RequestBody HistoricalFigure historicalFigure) {
        return new ResponseEntity<>(historyService.updateHistoricalFigure(historicalFigure), HttpStatus.OK);
    }

    @DeleteMapping(value = "/historicalFigure/{id}")
    public ResponseEntity<Void> deleteHistoricalFigure (@PathVariable Long id) {
        historyService.deleteHistoricalFigureById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/historyCategory")
    public ResponseEntity<Iterable<HistoryCategory>> getAllHistoryCategories () {
        return new ResponseEntity<>(historyService.getAllHistoryCategories(), HttpStatus.OK);
    }

    @GetMapping(value = "/historyCategory/{id}")
    public ResponseEntity<HistoryCategory> getHistoryCategory (@PathVariable Long id) {
        return new ResponseEntity<>(historyService.getHistoryCategory(id), HttpStatus.OK);
    }

    @PostMapping(value = "/historyCategory")
    public ResponseEntity<HistoryCategory> saveHistoryCategory (@RequestBody HistoryCategory historyCategory) {
        return new ResponseEntity<>(historyService.saveHistoryCategory(historyCategory), HttpStatus.CREATED);
    }

    @PutMapping(value = "/historyCategory")
    public ResponseEntity<HistoryCategory> updateHistoryCategory (@RequestBody HistoryCategory historyCategory) {
        return new ResponseEntity<>(historyService.updateHistoryCategory(historyCategory), HttpStatus.OK);
    }

    @DeleteMapping(value = "/historyCategory/{id}")
    public ResponseEntity<Void> deleteHistoryCategory (@PathVariable Long id) {
        historyService.deleteHistoryCategoryById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/historyEvent")
    public ResponseEntity<Iterable<HistoryEvent>> getAllHistoryEvents () {
        return new ResponseEntity<>(historyService.getAllHistoryEvents(), HttpStatus.OK);
    }

    @GetMapping(value = "/historyEvent/{id}")
    public ResponseEntity<HistoryEvent> getHistoryEvent (@PathVariable Long id) {
        return new ResponseEntity<>(historyService.getHistoryEvent(id), HttpStatus.OK);
    }

    @PostMapping(value = "/historyEvent")
    public ResponseEntity<HistoryEvent> saveHistoryEvent (@RequestBody HistoryEvent historyEvent) {
        return new ResponseEntity<>(historyService.saveHistoryEvent(historyEvent), HttpStatus.CREATED);
    }

    @PutMapping(value = "/historyEvent")
    public ResponseEntity<HistoryEvent> updateHistoryEvent (@RequestBody HistoryEvent historyEvent) {
        return new ResponseEntity<>(historyService.updateHistoryEvent(historyEvent), HttpStatus.OK);
    }

    @DeleteMapping(value = "historyEvent/{id}")
    public ResponseEntity<Void> deleteHistoryEvent (@PathVariable Long id) {
        historyService.deleteHistoryEventById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
