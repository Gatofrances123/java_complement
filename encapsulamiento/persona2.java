package encapsulamiento;

public class persona2 {

    private String nombre;  //=> nombre primario que quiero modificar
    private int edad; 
    private boolean eliminado; 

    //Parametros de modificacion  
   public persona2(String nombre , int edad , boolean eliminado){
    System.out.println(" recuerda llamar los metodos con sout");
       this.nombre = nombre;
       this.edad=edad; 
       this.eliminado=eliminado; 

    }
    //_-----------------------------------------------
    //Ahora antes de visualizar las variables privadas vamos a llmarlos 
    //como cuando queremos visualizar los objetos
    //le decimos traeme el dato que lo quiero modificar
//GET
    public String getnombre(){
        return this.nombre;  //<-devuelme o traeme  que esta guardando el dato principal
    }
//SET
    //modificar 
    //elijo el parametro que quiero modificar 
    public void setnombre(String nombre){
        this.nombre= nombre;

    }
//GET
    public int getedad(){
        return this.edad; 
         
    }
//SET
    //que parametro quiero modificar expesificamente
     public void setedad(int edad){
       this.edad=edad; //<- guardamelo o devuelvelo a edad = edad 
     }

//GET
     public boolean geteliminado(){
        return this.eliminado; 
     }
//SET  
    public void setelimnado(boolean eliminado){
        this.eliminado = eliminado; 
    }




    
}
