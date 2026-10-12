package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
    @Autowired
    private MockMvc mvc;

    @Test
    void greetingReturnsJson() throws Exception {
        mvc.perform(get("/api/hello"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message").value("Bonjour depuis Java 21 !"))
            .andExpect(jsonPath("$.javaVersion").value(Runtime.version().feature()));
    }

    @Test
    void homepageIsAvailable() throws Exception {
        mvc.perform(get("/index.html"))
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Mon application Java fonctionne.")));
    }
}
