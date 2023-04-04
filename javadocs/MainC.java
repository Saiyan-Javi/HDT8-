package HDT8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        
        Factory factory = new Factory();
        HeapUsingIterativeBinaryTree<Integer, String> myHeap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());
        int i = 0;
        ArrayList<String> procesos = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("procesos.txt"));
            String linea = reader.readLine();
            while(linea != null){
                Namer namer = factory.getNamer(linea);
                String nombreproceso = namer.getNombrep();
                String nombreusuario = namer.getNombreu();
                int valornice = namer.getVnice();
                int pr = valornice+120;
                myHeap.Insert(valornice, nombreproceso+","+nombreusuario+","+valornice+",PR = "+pr);
                i++;
                linea = reader.readLine();
            }
    } catch (IOException e) {
        System.out.println("No se ha encontrado la direccion del archivo.");
        }

        String menu = "\nBienvenido al ordenador de procesos, elija una de las opciones:\n1. HeapIterative\n2. JavaCollecionFramework PriorityQueue\n3. Cerrar el programa";
        int opcion = 0;
        while(opcion < 1 || opcion > 3){
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            while(opcion >=1 && opcion < 3){
                switch(opcion){
                    case 1:{
                        while(i != 0){
                            procesos.add(0, myHeap.remove());
                            i--;
                        }
                        
                        System.out.println("\nOrden en que los procesos seran retirados:\n");
                        
                        for(String proceso : procesos){
                            System.out.println(proceso);
                        }
                        opcion = 3;
                        break;
                    }
                    case 2:{
                        
                    }
                }
            }
        }
    }
}

