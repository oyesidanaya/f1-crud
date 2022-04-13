package org.yesid.f1_crud.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.yesid.f1_crud.BaseTest;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class DriversControllerTest extends BaseTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void driversTest() throws Exception {
        mvc.perform(get("/drivers").accept(MediaType.APPLICATION_JSON))
        .andExpectAll(
                status().isOk(),
                content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON),
                jsonPath("$[0].id", is(1)),
                jsonPath("$[0].firstName", is("Max")),
                jsonPath("$[0].lastName", is("Verstappen"))
        );
    }
}
