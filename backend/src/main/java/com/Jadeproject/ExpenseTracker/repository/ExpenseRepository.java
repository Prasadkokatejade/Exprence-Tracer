package com.Jadeproject.ExpenseTracker.repository;


import com.Jadeproject.ExpenseTracker.entity.Expense;
import com.Jadeproject.ExpenseTracker.entity.Income;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {


    List<Expense> findByDateBetween(LocalDate startDate , LocalDate endDate );

    @Query("SELECT SUM(e.amount) FROM Expense e")
    Double sumAllAmounts();

    Optional<Expense> findFirstByOrderByDateDesc();

    Optional<Expense> findTopByOrderByDateDesc();

}
