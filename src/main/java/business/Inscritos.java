package business;

public class Inscritos {
	
	private String nome;
	private String email;
	private String participacao;
	private String pagamento;
	
	public Inscritos(String nome, String email, String participacao, String pagamento) {
		super();
		this.nome = nome;
		this.email = email;
		this.participacao = participacao;
		this.pagamento = pagamento;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getParticipacao() {
		return participacao;
	}

	public String getPagamento() {
		return pagamento;
	}
	
	
	
	

}
