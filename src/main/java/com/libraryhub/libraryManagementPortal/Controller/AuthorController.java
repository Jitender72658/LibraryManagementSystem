package com.libraryhub.libraryManagementPortal.Controller;

import com.libraryhub.libraryManagementPortal.Entity.Author;
import com.libraryhub.libraryManagementPortal.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/add_author")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/get_authors")
    public List<Author> getAuthors(){
        return  authorService.getAuthors();
    }
}
