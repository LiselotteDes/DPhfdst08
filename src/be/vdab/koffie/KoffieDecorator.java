package be.vdab.koffie;
public abstract class KoffieDecorator implements Koffie {
    protected final Koffie gedecoreerdeKoffie;
    public KoffieDecorator(Koffie koffie){
        this.gedecoreerdeKoffie = koffie;
    }
}
