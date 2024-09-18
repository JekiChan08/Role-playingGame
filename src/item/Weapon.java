package item;

public enum Weapon {
    SWORD(10, 100, TypeDamage.PHYSICAL),
    GREAMUAR(10, 100, TypeDamage.MAGICAL);

    private double damage;
    private double price;
    private TypeDamage typeDamage;


    Weapon(double damage, double price, TypeDamage typeDamage) {
        this.damage = damage;
        this.price = price;
        this.typeDamage = typeDamage;
    }

    Weapon(double damage) {
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
