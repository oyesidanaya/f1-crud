package org.yesid.f1_crud.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yesid.f1_crud.BaseTest;
import org.yesid.f1_crud.entities.F1Driver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class F1DriverServiceTest extends BaseTest {

    @Autowired
    private F1DriversService f1DriversService;

    @Test
    public void getAllDriverServiceTest() {
        List<F1Driver> drivers = f1DriversService.findAllDrivers();
        assertAll(
                () -> assertNotNull(drivers),
                () -> assertEquals(1, drivers.size()),
                () -> assertEquals("Verstappen", drivers.get(0).getLastName())
        );
    }

    @Test
    public void updateDriverTest() {
        F1Driver upToDateDriver = new F1Driver();
        upToDateDriver.setPodiums(100);
        upToDateDriver.setWins(50);
        upToDateDriver.setPoles(25);

        f1DriversService.updateDriver(1, upToDateDriver);
        F1Driver updatedDriver = f1DriversService.findDriverById(1);
                assertAll(
                () -> assertEquals(100, updatedDriver.getPodiums()),
                () -> assertEquals(50, updatedDriver.getWins()),
                () -> assertEquals(25, updatedDriver.getPoles())
        );
    }


}
