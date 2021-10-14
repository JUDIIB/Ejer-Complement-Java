import java.util.ArrayList;
import java.util.List;

public class ejer4 {

    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Lucas");
        alumnos.add("Matias");
        alumnos.add("Luciano");
        alumnos.add("sara");
        alumnos.add("Micaela");
        alumnos.add("Aldo");
        alumnos.add("Macarena");
        alumnos.add("Melanie");
        alumnos.add("Maroa Cielo");
        alumnos.add("Bruno");
        alumnos.add("Lara");
        alumnos.add("Jacinto");

        List<String> clase1 = alumnos.subList(0, 4);
        List<String> clase2 = alumnos.subList(4, 8);
        List<String> clase3 =alumnos.subList(8, 12);

        System.out.println(".............................");
        System.out.println("Clase 1");
        System.out.println(".............................");

        for (String cl1 : clase1) {

            System.out.println(cl1);

        }

        System.out.println(".............................");
        System.out.println("Clase 2");
        System.out.println(".............................");

        for (String cl2 : clase2) {

            System.out.println(cl2);

        }


        System.out.println(".............................");
        System.out.println("Clase 3");
        System.out.println(".............................");

        for (String cl3 : clase3) {

            System.out.println(cl3);
        }
    }
}
