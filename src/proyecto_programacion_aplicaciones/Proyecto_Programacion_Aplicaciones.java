package proyecto_programacion_aplicaciones;

import java.util.Random;

public class Proyecto_Programacion_Aplicaciones {

    public static void main(String[] args) {
        String lenguaje[] = {"Kensel","Vane","Bicho","Hector"};
        //XD
        Random elec = new Random();
        System.out.println(lenguaje[elec.nextInt(lenguaje.length)]);
    }
    
}
