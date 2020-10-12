package GerenciaArquivos;

import java.util.ArrayList;

import MetodoPagamento.PagamentoBoleto;
import MetodoPagamento.PagamentoCartao;
import MetodoPagamento.PagamentoGenerico;
import Validacao.ValidarCPF;

public abstract class ConverteArquivo {

	protected void LerArquivo() {
	};

	protected void OrganizaPagamento(PagamentoGenerico[] pagamentos) {
		ValidarCPF validaCpf = new ValidarCPF();
		for (PagamentoGenerico i : pagamentos) {
			if (validaCpf.Valida(i.getCPF())) {
				SeparaPagamento(i);
			}
		}
	}

	protected void OrganizaPagamento(ArrayList<PagamentoGenerico> pagamentos) {
		ValidarCPF validaCpf = new ValidarCPF();
		for (PagamentoGenerico i : pagamentos) {
			if (validaCpf.Valida(i.getCPF())) {
				SeparaPagamento(i);
			}
		}
	}

	private void SeparaPagamento(PagamentoGenerico i) {
		if (i.getNumeroCartao() > 0) {
			PagamentoCartao cartao = new PagamentoCartao(i.getNome(), i.getCPF(), i.getBancoRecebimento(),
					i.getBancoPagamento(), i.getData(), i.getValor(), i.getNumeroCartao(), i.getNomeTitular(),
					i.getParcelas());
			cartao.Imprimir();

		} else {
			PagamentoBoleto boleto = new PagamentoBoleto(i.getNome(), i.getCPF(), i.getBancoRecebimento(),
					i.getBancoPagamento(), i.getData(), i.getValor(), i.getNumeroBoleto());
			boleto.Imprimir();
		}
	}

}
