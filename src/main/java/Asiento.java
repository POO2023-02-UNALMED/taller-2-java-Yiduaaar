
package test;

public class Asiento {

    String color;
    int precio;
    int registro;

    static int cantidad;

    public Asiento(){
        cantidad++;
    }
    public void cambiarColor(String color){
        if(color.equals("verde") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco") || color.equals("rojo")){
            this.color=color;
            ;
        }

    }
}
