package instruments;

import instrument.Instrument;

public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("Играем этюд на пианино");
    }

}
