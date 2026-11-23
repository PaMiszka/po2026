package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejestracyjny;
    private String model;
    private double predkoscMax;
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Pozycja terazPozycja;

    public Samochod() {
        this.nrRejestracyjny="SZ 78693";
        this.model="Hyundai i20";
        this.predkoscMax=160.0;
        this.silnik=new Silnik("silnik 1.2 benzyna", 82.0, 4500.0, 6000);
        Sprzeglo sprzeglo=new Sprzeglo("klasyczne sprzeglo", 6.0, 600.0);
        this.skrzynia=new SkrzyniaBiegow("manualna 5 biegow", 35.0, 1500.0, 5, sprzeglo);
        this.terazPozycja=new Pozycja(0.0, 0.0);
        this.stanWlaczenia=false;
    }
    public Samochod(String nrRejestracyjny, String model, double predkoscMax,
                    Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja startowaPozycja) {
        this.nrRejestracyjny=nrRejestracyjny;
        this.model=model;
        this.predkoscMax=predkoscMax;
        this.silnik=silnik;
        this.skrzynia=skrzynia;
        this.terazPozycja=startowaPozycja;
        this.stanWlaczenia=false;
    }
    public void wlacz() {
        this.stanWlaczenia = true;
        if (silnik != null) {
            silnik.uruchom();
        }
    }
    public void wylacz() {
        this.stanWlaczenia = false;
        if (silnik != null) {
            silnik.zatrzymaj();
        }
        if (skrzynia != null) {
            while (skrzynia.getAktBieg() > 0) {
                skrzynia.zmniejszBieg();
            }
        }
    }


    public Pozycja getAktPozycja() {
        return terazPozycja;
    }
    public boolean isStanWlaczenia() {
        return stanWlaczenia;
    }
    public String getNrRejest() {
        return nrRejestracyjny;
    }
    public String getModel() {
        return model;
    }
    public Silnik getSilnik() {
        return silnik;
    }
    public SkrzyniaBiegow getSkrzynia() {
        return skrzynia;
    }






}
