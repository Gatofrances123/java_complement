package defaul_package;
import java.util.Scanner;
import clases.persona;
import encapsulamiento.persona2;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola juan");
      encapsulamiento();
    }
    public static void variables(){
        String nombre ; 
        nombre="juan"; 

        int edad ; 
        edad = 26; 
      System.out.println(nombre + edad);
    }

    public static void introducir_datos(){
        Scanner Nombre =new Scanner(System.in); 
        System.out.println("Escribe tu nombre");
     String nombre = Nombre.nextLine();
     System.out.println("tu nombre es " + nombre);

    }

    public static void loop(){
        //tipo de dato int 
        //valor inical i=0
        //valor final i<=10
        //Que quiero que haga i++,i--,i*,i/
        for(int i =0 ; i<=10 ; i++){
            System.out.println(i);
        }
    }
     public static void a_array(){
         //tipo de dato []
         //cantidad
         String nombres[];
         nombres = new String[3];
         
         nombres[0]="juan"; 
         nombres[1]="pablo";
         nombres[2]="Quintero";
         System.out.println(nombres[1]);
     }

     public static void funciones(){
        System.out.println("todos hemos sido funciones");
     }

     public static void clases_objetos(){
         persona persona1 = new persona("felipe");
         
         persona persona2 = new persona(); 
    
    }
     public static void encapsulamiento(){
        persona2 perosna1 = new persona2("juan", 25, false);
      System.out.println(perosna1.getnombre());

      perosna1.setnombre("Juan pablo Quintero");
      System.out.println(perosna1.getnombre());
    
      System.out.println(perosna1.getedad());
      perosna1.setedad(27);
      System.out.println(perosna1.getedad());
    
    }

     

}










