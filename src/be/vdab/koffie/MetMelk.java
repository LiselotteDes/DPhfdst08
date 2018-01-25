package be.vdab.koffie;
import java.math.BigDecimal;
public class MetMelk extends KoffieDecorator {
    // MetMelk decoreert een EenvoudigeKoffie die (onder de gedaante van Koffie) als constructor parameter binnenkomt.
    public MetMelk(Koffie gedecoreerdeKoffie) {
        /*
        Geeft deze parameter door aan de base class constructor. 
        Deze onthoudt de parameter in een protected variabele
        */
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost() {
        // De kost van MetMelk is de kost van de koffie die hij decoreert plus de kost van de melk zelf: 1 euro.
        return super.gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }
    @Override
    public String getBereidingswijze() {
        // De bereidingswijze van MetMelk is de bereidingswijze van de koffie die hij decoreert plus de bereidingswijze van de melk zelf.
        return super.gedecoreerdeKoffie.getBereidingswijze() + ", warm de melk, voeg de melk toe";
    }
}
