package com.libraryhub.libraryManagementPortal.Service;

import com.libraryhub.libraryManagementPortal.Entity.Author;
import com.libraryhub.libraryManagementPortal.Entity.Book;
import com.libraryhub.libraryManagementPortal.Repository.AuthorRepository;
import com.libraryhub.libraryManagementPortal.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    public String addBook(Book book) throws Exception{
        Author author;
        try {
            author = authorRepository.findById(book.getAuthor().getAuthorId()).get();
        }
        catch(Exception e){
            throw new Exception("Author not present");
        }
        List<Book> list = author.getBook();
        list.add(book);
        authorRepository.save(author);
        return "Book added Successfully";
    }
}
