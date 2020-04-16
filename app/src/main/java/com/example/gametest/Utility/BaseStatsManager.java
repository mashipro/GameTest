package com.example.gametest.Utility;

import android.util.Log;

import com.example.gametest.Models.BaseDerivedStats;
import com.example.gametest.Models.BasePrimaryStats;
import com.example.gametest.Models.BaseStatsModifier;

public class BaseStatsManager {
    private static final String TAG = "BaseStatsManager";
    private BasePrimaryStats basePrimaryStats;
    private BaseDerivedStats baseDerivedStats;
    private BaseStatsModifier baseStatsModifier;

    /*test modifier value*/
    private Integer modifierValue = 10;

    public BaseStatsManager() {
        Log.d(TAG, "BaseStatsManager: init");

    }

    /*GETTING DERIVED STATS*/
    public BaseDerivedStats getDerivedStats() {
        Log.d(TAG, "getDerivedStats: init");
        basePrimaryStats = new BasePrimaryStats();
        basePrimaryStats.setPrimLuck(1);
        basePrimaryStats.setPrimIntelligence(1);
        basePrimaryStats.setPrimEndurance(1);
        basePrimaryStats.setPrimPerception(1);
        basePrimaryStats.setPrimStrength(1);
        basePrimaryStats.setPrimAgility(1);
        basePrimaryStats.setPrimCharisma(1);
        Log.d(TAG, "getDerivedStats: primary stat= "+basePrimaryStats);

        baseDerivedStats = new BaseDerivedStats();
        baseDerivedStats.setDerivHealth(HealthFormula(basePrimaryStats));
        baseDerivedStats.setDerivEvasion(EvasionFormula(basePrimaryStats));
        return baseDerivedStats;
    }

    /*STATS CALCULATION FROM PRIMARY STATS TO DERIVED STATS*/
    /*HEALTH*/
    private Integer HealthFormula(BasePrimaryStats stats){
        Log.d(TAG, "HealthFormula: init");
        Integer baseHealthPoint = ConstantValue.STATBASE_HP;
        Integer healthPoint = baseHealthPoint+((stats.getPrimEndurance()*ConstantValue.STATBASE_HP_END_FACTOR)+(stats.getPrimStrength()/ConstantValue.STATBASE_HP_STR_FACTOR));
        return healthPoint;
    }

    private Integer EvasionFormula(BasePrimaryStats stats){
        Log.d(TAG, "EvasionFormula: init");
        Integer baseEvasionPoint = ConstantValue.STATBASE_EVASION;
        return baseEvasionPoint+(stats.getPrimAgility()/ConstantValue.STATBASE_EVASION_AGI_FACTOR);
    }

}
