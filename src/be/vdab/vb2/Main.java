package be.vdab.vb2;
/*
Het 'decorator' pattern in de Java API, bij bestandsverwerking.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
public class Main {
    public static void main(String[] args) {
        /*
        Een LineNumberReader decoreert een BufferedReader.
        De LineNumberReader voegt daarbij de functionaliteit toe bij te houden de hoeveelste lijn gelezen wordt.
        */
        try (LineNumberReader reader = new LineNumberReader(
                /*
                Een BufferedReader decoreert op zijn beurt een FileReader.
                De BufferedReader voegt daarbij de functionaliteit toe de leessnelheid te verhogen door in grote blokken te lezen.
                */
                new BufferedReader(
                        new FileReader("/data/liedje.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.print(reader.getLineNumber());
                System.out.print(':');
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
