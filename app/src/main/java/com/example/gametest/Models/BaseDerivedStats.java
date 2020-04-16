package com.example.gametest.Models;

public class BaseDerivedStats {
    private Integer derivHealth;
    private Integer derivEvasion;
    private Integer derivDamage;
    private Integer derivStamina;
    private Integer derivMoveSpeedModifier;
    private Integer derivAttackSpeed;
    private Integer derivDamageResist;
    private Integer derivRadiationResist;
    private Integer derivPoisonResist;
    private Integer derivExperienceModifier;
    private Integer derivModifierSlot1;
    private Integer derivModifierSlot2;
    private Integer derivModifierSlot3;
    private Integer derivModifierSlot4;
    private Integer derivModifierSlot5;
    private Integer derivModifierSlot6;

    public BaseDerivedStats() {
    }

    public BaseDerivedStats(Integer derivHealth, Integer derivEvasion, Integer derivDamage, Integer derivStamina, Integer derivMoveSpeedModifier, Integer derivAttackSpeed, Integer derivDamageResist, Integer derivRadiationResist, Integer derivPoisonResist, Integer derivExperienceModifier, Integer derivModifierSlot1, Integer derivModifierSlot2, Integer derivModifierSlot3, Integer derivModifierSlot4, Integer derivModifierSlot5, Integer derivModifierSlot6) {
        this.derivHealth = derivHealth;
        this.derivEvasion = derivEvasion;
        this.derivDamage = derivDamage;
        this.derivStamina = derivStamina;
        this.derivMoveSpeedModifier = derivMoveSpeedModifier;
        this.derivAttackSpeed = derivAttackSpeed;
        this.derivDamageResist = derivDamageResist;
        this.derivRadiationResist = derivRadiationResist;
        this.derivPoisonResist = derivPoisonResist;
        this.derivExperienceModifier = derivExperienceModifier;
        this.derivModifierSlot1 = derivModifierSlot1;
        this.derivModifierSlot2 = derivModifierSlot2;
        this.derivModifierSlot3 = derivModifierSlot3;
        this.derivModifierSlot4 = derivModifierSlot4;
        this.derivModifierSlot5 = derivModifierSlot5;
        this.derivModifierSlot6 = derivModifierSlot6;
    }

    public Integer getDerivHealth() {
        return derivHealth;
    }

    public void setDerivHealth(Integer derivHealth) {
        this.derivHealth = derivHealth;
    }

    public Integer getDerivEvasion() {
        return derivEvasion;
    }

    public void setDerivEvasion(Integer derivEvasion) {
        this.derivEvasion = derivEvasion;
    }

    public Integer getDerivDamage() {
        return derivDamage;
    }

    public void setDerivDamage(Integer derivDamage) {
        this.derivDamage = derivDamage;
    }

    public Integer getDerivStamina() {
        return derivStamina;
    }

    public void setDerivStamina(Integer derivStamina) {
        this.derivStamina = derivStamina;
    }

    public Integer getDerivMoveSpeedModifier() {
        return derivMoveSpeedModifier;
    }

    public void setDerivMoveSpeedModifier(Integer derivMoveSpeedModifier) {
        this.derivMoveSpeedModifier = derivMoveSpeedModifier;
    }

    public Integer getDerivAttackSpeed() {
        return derivAttackSpeed;
    }

    public void setDerivAttackSpeed(Integer derivAttackSpeed) {
        this.derivAttackSpeed = derivAttackSpeed;
    }

    public Integer getDerivDamageResist() {
        return derivDamageResist;
    }

    public void setDerivDamageResist(Integer derivDamageResist) {
        this.derivDamageResist = derivDamageResist;
    }

    public Integer getDerivRadiationResist() {
        return derivRadiationResist;
    }

    public void setDerivRadiationResist(Integer derivRadiationResist) {
        this.derivRadiationResist = derivRadiationResist;
    }

    public Integer getDerivPoisonResist() {
        return derivPoisonResist;
    }

    public void setDerivPoisonResist(Integer derivPoisonResist) {
        this.derivPoisonResist = derivPoisonResist;
    }

    public Integer getDerivExperienceModifier() {
        return derivExperienceModifier;
    }

    public void setDerivExperienceModifier(Integer derivExperienceModifier) {
        this.derivExperienceModifier = derivExperienceModifier;
    }

    public Integer getDerivModifierSlot1() {
        return derivModifierSlot1;
    }

    public void setDerivModifierSlot1(Integer derivModifierSlot1) {
        this.derivModifierSlot1 = derivModifierSlot1;
    }

    public Integer getDerivModifierSlot2() {
        return derivModifierSlot2;
    }

    public void setDerivModifierSlot2(Integer derivModifierSlot2) {
        this.derivModifierSlot2 = derivModifierSlot2;
    }

    public Integer getDerivModifierSlot3() {
        return derivModifierSlot3;
    }

    public void setDerivModifierSlot3(Integer derivModifierSlot3) {
        this.derivModifierSlot3 = derivModifierSlot3;
    }

    public Integer getDerivModifierSlot4() {
        return derivModifierSlot4;
    }

    public void setDerivModifierSlot4(Integer derivModifierSlot4) {
        this.derivModifierSlot4 = derivModifierSlot4;
    }

    public Integer getDerivModifierSlot5() {
        return derivModifierSlot5;
    }

    public void setDerivModifierSlot5(Integer derivModifierSlot5) {
        this.derivModifierSlot5 = derivModifierSlot5;
    }

    public Integer getDerivModifierSlot6() {
        return derivModifierSlot6;
    }

    public void setDerivModifierSlot6(Integer derivModifierSlot6) {
        this.derivModifierSlot6 = derivModifierSlot6;
    }

    @Override
    public String toString() {
        return "BaseDerivedStats{" +
                "derivHealth=" + derivHealth +
                ", derivEvasion=" + derivEvasion +
                ", derivDamage=" + derivDamage +
                ", derivStamina=" + derivStamina +
                ", derivMoveSpeedModifier=" + derivMoveSpeedModifier +
                ", derivAttackSpeed=" + derivAttackSpeed +
                ", derivDamageResist=" + derivDamageResist +
                ", derivRadiationResist=" + derivRadiationResist +
                ", derivPoisonResist=" + derivPoisonResist +
                ", derivExperienceModifier=" + derivExperienceModifier +
                ", derivModifierSlot1=" + derivModifierSlot1 +
                ", derivModifierSlot2=" + derivModifierSlot2 +
                ", derivModifierSlot3=" + derivModifierSlot3 +
                ", derivModifierSlot4=" + derivModifierSlot4 +
                ", derivModifierSlot5=" + derivModifierSlot5 +
                ", derivModifierSlot6=" + derivModifierSlot6 +
                '}';
    }
}
