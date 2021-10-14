import java.util.Scanner;

public class ejer9 {
    public static void main(String[]arg){
        Scanner analisisTexto = new Scanner(System.in);
        System.out.println("Ingrese una palabra : ");
        String texto = analisisTexto.nextLine();
        System.out.println("Indicar que caracter desea mostrar que se repita: ");
        String encontrarText = analisisTexto.nextLine();
        

        System.out.println("el caracter se repite "+(texto.split(encontrarText, -1).length-1)+" veces");
    }

}