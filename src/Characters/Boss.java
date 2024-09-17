package Characters;

//Боссы
public enum Boss {
    DRACULA(500, "Дракула", 9000, 200),
    DRAGON(500, "Дракон", 10000, 200),
    GIANT_WORM(500, "Гиганский Червь", 10000, 200),
    GRIFFIN(500, "Грифон", 10000, 200);

    private String name;
    //жизнь
    private double health;
    //защита
    private double protection;
    //урон
    private double damage;

    Boss(double protection, String name, double health, double damage) {
        this.protection = protection;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}
