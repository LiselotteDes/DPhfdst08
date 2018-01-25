package be.vdab.taak;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Arrangement arrangement = new Bungalow();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Barbecue (j/n): ");
            if("j".equalsIgnoreCase(scanner.next())) {
                arrangement = new MetBarbecue(arrangement);
            }
            System.out.print("Fietsen (j/n): ");
            if("j".equalsIgnoreCase(scanner.next())) {
                arrangement = new MetFietsen(arrangement);
            }
            System.out.println(arrangement.getTaken());
        }
    }
    
}
