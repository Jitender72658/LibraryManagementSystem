package com.libraryhub.libraryManagementPortal.Controller;

import com.libraryhub.libraryManagementPortal.Entity.Book;
import com.libraryhub.libraryManagementPortal.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add_book")
    public String addBook(@RequestBody Book book) throws Exception{
        return bookService.addBook(book);
    }

    // find all the books

    // find all the books of a particular authorId

    // // find the number of books written by an author
}
