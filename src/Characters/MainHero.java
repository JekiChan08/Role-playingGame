package Characters;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHero {
    //гг-Главный Герой
    private String name;
    //расса гг
    private Rassa rassa;
    //здоровье гг
    private double health;
    //урон гг
    private double damageHero;
    //Защита гг
    private double protectionHero;


    public Rassa getRassa() {
        return rassa;
    }

    public void setRassa(Rassa rassa) {
        this.rassa = rassa;
    }

    public MainHero() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(double damageHero) {
        this.damageHero = damageHero;
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

}
