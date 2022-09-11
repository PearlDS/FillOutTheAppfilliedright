package be.intecbrussel.zoo.services.implementations;

import be.intecbrussel.zoo.data.Country;
import be.intecbrussel.zoo.repositories.CountryRepository;
import be.intecbrussel.zoo.services.interfaces.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServicImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;


    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryByName(String countryName) {
        System.out.println(countryName);
        return countryRepository.getOne(countryName);
    }
}
