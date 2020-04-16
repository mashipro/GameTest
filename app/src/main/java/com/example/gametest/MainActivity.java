package com.example.gametest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.gametest.Models.BaseDerivedStats;
import com.example.gametest.Models.BasePrimaryStats;
import com.example.gametest.Utility.BaseStatsManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private BasePrimaryStats basePrimaryStats, dummyStats1, dummyStats2;
    private BaseDerivedStats baseDerivedStats;
    private BaseStatsManager baseStatsManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseStatsManager = new BaseStatsManager();

//        dummyStats1 = new BasePrimaryStats();
//        dummyStats1.setPrimStrength(1);
//        dummyStats1.setPrimPerception(1);
//        dummyStats1.setPrimEndurance(1);
//        dummyStats1.setPrimCharisma(1);
//        dummyStats1.setPrimIntelligence(1);
//        dummyStats1.setPrimAgility(1);
//        dummyStats1.setPrimLuck(1);
//        Log.d(TAG, "onCreate: dummyStats1: "+dummyStats1);

        getPlayerStats();


    }

    private void getPlayerStats() {
        Log.d(TAG, "getPlayerStats: init");
        baseDerivedStats = baseStatsManager.getDerivedStats();
        Log.d(TAG, "getPlayerStats: derivedstats: "+baseDerivedStats);
    }
}
