package com.libraryhub.libraryManagementPortal.Service;

import com.libraryhub.libraryManagementPortal.Entity.Author;
import com.libraryhub.libraryManagementPortal.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AuthorService {



    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author added Successfully" ;
    }

    public List<Author> getAuthors(){
        return  authorRepository.findAll() ;
    }
}
