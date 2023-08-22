package com.libraryhub.libraryManagementPortal.Repository;

import com.libraryhub.libraryManagementPortal.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard,Integer> {
}
