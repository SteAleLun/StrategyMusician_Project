package musician;

import instrument.Instrument;

public class Musician {

    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

     public void startPlay(){
        System.out.println("Берём в руки инструмент");
        instrument.play();
    }
}
