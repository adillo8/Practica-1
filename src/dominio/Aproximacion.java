package dominio;
//se importa la clase Random para generar numeros aleatorios
import java.util.Random;

public class Aproximacion {
    //apuntes en pdf

    public static double aproximarPi(){
    //crear variables x , y , total de dardos y dardos dentro del circulo
    double x, y;
    int totalDardos=0;
    int dardosDentroCirculo=0;

    //crear objeto de la clase Random
    Random r = new Random();

    for(int i=0;i<10000;i++){
        totalDardos++;
        //numeros aleatorios para x e y que esten dentro del circulo
        x=r.nextDouble()*1;
        y=r.nextDouble()*1;

        //calcular si el dardo esta dentro del circulo
        if (Math.pow(x,2)+Math.pow(y,2)<=1){
            dardosDentroCirculo++;
        }
    }

    System.out.println("Dardos dentro del circulo: "+dardosDentroCirculo);
    //calcular el valor aproximado de pi
    return 4*((double)dardosDentroCirculo/(double)totalDardos);
    }

    

    
    
}
