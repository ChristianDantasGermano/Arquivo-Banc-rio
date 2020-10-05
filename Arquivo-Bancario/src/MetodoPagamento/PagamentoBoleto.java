package MetodoPagamento;

import java.util.Calendar;

public class PagamentoBoleto extends Pagamento {
	private double numeroBoleto;

	public PagamentoBoleto(String nome, String CPF, String bancoRecebimento, String bancoPagamento, Calendar data,double valor, double numeroBoleto) {
		this.nome = nome;
		this.CPF = CPF;
		this.bancoRecebimento = bancoRecebimento;
		this.bancoPagamento = bancoPagamento;
		this.data = data;
		this.valor = valor;
		this.numeroBoleto = numeroBoleto;
	}
	
	public double getNumeroBoleto() {
		return numeroBoleto;
	}	
	
}
 