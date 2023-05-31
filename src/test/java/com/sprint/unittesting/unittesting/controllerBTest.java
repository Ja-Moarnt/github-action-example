package com.sprint.unittesting.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@AutoConfigureMockMvc
public class controllerBTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testHelloWorld() throws Exception{
        String url = "/";
        mvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.ALL)
                .contentType(MediaType.ALL))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World! 2 lsz"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
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
