import java.util.Scanner;

import questao2.Animal;
import questao2.Cachorro;
import questao2.Gato;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Animal animal = new Animal("Ruan", "Vira-lata");
		animal.caminha();
		Cachorro cach = new Cachorro ("Ruan", "Vira-lata");
		cach.late();
		Gato gato = new Gato("Ruan", "Vira-lata");
		gato.mia();
		scanner.close();
	}
}
