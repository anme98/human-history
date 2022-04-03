package de.anybytes.humanhistorybackend.service;

import de.anybytes.humanhistorybackend.dto.CreateCountryDTO;
import de.anybytes.humanhistorybackend.dto.UpdateCountryDTO;
import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;

public interface HistoryService {
    
    Iterable<Country> getAllCountries();
    Country getCountry(Long id);
    Country saveCountry(CreateCountryDTO countryDTO);
    Country updateCountry(UpdateCountryDTO countryDTO);
    void deleteCountryById(Long id);
    
    Iterable<HistoricalFigure> getAllHistoricalFigures();
    HistoricalFigure getHistoricalFigure(Long id);
    HistoricalFigure saveHistoricalFigure(HistoricalFigure historicalFigure);
    HistoricalFigure updateHistoricalFigure(HistoricalFigure historicalFigure);
    void deleteHistoricalFigureById(Long id);

    Iterable<HistoryEvent> getAllHistoryEvents();
    HistoryEvent getHistoryEvent(Long id);
    HistoryEvent saveHistoryEvent(HistoryEvent historyEvent);
    HistoryEvent updateHistoryEvent(HistoryEvent historyEvent);
    void deleteHistoryEventById(Long id);

    Iterable<HistoryCategory> getAllHistoryCategories();
    HistoryCategory getHistoryCategory(Long id);
    HistoryCategory saveHistoryCategory(HistoryCategory historyCategory);
    HistoryCategory updateHistoryCategory(HistoryCategory historyCategory);
    void deleteHistoryCategoryById(Long id);
}
