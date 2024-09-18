package item;

public enum TypeItems {
    //Вид урона
    BUFF("Баффающий"),
    PROTECTION("Защитный");

    private String title;

    TypeItems(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
