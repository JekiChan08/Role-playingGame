package plot.endings;

import Characters.MainHero;
import plot.location.City;

//сюжет если гг человек
public class EndPerson {
    public static void start(MainHero mainHero) {
        System.out.println("Начинаеться ролевая игра, над игрой работала 3-команда;)\n" +
                "цель игры: убить всех монстров в c первого по десятый этаж поджемелья, победив босса вы станете героем!\n" +
                "Что являеться мечтой героя.");
        City.start(mainHero);

    }
}
