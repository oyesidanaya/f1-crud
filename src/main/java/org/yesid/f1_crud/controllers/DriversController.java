package org.yesid.f1_crud.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yesid.f1_crud.entities.F1Driver;
import org.yesid.f1_crud.services.F1DriversService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/drivers")
@AllArgsConstructor
public class DriversController {

    private F1DriversService driversService;

    @GetMapping
    public List<F1Driver> getAllDrivers(){
        return driversService.findAllDrivers();
    }

    @GetMapping("/{id}")
    public F1Driver getDriver(@PathVariable Integer id){
        return driversService.findDriverById(id);
    }

    @PostMapping
    public ResponseEntity<F1Driver> createDriver(@RequestBody F1Driver driver) throws URISyntaxException {
        F1Driver savedDriver = driversService.createDriver(driver);
        return ResponseEntity.created(new URI("/drivers/" + savedDriver.getId())).body(savedDriver);
    }

    @PutMapping("{id}")
    public ResponseEntity<F1Driver> updateDriver(@PathVariable Integer id, @RequestBody F1Driver driver) {
        F1Driver updatedDriver = driversService.updateDriver(id, driver);
        return ResponseEntity.ok(updatedDriver);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteDriver(@PathVariable Integer id) {
        driversService.deleteDriverById(id);
        return ResponseEntity.ok().build();
    }
}
