package MetodoPagamento;

public class PagamentoBoleto extends Pagamento {
	private double numeroBoleto;

	public PagamentoBoleto(String nome, String cPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor, double numeroBoleto) {
		super(nome, cPF, bancoRecebimento, bancoPagamento, data, valor);
		this.numeroBoleto = numeroBoleto;
	}

	public double getNumeroBoleto() {
		return numeroBoleto;
	}

}
