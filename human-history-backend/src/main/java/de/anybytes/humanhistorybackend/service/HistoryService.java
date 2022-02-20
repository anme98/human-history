package de.anybytes.humanhistorybackend.service;

import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import de.anybytes.humanhistorybackend.repository.CountryRepository;
import de.anybytes.humanhistorybackend.repository.HistoricalFigureRepository;
import de.anybytes.humanhistorybackend.repository.HistoryCategoryRepository;
import de.anybytes.humanhistorybackend.repository.HistoryEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    private final CountryRepository countryRepository;
    private final HistoricalFigureRepository historicalFigureRepository;
    private final HistoryCategoryRepository historyCategoryRepository;
    private final HistoryEventRepository historyEventRepository;

    @Autowired
    public HistoryService(CountryRepository countryRepository, HistoricalFigureRepository historicalFigureRepository, HistoryCategoryRepository historyCategoryRepository, HistoryEventRepository historyEventRepository) {
        this.countryRepository = countryRepository;
        this.historicalFigureRepository = historicalFigureRepository;
        this.historyCategoryRepository = historyCategoryRepository;
        this.historyEventRepository = historyEventRepository;
    }

    /**
     *
     * @return Country Iterable
     */
    public Iterable<Country> getAllCountries() {
        return this.countryRepository.findAll();
    }

    public Country getCountry(Long id) {
        return this.countryRepository.findById(id).orElse(null);
    }

    public Country saveCountry(Country country) {
        return this.countryRepository.save(country);
    }

    public Country updateCountry(Country country) {
        return this.countryRepository.save(country);
    }

    /**
     *
     * @return HistoricalFigure Iterable
     */
    public Iterable<HistoricalFigure> getAllHistoricalFigures() {
        return this.historicalFigureRepository.findAll();
    }

    public HistoricalFigure getHistoricalFigure(Long id) {
        return this.historicalFigureRepository.findById(id).orElse(null);
    }

    public HistoricalFigure saveHistoricalFigure(HistoricalFigure historicalFigure) {
        return this.historicalFigureRepository.save(historicalFigure);
    }

    public HistoricalFigure updateHistoricalFigure(HistoricalFigure historicalFigure) {
        return this.historicalFigureRepository.save(historicalFigure);
    }

    /**
     *
     * @return HistoryCategory Iterable
     */
    public Iterable<HistoryCategory> getAllHistoryCategories() {
        return this.historyCategoryRepository.findAll();
    }

    public HistoryCategory getHistoryCategory(Long id) {
        return this.historyCategoryRepository.findById(id).orElse(null);
    }

    public HistoryCategory saveHistoryCategory(HistoryCategory historyCategory) {
        return this.historyCategoryRepository.save(historyCategory);
    }

    public HistoryCategory updateHistoryCategory(HistoryCategory historyCategory) {
        return this.historyCategoryRepository.save(historyCategory);
    }

    /**
     *
     * @return HistoryEvent Iterable
     */
    public Iterable<HistoryEvent> getAllHistoryEvents() {
        return this.historyEventRepository.findAll();
    }

    public HistoryEvent getHistoryEvent(Long id) {
        return this.historyEventRepository.findById(id).orElse(null);
    }

    public HistoryEvent saveHistoryEvent(HistoryEvent historyEvent) {
        return this.historyEventRepository.save(historyEvent);
    }

    public HistoryEvent updateHistoryEvent(HistoryEvent historyEvent) {
        return this.historyEventRepository.save(historyEvent);
    }
}
