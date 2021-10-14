import java.util.ArrayList;
import java.util.List;

public class ejer5{
    public static void main(String args[]){
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorDeHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        valorDeHora.add(350);
        valorDeHora.add(345);
        valorDeHora.add(550);
        valorDeHora.add(600);
        valorDeHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            //se toma las horas trabajadas y se multiplica por el valor de la hora
            int hs = horasTrabajadas.get(i) * valorDeHora.get(i);
            totales.add(hs);
        }
        int totalesHs = 0;
        for (Integer hs : totales) {
            totalesHs += hs;

        }
        System.out.println(totales);
        System.out.println("Total Final: $" + totalesHs);
    }
}