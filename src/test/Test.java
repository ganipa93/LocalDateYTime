package test;
import java.time.LocalDate;
import java.time.LocalTime;
public class Test {
public static void main(String[] args) {
//Creamos una fecha
LocalDate fecha=LocalDate.of(2019,3,19);
// Creamos otra fecha, restamos 5 dias a la anterior
LocalDate fecha1 = fecha.minusDays(5);
// Creamos otra fecha, sumamos 4 meses a la anterior
LocalDate fecha2 = fecha1.plusMonths(4);
System.out.println("Primer Fecha: " +
fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear());
System.out.println("Segunda Fecha: " +
fecha1.getDayOfMonth()+"/"+fecha1.getMonthValue()+"/"+fecha1.getYear());
System.out.println("Tercer Fecha: " +
fecha2.getDayOfMonth()+"/"+fecha2.getMonthValue()+"/"+fecha2.getYear());
System.out.println("La primer fecha es anterior a la segunda?: "+
fecha.isBefore(fecha1));
System.out.println("Y la segunda a la tercera?: "+ fecha1.isBefore(fecha2));
System.out.println("La primer fecha es posterior a la segunda?: "+
fecha.isAfter(fecha1));
System.out.println("Y la segunda a la tercera?: "+ fecha1.isAfter(fecha2));
LocalTime ahora = LocalTime.now();
System.out.println(ahora.getHour()+":"+ahora.getMinute());
// Probar las funciones para sumar, restar y comparar horas
}
}
