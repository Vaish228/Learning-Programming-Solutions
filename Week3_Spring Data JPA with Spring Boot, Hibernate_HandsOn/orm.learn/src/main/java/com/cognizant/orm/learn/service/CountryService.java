package com.cognizant.orm.learn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm.learn.model.Country;
import com.cognizant.orm.learn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        List<Country> list = countryRepository.findAll();
        System.out.println("Fetched countries: " + list);
        return list;
    }

}
