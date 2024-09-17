package plot.endings;

import Characters.MainHero;

//подземелье
public class Dungeon {
    //уровень
    private int level;


    public void start(MainHero mainHero) {
        System.out.println("Вы вошли в подземелье");
        System.out.println("уровень подземелья: " + level);
    }


    public Dungeon() {
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
