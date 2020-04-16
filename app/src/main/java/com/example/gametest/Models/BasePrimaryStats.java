package com.example.gametest.Models;

public class BasePrimaryStats {
    private Integer primStrength;
    private Integer primPerception;
    private Integer primEndurance;
    private Integer primCharisma;
    private Integer primIntelligence;
    private Integer primAgility;
    private Integer primLuck;

    public BasePrimaryStats() {
    }

    public BasePrimaryStats(Integer primStrength, Integer primPerception, Integer primEndurance, Integer primCharisma, Integer primIntelligence, Integer primAgility, Integer primLuck) {
        this.primStrength = primStrength;
        this.primPerception = primPerception;
        this.primEndurance = primEndurance;
        this.primCharisma = primCharisma;
        this.primIntelligence = primIntelligence;
        this.primAgility = primAgility;
        this.primLuck = primLuck;
    }

    public Integer getPrimStrength() {
        return primStrength;
    }

    public void setPrimStrength(Integer primStrength) {
        this.primStrength = primStrength;
    }

    public Integer getPrimPerception() {
        return primPerception;
    }

    public void setPrimPerception(Integer primPerception) {
        this.primPerception = primPerception;
    }

    public Integer getPrimEndurance() {
        return primEndurance;
    }

    public void setPrimEndurance(Integer primEndurance) {
        this.primEndurance = primEndurance;
    }

    public Integer getPrimCharisma() {
        return primCharisma;
    }

    public void setPrimCharisma(Integer primCharisma) {
        this.primCharisma = primCharisma;
    }

    public Integer getPrimIntelligence() {
        return primIntelligence;
    }

    public void setPrimIntelligence(Integer primIntelligence) {
        this.primIntelligence = primIntelligence;
    }

    public Integer getPrimAgility() {
        return primAgility;
    }

    public void setPrimAgility(Integer primAgility) {
        this.primAgility = primAgility;
    }

    public Integer getPrimLuck() {
        return primLuck;
    }

    public void setPrimLuck(Integer primLuck) {
        this.primLuck = primLuck;
    }

    @Override
    public String toString() {
        return "BasePrimaryStats{" +
                "primStrength=" + primStrength +
                ", primPerception=" + primPerception +
                ", primEndurance=" + primEndurance +
                ", primCharisma=" + primCharisma +
                ", primIntelligence=" + primIntelligence +
                ", primAgility=" + primAgility +
                ", primLuck=" + primLuck +
                '}';
    }

}
