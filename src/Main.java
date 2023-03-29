import instruments.Guitar;
import instruments.Piano;
import musician.Musician;

public class Main {
    public static void main(String[] args) {

        Musician musician = new Musician(new Piano());

        musician.startPlay();

        musician.setInstrument(new Guitar());

        musician.startPlay();

    }
}
