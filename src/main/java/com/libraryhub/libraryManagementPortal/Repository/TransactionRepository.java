package com.libraryhub.libraryManagementPortal.Repository;
import com.libraryhub.libraryManagementPortal.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
