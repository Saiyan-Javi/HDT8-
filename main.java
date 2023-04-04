package HDT8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        
        Factory factory = new Factory();

        try{
            BufferedReader reader = new BufferedReader(new FileReader("procesos.txt"));
            String linea = reader.readLine();
            while(linea != null){
                Namer namer = factory.getNamer(linea);
                System.out.println(namer.getNombrep());
                System.out.println(namer.getNombreu());
                System.out.println(namer.getVnice());
                linea = reader.readLine();
            }
    } catch (IOException e) {
        System.out.println("No se ha encontrado la direccion del archivo.");
        }
    }
}

