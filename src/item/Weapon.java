package item;
//Оружие
public  class Weapon {
    //значение которое даёт оружие, если оружие на урон то дает плюс урон, если поддешка то здоровье, если защитный то защиту
    private double value;
    //Вид урона
    private TypeDamage typeDamage;

    public Weapon() {
    }

    public TypeDamage getTypeDamage() {
        return typeDamage;
    }

    public void setTypeDamage(TypeDamage typeDamage) {
        this.typeDamage = typeDamage;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
