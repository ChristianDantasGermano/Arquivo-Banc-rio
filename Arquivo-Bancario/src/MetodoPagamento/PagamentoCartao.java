package MetodoPagamento;

public class PagamentoCartao extends Pagamento {
	private double numeroCartao;
	private String nomeTitular;
	private int parcelas;

	public PagamentoCartao(String nome, String cPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor, double numeroCartao, String nomeTitular, int parcelas) {
		super(nome, cPF, bancoRecebimento, bancoPagamento, data, valor);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.parcelas = parcelas;
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

}
