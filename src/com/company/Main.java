package com.company;

public class Main {

    public static void createHeroes() {
        Hero hero1 = new Hero(24, 400, "Physical");
        Hero hero2 = new Hero(25.5, 360, "Medic");
        Hero hero3 = new Hero(30, 350.5, "Kinetic");
        Hero[] m = new Hero[]{hero1, hero2, hero3};
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        return;
    }


    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setBossHealth(1000);
        b1.setBossDamage(100);
        b1.setBossDefenseType("Kinetic");
        System.out.println(b1.getBossHealth() + " " + b1.getBossDamage() + " " + b1.getBossDefenseType());
        createHeroes();

    }

}
