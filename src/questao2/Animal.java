package questao2;

public class Animal {
	private String nome;
	private String raca;

	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public void caminha() {
		System.out.println("Caminhando...");
	}
}
