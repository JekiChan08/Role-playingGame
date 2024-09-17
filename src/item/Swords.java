package item;

public enum Swords {
    BASIC_SWORD(5, 0),
    SWORD10(10, 100),
    SWORD20(20, 200),
    SWORD30(30, 300),
    SWORD40(40, 400),
    SWORD50(50, 500),
    SWORD60(60, 600),
    SWORD70(70, 700),
    SWORD80(80, 800),
    SWORD90(90, 900),
    SWORD100(100, 1000);

    private double damage;
    private double price;


    Swords(double damage, double price) {
        this.damage = damage;
        this.price = price;
    }

    Swords(double damage) {
        this.damage = damage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
