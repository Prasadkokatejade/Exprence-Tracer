package com.Jadeproject.ExpenseTracker.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Jadeproject.ExpenseTracker.entity.Expense;
import com.Jadeproject.ExpenseTracker.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {


    List<Income> findByDateBetween(LocalDate startDate , LocalDate endDate );

    @Query("SELECT SUM(i.amount) FROM Income i")
    Double sumAllAmounts();

    Optional<Income> findFirstByOrderByDateDesc();

    Optional<Income> findTopByOrderByDateDesc();


}
