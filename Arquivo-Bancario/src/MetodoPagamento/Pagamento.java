package MetodoPagamento;

import java.util.Calendar;

public abstract class Pagamento {
	protected String nome;
	protected String CPF;
	protected String bancoRecebimento;
	protected String bancoPagamento;
	protected Calendar data;
	protected double valor;
	
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

	public Calendar getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}


	
	
}
