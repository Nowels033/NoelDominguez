import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		System.out.println("HOLA MI CHAMBA");
		
		boolean opcion = true;
		do {
			System.out.println("pulsa 1 para matar un negro");
			Scanner leer = new Scanner (System.in);
			int negro = leer.nextInt();
			System.out.println("2 para hundir una patera");
			int patera = leer.nextInt();
			leer.close();
		} while (opcion == false);
		
		System.out.println("MATEMOS TODOS LOS NEGROS");
		

	}

}
