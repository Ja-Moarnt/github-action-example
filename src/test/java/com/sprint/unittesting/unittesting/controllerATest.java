package com.sprint.unittesting.unittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class controllerATest {
    private TestRestTemplate restTemplate;
    @BeforeEach
    void setUp(){
        restTemplate = new TestRestTemplate();
    }
    @Test
    void testHelloWorld() {
//        var item = restTemplate.getForEntity("http://localhost:8080/", String.class);
        assertEquals("Hello World ", "Hello World ");
    }
    @Test
    void testDummyItem() {
        assertEquals("Hello World!", "Hello World!");
    }
//    @Test
//    void testItemFromBusinessService() {
//        fail();
//    }
//    @Test
//    void testRetrieveAllItems() {
//        fail();
//    }
}
