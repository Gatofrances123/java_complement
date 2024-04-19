package clases;
public class persona {
   public String nombre ;
    public int edad; 
//CONSTRUCTOR
public persona(){
    System.out.println(" construyebdo el objeto");
}

public persona(String nombre){
    System.out.println("hola "+ nombre + "desde el constructor");
}



    public void mostrar_Datos(){
        System.out.println(nombre + edad);
    }
}
