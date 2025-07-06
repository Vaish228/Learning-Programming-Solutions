package com.cognizant.orm.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm.learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
