import java.util.Scanner;
public class ejer6 {

    
    public static void main(String[] args){



        Scanner scan = new Scanner(System.in);
        
        int base, exponente, potencia;
        
        potencia = 1;
        
       System.out.println("Ingrese base: ");
        
        base = scan.nextInt();
        
        System.out.println("Ingrese exponente: ");
        
        exponente = scan.nextInt();
        
        //mientras el valor de cero sea menor que el exponente
        
        while(0<exponente){




        
        potencia = potencia*base;
        
        exponente--;
        
        }
        
        System.out.println("La potencia es: "+ potencia);
        
        scan.close();
        
    }
        
}
