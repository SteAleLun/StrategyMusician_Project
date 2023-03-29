package musician;

import instrument.Instrument;

public class Musician {

    Instrument instrument;

     public void startPlay(){
        System.out.println("Берём в руки инструмент");
        instrument.play();
    }

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
