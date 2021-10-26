package test.Teste;

import Sports.Mannschaftssport.Fussball;
import Sports.Sport;
import com.company.Benutzer;
import org.junit.jupiter.api.Test;

import java.util.List;

class BenutzerTest {

    private Object Fussball;

    @Test
    void kalkuliereZeit() {
        Benutzer a=new Benutzer("Ana","Maria", (List<Sport>) Fussball);

    }

    @Test
    void kalkuliereDurchschnittzeit() {
        Benutzer a=new Benutzer("Ana","Maria", (List<Sport>) Fussball);


    }
}