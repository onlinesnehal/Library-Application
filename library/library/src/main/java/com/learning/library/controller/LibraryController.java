package com.learning.library.controller;

import com.learning.library.model.Book;
import com.learning.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping(value = "/all")
    public List<Book> getAll() {
        return this.libraryService.fetchAll();
    }

    @PostMapping(value = "/add")
    public String addBook(@RequestBody Book book) {
        return this.libraryService.addBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return this.libraryService.deleteBook(id);
    }

    @PutMapping("/update/{bookid}")
    public String updatebook(@PathVariable Long bookid, @RequestBody Book book) {
        this.libraryService.updateBook(bookid, book);
        return "updated successfully";
    }

    @GetMapping("/book/{bookid}")
    public Optional<Book> getbyid(@PathVariable Long bookid)
    {
        return this.libraryService.fetchbybookid(bookid);
    }
}