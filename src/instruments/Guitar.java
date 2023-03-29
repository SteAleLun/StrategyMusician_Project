package instruments;

import instrument.Instrument;

public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Играем Master of Puppets на гитаре");
    }

}
