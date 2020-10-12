package MetodoPagamento;

public class PagamentoBoleto extends Pagamento {
	private double numeroBoleto;

	public PagamentoBoleto(String nome, String CPF, String bancoRecebimento, String bancoPagamento, String data,
			double valor, double numeroBoleto) {
		super(nome, CPF, bancoRecebimento, bancoPagamento, data, valor);
		this.numeroBoleto = numeroBoleto;
	}

	public double getNumeroBoleto() {
		return numeroBoleto;
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
		System.out.println("Numero Boleto: " + numeroBoleto);
	}

}
