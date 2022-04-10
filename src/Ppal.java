import Misclases.Arreglo;

import java.util.Scanner;


public class Ppal {
    public static void main(String[] args) {
        Arreglo ob = new Arreglo();
        Scanner sc = new Scanner(System.in);
        int opcion, opcion2, opcion3;

        do{
            System.out.println("\n Digite la opcion \n 1. Cargar. \n 2. Imprimir \n 3. Invertir \n 4. Ordenar \n 5. Salir ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: ob.cargar(); break;
                case 2: ob.impri(); break;
                case 3: ob.invertir(); break;
                case 4: {
                    System.out.println("Digite: \n 1.Burbuja. \n 2. Seleccion");
                    opcion2 = sc.nextInt();
                    switch(opcion2){
                        case 1:{ System.out.println("1. Asecendente \n 2. Descendente");
                        opcion3 = sc.nextInt();
                        switch(opcion3){
                            case 1: ob.burbuja();
                            case 2: ob.burbuja(); ob.invertir();
                        }
                        }break;
                        case 2:{ System.out.println("1. Asecendente \n 2. Descendente");
                        opcion3 = sc.nextInt();
                        switch(opcion3){
                            case 1: ob.secuencial();
                            case 2: ob.secuencial();ob.invertir();
                        }
                        }
                    }
                    
                }break;
        }
        }
        while(opcion !=5);
    }
    
}
