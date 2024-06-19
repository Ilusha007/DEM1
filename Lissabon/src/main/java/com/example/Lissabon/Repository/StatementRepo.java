package com.example.Lissabon.Repository;

import com.example.Lissabon.Model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementRepo extends JpaRepository<Statement, Long> {
}
