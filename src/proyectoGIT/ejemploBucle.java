package proyectoGIT;
import java.util.*;
public class ejemploBucle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aleatorio=(int)(Math.random()*100);

        int numero;
        int intentos = 0;

        do{

            intentos++;

            System.out.println("Introduce un número por favor: ");

            numero = sc.nextInt();

            if(aleatorio<numero) {
                System.out.println("Más bajo");
            }
            else if(aleatorio>numero) {
                System.out.println("Más alto");

            }

        }while(numero!=aleatorio);
        System.out.println("Correcto. Lo has conseguido en" + intentos + "intentos");
    }
}
//Si saliera de ranndom 0, enn el while ni se ejecutaria