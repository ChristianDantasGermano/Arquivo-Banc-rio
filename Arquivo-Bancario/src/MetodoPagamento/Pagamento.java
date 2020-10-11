package MetodoPagamento;

public abstract class Pagamento {
	protected String nome;
	protected String CPF;
	protected String bancoRecebimento;
	protected String bancoPagamento;
	protected String data;
	protected double valor;

	public Pagamento(String nome, String cPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor) {
		this.nome = nome;
		CPF = cPF;
		this.bancoRecebimento = bancoRecebimento;
		this.bancoPagamento = bancoPagamento;
		this.data = data;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getBancoRecebimento() {
		return bancoRecebimento;
	}

	public String getBancoPagamento() {
		return bancoPagamento;
	}

	public String getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

}
