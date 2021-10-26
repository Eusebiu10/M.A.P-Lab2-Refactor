package com.company;

import Sports.Leichtathletik.Hochsprung;
import Sports.Mannschaftssport.Fussball;
import Sports.Sport;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sport fussball = new Fussball();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("x","y",Arrays.asList(fussball, hochsprung));
        benutzer.setNachName("Popa");
        benutzer.setVorName("Ionut");
        System.out.println("User: " + benutzer.getNachName() + ' ' + benutzer.getVorName());
        System.out.println(benutzer);

}
}