package de.anybytes.humanhistorybackend.service;

import de.anybytes.humanhistorybackend.dto.CreateCountryDTO;
import de.anybytes.humanhistorybackend.dto.UpdateCountryDTO;
import de.anybytes.humanhistorybackend.entity.Country;
import de.anybytes.humanhistorybackend.entity.HistoricalFigure;
import de.anybytes.humanhistorybackend.entity.HistoryCategory;
import de.anybytes.humanhistorybackend.entity.HistoryEvent;
import de.anybytes.humanhistorybackend.repository.CountryRepository;
import de.anybytes.humanhistorybackend.repository.HistoricalFigureRepository;
import de.anybytes.humanhistorybackend.repository.HistoryCategoryRepository;
import de.anybytes.humanhistorybackend.repository.HistoryEventRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {

    private final CountryRepository countryRepository;
    private final HistoricalFigureRepository historicalFigureRepository;
    private final HistoryCategoryRepository historyCategoryRepository;
    private final HistoryEventRepository historyEventRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public HistoryServiceImpl(CountryRepository countryRepository, HistoricalFigureRepository historicalFigureRepository, HistoryCategoryRepository historyCategoryRepository, HistoryEventRepository historyEventRepository, ModelMapper modelMapper) {
        this.countryRepository = countryRepository;
        this.historicalFigureRepository = historicalFigureRepository;
        this.historyCategoryRepository = historyCategoryRepository;
        this.historyEventRepository = historyEventRepository;
        this.modelMapper = modelMapper;
    }

    /**
     * @return Country Iterable
     */
    @Override
    public Iterable<Country> getAllCountries() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country getCountry(Long id) {
        return this.countryRepository.findById(id).orElse(null);
    }

    @Override
    public Country saveCountry(CreateCountryDTO countryDTO) {
        return countryRepository.save(modelMapper.map(countryDTO, Country.class));
    }

    @Override
    public Country updateCountry(UpdateCountryDTO countryDTO) {
        Country country = countryRepository.findById(countryDTO.getId()).orElseThrow(() -> new NullPointerException("Not Found!"));
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(countryDTO, country);
        return this.countryRepository.save(country);
    }

    @Override
    public void deleteCountryById(Long id) {
        this.countryRepository.deleteById(id);
    }

    /**
     * @return HistoricalFigure Iterable
     */
    @Override
    public Iterable<HistoricalFigure> getAllHistoricalFigures() {
        return this.historicalFigureRepository.findAll();
    }

    @Override
    public HistoricalFigure getHistoricalFigure(Long id) {
        return this.historicalFigureRepository.findById(id).orElse(null);
    }

    @Override
    public HistoricalFigure saveHistoricalFigure(HistoricalFigure historicalFigure) {
        return this.historicalFigureRepository.save(historicalFigure);
    }

    @Override
    public HistoricalFigure updateHistoricalFigure(HistoricalFigure historicalFigure) {
        return this.historicalFigureRepository.save(historicalFigure);
    }

    @Override
    public void deleteHistoricalFigureById(Long id) {
        this.historicalFigureRepository.deleteById(id);
    }

    /**
     * @return HistoryCategory Iterable
     */
    @Override
    public Iterable<HistoryCategory> getAllHistoryCategories() {
        return this.historyCategoryRepository.findAll();
    }

    @Override
    public HistoryCategory getHistoryCategory(Long id) {
        return this.historyCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public HistoryCategory saveHistoryCategory(HistoryCategory historyCategory) {
        return this.historyCategoryRepository.save(historyCategory);
    }

    @Override
    public HistoryCategory updateHistoryCategory(HistoryCategory historyCategory) {
        return this.historyCategoryRepository.save(historyCategory);
    }

    @Override
    public void deleteHistoryCategoryById(Long id) {
        this.historyCategoryRepository.deleteById(id);
    }

    /**
     * @return HistoryEvent Iterable
     */
    @Override
    public Iterable<HistoryEvent> getAllHistoryEvents() {
        return this.historyEventRepository.findAll();
    }

    @Override
    public HistoryEvent getHistoryEvent(Long id) {
        return this.historyEventRepository.findById(id).orElse(null);
    }

    @Override
    public HistoryEvent saveHistoryEvent(HistoryEvent historyEvent) {
        return this.historyEventRepository.save(historyEvent);
    }

    @Override
    public HistoryEvent updateHistoryEvent(HistoryEvent historyEvent) {
        return this.historyEventRepository.save(historyEvent);
    }

    @Override
    public void deleteHistoryEventById(Long id) {
        this.historyEventRepository.deleteById(id);
    }
}
