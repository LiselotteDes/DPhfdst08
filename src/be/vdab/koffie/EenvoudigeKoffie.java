package be.vdab.koffie;
import java.math.BigDecimal;
public class EenvoudigeKoffie implements Koffie {
    private BigDecimal prijs = BigDecimal.valueOf(3);
    @Override
    public BigDecimal getKost(){
        return prijs;
    }
    @Override
    public String getBereidingswijze() {
        return "maal de koffiebonen, laat kokend water over het poeder lopen";
    }
}
