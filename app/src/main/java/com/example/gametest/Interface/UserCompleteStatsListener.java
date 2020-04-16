package com.example.gametest.Interface;

import com.example.gametest.Models.BaseDerivedStats;
import com.example.gametest.Models.BasePrimaryStats;

public interface UserCompleteStatsListener {
    void onStatsCalculated(BasePrimaryStats primaryStats, BaseDerivedStats derivedStats);
}
