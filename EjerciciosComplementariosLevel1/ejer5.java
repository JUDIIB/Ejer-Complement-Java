import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        int m, n;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce dos números enteros (m*n). ");
        System.out.print("Introduce m: ");
        m = num.nextInt();
        System.out.println("Ingresa el valor de n: ");
        n = num.nextInt();
        int multi = multi (m, n);
        System.out.println("La multiplicación ("+m+" * "+n+")= "+ multi);
        num.close();
    


    }
    static int multi(int m, int n){
        int mul=0;
        if ((m!=0) && (n!=0)){
            for (int i = 0; i < n; i++){
                mul +=m;
        }
    }
    return mul;

}
}