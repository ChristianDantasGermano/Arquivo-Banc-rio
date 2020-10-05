package MetodoPagamento;

import java.util.Calendar;

public class PagamentoCartao extends Pagamento{
	private double numeroCartao;
	private String nomeTitular;

	public PagamentoCartao(String nome, String CPF, String bancoRecebimento
		, String bancoPagamento, Calendar data,double valor, double numeroCartao
		, String nomeTitular) {
		this.nome = nome;
		this.CPF = CPF;
		this.bancoRecebimento = bancoRecebimento;
		this.bancoPagamento = bancoPagamento;
		this.data = data;
		this.valor = valor;
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
	}

	public double getNumeroCartao() {
		return numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
		
}
