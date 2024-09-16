package plot;

import Characters.MainHero;
import Characters.Rassa;
import plot.endings.EndPerson;

import java.util.Scanner;

//Сюжет
public class Plot {
    public static void startingPlot(MainHero mainHero) {
        //начало сюжета
        Beginning.ChoosingRace(mainHero);
        if (mainHero.getRassa() == Rassa.PERSON) {
            EndPerson.start(mainHero);
        }
    }
}
