package ejercicio;
import java.util.Scanner;
public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		int matematica, ingles, programacion, redaccion, filosofia;
		double promedio, total;
		
		System.out.println("Ingrese la nota en la clase de Matematicas");
		matematica = tc.nextInt();
				
		System.out.println("Ingrese la nota en la clase de Ingles");
		ingles = tc.nextInt();		
		
		System.out.println("Ingrese la nota en la clase de Programacion");
		programacion = tc.nextInt();
		
		System.out.println("Ingrese la nota en la clase de Redaccion");
		redaccion = tc.nextInt();
		
		System.out.println("Ingrese la nota en la clase de Filosofia");
		filosofia = tc.nextInt();
		
		total = matematica+ingles+programacion+redaccion+filosofia;
		promedio = total/5;
		
		System.out.println("Nota en Matematica: "+matematica);
		System.out.println("Nota en Ingles: "+ingles);
		System.out.println("Nota en Programacion: "+programacion);
		System.out.println("Nota en Redaccion: "+redaccion);
		System.out.println("Nota en Filosofia: "+filosofia);
		
		System.out.println("Promedio de notas: "+promedio);
	}

}
