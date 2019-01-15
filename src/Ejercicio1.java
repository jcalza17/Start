/*
 * Leer un número y mostrar por la salida estándar si dicho número es o no es par..
 */

import java.io.*;

public class Ejercicio1 {
    
    public static void main(String[] args) throws IOException   {
        
        BufferedReader in = new BufferedReader ( new InputStreamReader(System.in) );
        System.out.println("Introduce un numero: ");
                
        try {
            int num = Integer.valueOf( in.readLine().trim() ).intValue();
        
            if (num == 0)
                throw new Ejercicio1Exception("Error, numero nulo detectado");
        
            if ((num % 2) == 0)
                System.out.println("El numero introducido es PAR");
            else
                System.out.println("El numero introducido es IMPAR");
        }
        catch(Ejercicio1Exception e) {
            System.out.println(e.getMessage());
        }
    
        catch(NumberFormatException e1) {
            System.out.println(" Error.."+ e1.getMessage());
        }
    
        catch(Exception e2) {
            System.out.println(e2.getMessage());
        }
    }
}
    


