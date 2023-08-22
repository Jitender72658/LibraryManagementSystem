package com.libraryhub.libraryManagementPortal.Service;

import com.libraryhub.libraryManagementPortal.Entity.LibraryCard;
import com.libraryhub.libraryManagementPortal.Entity.Student;
import com.libraryhub.libraryManagementPortal.Enum.CardStatus;
import com.libraryhub.libraryManagementPortal.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public String addStudent(@RequestBody Student student){
        LibraryCard card = new LibraryCard();
        card.setValidTill("06/2025");
        card.setCardStatus(CardStatus.ACTIVATED);
        student.setLibraryCard(card);
        card.setStudent(student);
        studentRepository.save(student);
        return "Student added Successfully";
    }
}
