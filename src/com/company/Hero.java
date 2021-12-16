package com.company;

public class Hero {
    private int HeroHealth;
    private int HeroDamage;
    private String SuperHero;

    public Hero() {
    }

    public Hero (double HeroDamage , int HeroHealth , String SuperHero){}
    public Hero (int HeroDamage , double HeroHealth , String SuperHero){}

    public Hero(int heroDamage, int HeroHealth, String SuperHero) {
        this.HeroDamage = heroDamage;
        this.HeroHealth = HeroHealth;
        this.SuperHero = SuperHero;
    }

    public Hero(int HeroHealth, int HeroDamage) {
        this.HeroHealth = HeroHealth;
        this.HeroDamage = HeroDamage;


    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public String getHeroDefenseType() {
        return SuperHero;
    }
}