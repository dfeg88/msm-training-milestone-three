package com.moneysupermarket.milestonethree.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
@WebMvcTest(value = CurrentTimeController.class, secure = false)
class ProfileControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_save_success_shouldReturnAResponseEntity() {

    }
}