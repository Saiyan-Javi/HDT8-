package HDT8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainC {
    public static void main(String[] args) {
        
        Factory factory = new Factory();
        HeapUsingIterativeBinaryTree<Integer, String> myHeap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());

        try{
            BufferedReader reader = new BufferedReader(new FileReader("procesos.txt"));
            String linea = reader.readLine();
            while(linea != null){
                Namer namer = factory.getNamer(linea);
                String nombreproceso = namer.getNombrep();
                String nombreusuario = namer.getNombreu();
                int valornice = namer.getVnice();
                myHeap.Insert(valornice, nombreproceso);
                linea = reader.readLine();
            }
    } catch (IOException e) {
        System.out.println("No se ha encontrado la direccion del archivo.");
        }

        System.out.println(myHeap.remove());
        System.out.println(myHeap.remove());
    }
}

