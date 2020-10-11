package MetodoPagamento;

public class PagamentoGenerico extends Pagamento {
	private double numeroBoleto;
	private double numeroCartao;
	private String nomeTitular;
	private int parcelas;

	public PagamentoGenerico(String nome, String cPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor, double numeroBoleto, double numeroCartao, String nomeTitular, int parcelas) {
		super(nome, cPF, bancoRecebimento, bancoPagamento, data, valor);
		this.numeroBoleto = numeroBoleto;
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.parcelas = parcelas;
	}

	public double getNumeroBoleto() {
		return numeroBoleto;
	}

	public double getNumeroCartao() {
		return numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void Imprime() {
		System.out.println(nome);
		System.out.println(CPF);
		System.out.println(bancoPagamento);
		System.out.println(bancoRecebimento);
		System.out.println(data);
		System.out.println(valor);
		System.out.println(numeroBoleto);
		System.out.println(numeroCartao);
		System.out.println(nomeTitular);
		System.out.println(parcelas);
	}
}
