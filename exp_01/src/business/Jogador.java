package business;

public class Jogador {
	
	private String nome;
	protected int totalpontos;
	
	public Jogador(String nome, int totalpontos) {
		super();
		this.nome = nome;
		totalpontos = 0;
	}

	public int getTotalpontos() {
		return totalpontos;
	}
	
	public void jogue(Dado umDado) {
		int valorObtido;
		do {
			valorObtido = umDado.Lance();
			totalpontos = totalpontos + valorObtido;
			System.out.println(valorObtido);
		}
	while (valorObtido == 1 || valorObtido == 6);
	
	}

	
	
	
	
	
	
	
}
