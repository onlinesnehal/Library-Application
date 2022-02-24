package com.learning.library.service;

import com.learning.library.model.Book;
import com.learning.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    //add delete update delete
    @Autowired
    private LibraryRepository libraryRepository;

    public String addBook(Book book)
    {
       this.libraryRepository.save(book);
       return "Book added successfully";
    }

    public String deleteBook(Long bookid)
    {
        this.libraryRepository.deleteById(bookid);
        return "Book deleted successfully";
    }

    public String updateBook(Long bookid,Book book)
    {
        this.libraryRepository.save(book);
        return "Book deleted successfully";
    }

    public List<Book> fetchAll()
    {
       return this.libraryRepository.findAll();
    }

    public Optional<Book> fetchbybookid(Long bookid)
    {
        return this.libraryRepository.findById(bookid);
    }

}
