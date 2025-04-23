package com.Jadeproject.ExpenseTracker.dto;

import com.Jadeproject.ExpenseTracker.entity.Expense;
import com.Jadeproject.ExpenseTracker.entity.Income;

import java.util.List;
import lombok.Data;

@Data

public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;

}
