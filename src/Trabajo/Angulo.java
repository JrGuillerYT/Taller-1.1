package Trabajo;
import java.util.Scanner;
public class Angulo {

    // PONER LAS FORMULAS PARA RESOLVER EL EJERCICIO
    public static double calcularAlcance (double VO,double Theta,double g){
        double ThetaRad = Math.toRadians(Theta);
        double alcance = (Math.pow(VO,2)* Math.sin(2 * ThetaRad)) / g;
        return alcance;
    } 
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
       //VALORES CONOCIDOS
        double V0 = 20.0;
        double Theta = 30.0;
      
        //VELOCIDAD DE LA PELOTA
        System.out.println("Velocidad Inicial: " + V0 + " m/s");
        
        //VALORES GRAVEDAD EN CADA PLANETA
       double[] gravedades = {9.81,1.62,3.71,24.79,3.7};
        String[] planetas = {"tierra","luna","marte","jupiter","mercurio"};

        //SOLICITAR AL USUARIO QUE ELIGA UN PLANETA 
        System.out.println("selecione un planeta para el alcance de la pelota:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + ". " + planetas [i]);   
        }
        //OPERACIONES
        int opcion = input.nextInt();
        if (opcion < 1 || opcion > planetas.length){
            System.out.println
        ("Opción no válida. Elige un número entre 1 y " + planetas.length + ".");
            
     } else {
        //CALCULAR EL ALCANCE EN EL PLANETA SELECIONADO
        double gSeleccionada = gravedades[opcion - 1];
        double alcance = calcularAlcance(V0, Theta, gSeleccionada);
            
        System.out.println
    ("El alcance del balón en " + planetas[opcion - 1] + " es: " + alcance + " m/s");
        }
        
        input.close();
    }
}
