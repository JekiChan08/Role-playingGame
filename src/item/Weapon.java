package item;
//Оружие
public  class Weapon {
    //название оружия
    private String title;
    //значение которое даёт оружие, если оружие на урон то дает плюс урон, если поддешка то здоровье, если защитный то защиту
    private double value;

    public Weapon() {
        this.title = title;
        this.value = value;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
