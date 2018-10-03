package com.moneysupermarket.milestonethree.controller;

import com.moneysupermarket.milestonethree.model.CurrentTime;
import com.moneysupermarket.milestonethree.service.CurrentTimeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
@WebMvcTest(value = CurrentTimeController.class, secure = false)
public class CurrentTimeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CurrentTimeService currentTimeService;

    @BeforeEach
    void setup() {
        when(currentTimeService.getCurrentTimes()).thenReturn(new CurrentTime(LocalTime.now(), LocalTime.now(ZoneId.of("UTC-7"))));
    }

    @Test
    public void test_getLocalAndCanadianDateTimes_success() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/current-times")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse().getContentAsString());
        assertNotNull(result.getResponse());
        assertEquals(200, result.getResponse().getStatus());
        assertEquals("application/json;charset=UTF-8", result.getResponse().getContentType());
    }
}