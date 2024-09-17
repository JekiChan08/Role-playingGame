package Characters;

//враги
public enum Enemies {
    GOBLIN(1, "Гоблин", 20, 20),
    SKELETON(1, "Скелет", 20, 20),
    ZOMBIE(1, "Зомби", 20, 20),
    COBALT(1, "Кобальт", 20, 20),
    VAMPIRE(1, "Вампир", 20, 20),
    BASILISK(1, "Василиск", 20, 20),
    GIANT(1, "Гигант", 20, 20),
    SPIDER(1, "Паук", 20, 20),
    CYCLOPS(1, "Циклоп", 20, 20);


    private String name;
    //жизнь
    private double health;
    //защита
    private double protection;
    //урон
    private double damage;

    Enemies(double protection, String name, double health, double damage) {
        this.protection = protection;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}
