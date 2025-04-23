package com.Jadeproject.ExpenseTracker.dto;


import com.Jadeproject.ExpenseTracker.entity.Expense;
import com.Jadeproject.ExpenseTracker.entity.Income;
import lombok.Data;

@Data

public class StatsDTO {

    private Double income;

    private Double expense;

    private Income latestIncome;

    private Expense latestExpense;

    private Double balance;

    private Double minIncome;

    private Double maxIncome;

    private Double minExpense;

    private Double maxExpense;


}
