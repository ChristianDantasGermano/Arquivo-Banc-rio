package MetodoPagamento;

public class PagamentoCartao extends Pagamento {
	private double numeroCartao;
	private String nomeTitular;
	private int parcelas;

	public PagamentoCartao(String nome, String CPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor, double numeroCartao, String nomeTitular, int parcelas) {
		super(nome, CPF, bancoRecebimento, bancoPagamento, data, valor);
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

	@Override
	public void Imprimir() {
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Banco Recebimento:" + bancoRecebimento);
		System.out.println("Banco Pagamento: " + bancoPagamento);
		System.out.println("Data: " + data);
		System.out.println("Valor: " + valor);
		System.out.println("Nome Titular: " + nomeTitular);
		System.out.println("Numero Cartão: " + numeroCartao);
		System.out.println("Parcelas: " + parcelas);
	}

}
