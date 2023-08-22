package com.libraryhub.libraryManagementPortal.Repository;

import com.libraryhub.libraryManagementPortal.Entity.Book;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
