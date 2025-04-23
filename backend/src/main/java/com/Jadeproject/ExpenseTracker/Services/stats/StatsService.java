package com.Jadeproject.ExpenseTracker.Services.stats;

import com.Jadeproject.ExpenseTracker.dto.GraphDTO;
import com.Jadeproject.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
