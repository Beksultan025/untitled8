package com.company;

public class Boss {
    private int BossHealth;
    private int BossDamage;
    private String BossDefenseType;

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public void setBossDefenseType(String bossDefenseType) {
        BossDefenseType = bossDefenseType;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public String getBossDefenseType() {
        return BossDefenseType;
    }

    public int getBossDamage() {
        return BossDamage;
    }
}
