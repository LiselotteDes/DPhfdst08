package be.vdab.koffie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Decoratie HARD gecodeerd in de Main
//        Koffie eenvoudig = new EenvoudigeKoffie();
//        System.out.println(eenvoudig.getKost());
//        System.out.println(eenvoudig.getBereidingswijze());
//        System.out.println();
//        Koffie metMelk = new MetMelk(new EenvoudigeKoffie());
//        System.out.println(metMelk.getKost());
//        System.out.println(metMelk.getBereidingswijze());
//        System.out.println();
//        Koffie metChocolade = new MetChocolade(new EenvoudigeKoffie());
//        System.out.println(metChocolade.getKost());
//        System.out.println(metChocolade.getBereidingswijze());
//        System.out.println();
//        Koffie metMelkEnChocolade = new MetChocolade(new MetMelk(new EenvoudigeKoffie()));
//        System.out.println(metMelkEnChocolade.getKost());
//        System.out.println(metMelkEnChocolade.getBereidingswijze());

        // DYNAMISCHE decoratie
        Koffie koffie = new EenvoudigeKoffie();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Melk (j/n): ");
            if("j".equalsIgnoreCase(scanner.next())) {
                koffie = new MetMelk(koffie);
            }
            System.out.print("Chocolade (j/n): ");
            if("j".equalsIgnoreCase(scanner.next())){
                koffie = new MetChocolade(koffie);
            }
            System.out.println(koffie.getKost());
            System.out.println(koffie.getBereidingswijze());
        }
    }
    
}
