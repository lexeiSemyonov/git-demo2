package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessengerServiceTest {

    @Test
    void initials() {
        {
            MessengerService service = new MessengerService();
            String actual = service.initials("Vasiliy Petrov");
            String expected = "VP";

            assertEquals(expected, actual);
        }
        {
            MessengerService service = new MessengerService();
            String actual = service.initials("Vasiliy");
            String expected = "V";

            assertEquals(expected, actual);
        }
    }
}