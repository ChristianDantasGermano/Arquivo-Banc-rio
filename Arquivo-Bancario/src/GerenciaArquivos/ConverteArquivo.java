package GerenciaArquivos;

import java.util.ArrayList;

import MetodoPagamento.PagamentoGenerico;

public abstract class ConverteArquivo {

	protected ArrayList<PagamentoGenerico> LerArquivo() {
		return null;
	}

	protected void OrganizaPagamento(ArrayList<PagamentoGenerico> pagamentos) {
		for (PagamentoGenerico i : pagamentos) {
			if (i.getNumeroCartao() > 0) {
			} else {

			}
		}
	}

}
