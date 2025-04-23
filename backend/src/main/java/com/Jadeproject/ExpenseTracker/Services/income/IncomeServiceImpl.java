package com.Jadeproject.ExpenseTracker.Services.income;



import com.Jadeproject.ExpenseTracker.dto.IncomeDTO;
import com.Jadeproject.ExpenseTracker.entity.Income;
import com.Jadeproject.ExpenseTracker.repository.IncomeRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeRepository;

    @Override
    public Income postIncome(IncomeDTO incomeDTO) {
        return saveOrUpdateIncome(new Income(), incomeDTO);
    }

    private Income saveOrUpdateIncome(Income income, IncomeDTO incomeDTO) {
        income.setTitle(incomeDTO.getTitle());
        income.setDate(incomeDTO.getDate());
        income.setAmount(incomeDTO.getAmount());
        income.setCategory(incomeDTO.getCategory());
        income.setDescription(incomeDTO.getDescription());

        return incomeRepository.save(income);
    }


    public Income updateIncome(Long id, IncomeDTO incomeDTO) {

        Optional<Income> optionalIncome = incomeRepository.findById(id);
        if (optionalIncome.isPresent()) {
            return saveOrUpdateIncome(optionalIncome.get(), incomeDTO);
        }else{
            throw new  EntityNotFoundException("Income is not present with id " + id);
        }

    }

    @Override
    public List<IncomeDTO> getAllIncomes() {
        return incomeRepository.findAll().stream()
                .sorted(Comparator.comparing(Income::getDate).reversed())
                .map(Income::getIncomeDTO) // Updated to match method in Income entity
                .collect(Collectors.toList());
    }
    

    public IncomeDTO getIncomeById(Long id){
        Optional <Income> optionalIncome = incomeRepository.findById(id);
        if (optionalIncome.isPresent()) {
            return optionalIncome.get().getIncomeDTO();
        }else{
            throw new EntityNotFoundException("Income is not present with id " + id);
        }

    }


    
    public void deleteIncome(Long id){
        Optional <Income> optionalIncome = incomeRepository.findById(id);
        if(optionalIncome.isPresent()){
            incomeRepository.deleteById(id);
        }else{
            throw new EntityNotFoundException("Income is not present with id " + id);
        }
    }
}
