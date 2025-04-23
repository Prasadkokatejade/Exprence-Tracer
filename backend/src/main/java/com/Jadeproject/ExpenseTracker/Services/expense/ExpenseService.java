package com.Jadeproject.ExpenseTracker.Services.expense;

import java.util.List;

import com.Jadeproject.ExpenseTracker.dto.ExpenseDTO;
import com.Jadeproject.ExpenseTracker.entity.Expense;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id , ExpenseDTO expenseDTO);


    void deleteExpanse(Long id);
}
