package com.github.nathaliafcardoso.CitiesAPI.countries;

import com.github.nathaliafcardoso.CitiesAPI.countries.repository.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRespository extends JpaRepository <Country, Long> {
}
