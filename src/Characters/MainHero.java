package Characters;

import item.Items;
import item.Weapon;

import java.util.ArrayList;

public class MainHero {
    //гг-Главный Герой
    private String name;
    //расса гг
    private Rassa rassa;
    //здоровье гг
    private double health;
    //Класс персонажа
    private PersonClass personClass;
    //оружие
    private Weapon weapon;
    //деньги
    private double money;

    private ArrayList<Items> items;

    public MainHero(){
        this.health = 100;
        this.money = 50;
        items = new ArrayList<>();
    }

    //все статы
    public void getStats() {
        System.out.println("Ваши статы:");
        System.out.println("Здоровье: " + health);
        System.out.println("Урон: " + weapon.getDamage());
        System.out.println("Класс: " + personClass.getTitle());
        System.out.println("Деньги: " + getMoney());
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public double getDamage() {
        return weapon.getDamage();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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
