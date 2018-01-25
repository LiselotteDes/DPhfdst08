package be.vdab.koffie;
import java.math.BigDecimal;
public class MetChocolade extends KoffieDecorator {
    // MetChocolade decoreert een EenvoudigeKoffie of een MetMelk die (onder de gedaante van Koffie) als constructor parameter binnenkomt.
    public MetChocolade(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost() {
        // De kost van MetChocolade is de kost van de koffie die hij decoreert plus de kost van de chocolade zelf: twee euro.
        return super.gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }
    @Override 
    public String getBereidingswijze() {
        // De bereidingswijze van MetChocolade is de bereidingswijze van de koffie die hij decoreert plus de bereidingswijze van de chocolade zelf.
        return super.gedecoreerdeKoffie.getBereidingswijze()
                + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
