package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    @GetMapping
    public List<BookDto>getBooks() {return new ArrayList<>();}
    }

