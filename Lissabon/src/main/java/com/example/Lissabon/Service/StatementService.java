package com.example.Lissabon.Service;


import com.example.Lissabon.Model.Statement;
import com.example.Lissabon.Repository.StatementRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor


public class StatementService {

    private final StatementRepo statementRepo;


    public List<Statement> findAllStatement(){
       return statementRepo.findAll();
    }


    public void create(Statement statement){
        statement.setCarNumber(statement.getCarNumber());
        statement.setDescription(statement.getDescription());
        statementRepo.save(statement);
    }



}
