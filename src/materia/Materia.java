package materia;
import java.util.Scanner;

public class Materia {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        System.out.print("Ingrese el Nombre del Estudiante: ");
        alumno.setnombre(Teclado.next());
        System.out.print("Ingrese el Nombre de la Asignatura: ");
        alumno.setasignatura(Teclado.next());
        System.out.print("Ingrese el Codigo del Estudiante: ");
        alumno.setcod(Teclado.nextInt());
        System.out.print("Ingrese el Número de Notas: ");
        alumno.setnNotas(Teclado.nextInt());
        double [] nota = new double [alumno.getnNotas()];
        int [] porcentaje = new int [alumno.getnNotas()];
        
        for (int i = 0; i < alumno.getnNotas(); i++){
            System.out.print("Ingrese la Nota " + (i+1) + ": ");
            nota[i]= Teclado.nextDouble();
            alumno.setnota(nota);
            System.out.print("Ingrese el porcentaje de la Nota " + (i+1) + ": ");
            porcentaje[i]=Teclado.nextInt();
            alumno.setporNotas(porcentaje);
        }
        alumno.ImprimirDaots();
        alumno.resultadoMateria();
    }
}