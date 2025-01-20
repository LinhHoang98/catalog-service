package com.polarbookshop.catalogservice.web;

import com.polarbookshop.catalogservice.domain.BookService;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BookController.class)
class BookControllerMvcTests {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private BookService bookService;

//    @Test
//    void whenGetBookNotExistingThenShouldReturn404() throws Exception {
//        String isbn = "73737313940";
//        given(bookService.viewBookDetails(isbn)).willThrow(BookNotFoundException.class);
//        mockMvc
//                .perform(get("/books/" + isbn))
//                .andExpect(status().isNotFound());
//    }

}
