package test;
public class Auto {
    String modelo;
    int precio;
    Asiento asiento_x = new Asiento();
    Asiento[] asientos = new Asiento[10];
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.registro =1;
        auto1.marca = "Modelo";
        Motor motor1 = new Motor();
        motor1.registro = 1;
        auto1.motor = motor1;
        System.out.print("sadas");


        auto1.verificarIntegridad();
        auto1.cantidadAsientos();

    }

    public int cantidadAsientos(){
        int asientos_=0 ;
        for(int i=0; i<= asientos.length-1;i++){
            if (asientos[i]!=null){
                asientos_++;

            }

        }
        return asientos_;

    }
    public String verificarIntegridad(){
        for(int i=0; i<= asientos.length-1;i++){
            if(asientos[i]!=null && asientos[i].registro != this.registro){
                return "Las piezas no son originales";
            }

        }

        if (motor.registro!=registro){
            return "Las piezas no son originales";
        }

        return "Auto original";
    }




}
