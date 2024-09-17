package Characters;

import item.Weapon;
import item.attackItem.Swords;

public class MainHero {
    //гг-Главный Герой
    private String name;
    //расса гг
    private Rassa rassa;
    //здоровье гг
    private double health;
    //Защита гг
    private double protectionHero;
    //Класс персонажа
    private PersonClass personClass;
    //оружие
    private Swords sword;
    //деньги
    private double money;

    public MainHero(){
        this.health = 100;
        this.protectionHero = 10;
        this.money = 100;
    }

    //все статы
    public void getStats() {
        System.out.println("Ваши статы:");
        System.out.println("Здоровье: " + health);
        System.out.println("Урон: " + sword.getDamage());
        System.out.println("Защита: " + protectionHero);
        System.out.println("Класс: " + personClass.getTitle());
        System.out.println("Деньги: " + getMoney());
    }

    public Swords getSword() {
        return sword;
    }

    public void setSword(Swords sword) {
        this.sword = sword;
    }

    public Rassa getRassa() {
        return rassa;
    }

    public void setRassa(Rassa rassa) {
        this.rassa = rassa;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProtectionHero() {
        return protectionHero;
    }

    public void setProtectionHero(double protectionHero) {
        this.protectionHero = protectionHero;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public PersonClass getPersonClass() {
        return personClass;
    }

    public void setPersonClass(PersonClass personClass) {
        this.personClass = personClass;
    }
}
