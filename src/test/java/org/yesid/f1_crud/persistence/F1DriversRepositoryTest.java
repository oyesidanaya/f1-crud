package org.yesid.f1_crud.persistence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.yesid.f1_crud.BaseTest;
import org.yesid.f1_crud.entities.F1Driver;

import java.util.List;

@DataJpaTest
public class F1DriversRepositoryTest extends BaseTest {

    @Autowired
    private F1DriversRepository repository;

    @Test
    public void testGetAllDrivers() {
        List<F1Driver> drivers = repository.findAll();
        assertAll(
                () -> assertNotNull(drivers),
                () -> assertEquals(1, drivers.size()),
                () -> assertEquals("Verstappen", drivers.get(0).getLastName())
        );
    }
}
