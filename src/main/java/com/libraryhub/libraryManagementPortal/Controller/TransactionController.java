package com.libraryhub.libraryManagementPortal.Controller;

import com.libraryhub.libraryManagementPortal.DTO.RequestDto.IssueBookRequestDto;
import com.libraryhub.libraryManagementPortal.DTO.ResponseDto.IssueBookResponseDto;
import com.libraryhub.libraryManagementPortal.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/add")
    public IssueBookResponseDto issueBook(@RequestBody IssueBookRequestDto issueBookRequestDto) throws Exception {

        return transactionService.issueBook(issueBookRequestDto);
    }
}
