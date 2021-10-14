import java.util.Scanner;
public class ejer2{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        System.out.println("la suma es "+(num1+num2));
        System.out.println("la resta es "+(num1-num2));
        System.out.println("la multiplicacion es "+(num1*num2));
        System.out.println("la division es "+(num1/num2));
        System.out.println("El modulo es "+(num1&num2));




        
    }
}