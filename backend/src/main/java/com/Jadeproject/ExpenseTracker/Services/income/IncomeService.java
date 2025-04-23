package com.Jadeproject.ExpenseTracker.Services.income;

import com.Jadeproject.ExpenseTracker.dto.IncomeDTO;
import com.Jadeproject.ExpenseTracker.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

    List<IncomeDTO> getAllIncomes();

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeById(Long id);

    void deleteIncome(Long id);
}
