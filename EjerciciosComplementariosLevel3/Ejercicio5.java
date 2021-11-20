import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumno("Lisa", "Simpson", LocalDate.of(1956, 5, 12)),
                new Alumno("Bart", "Simpson", LocalDate.of(1990, 2, 10)),
                new Alumno("Maggie", "Simpson", LocalDate.of(2001, 3, 30)),
                new Alumno("Marge", "Bouvier", LocalDate.of(1954, 2, 5)),
                new Alumno("Marvin", "Monroe", LocalDate.of(1945, 7, 21)),
                new Alumno("Abbe", "Simpson", LocalDate.of(1911, 11, 11)));
Map<String, Integer>edades=new HashMap<>();
for (Alumno alumno: alumnos) {
    edades.put(
        alumno.getApellido() + " " + alumno.getNombre(),
        alumno.getNacimiento().until(LocalDate.now()).getYears());
}
System.out.println(edades);
}
}
