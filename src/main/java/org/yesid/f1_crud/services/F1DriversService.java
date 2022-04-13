package org.yesid.f1_crud.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yesid.f1_crud.entities.F1Driver;
import org.yesid.f1_crud.persistence.F1DriversRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class F1DriversService {

    private F1DriversRepository f1DriversRepository;

    public List<F1Driver> findAllDrivers() {
        return f1DriversRepository.findAll();
    }

    public F1Driver findDriverById(Integer id) {
        return f1DriversRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public F1Driver createDriver(F1Driver driver) {
        return f1DriversRepository.save(driver);
    }

    public F1Driver updateDriver(Integer id, F1Driver driver) {
        F1Driver savedDriver = findDriverById(id);
        if (driver.getPoles() != null) savedDriver.setPoles(driver.getPoles());
        if(driver.getWins() != null) savedDriver.setWins(driver.getWins());
        if(driver.getPodiums() != null) savedDriver.setPodiums(driver.getPodiums());
        return f1DriversRepository.save(savedDriver);
    }

    public void deleteDriverById(Integer id) {
        f1DriversRepository.deleteById(id);
    }
}
