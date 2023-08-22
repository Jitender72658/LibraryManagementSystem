package com.libraryhub.libraryManagementPortal.Repository;

import com.libraryhub.libraryManagementPortal.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
