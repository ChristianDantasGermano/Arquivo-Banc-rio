package GerenciaArquivos;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import MetodoPagamento.PagamentoGenerico;

public class ConverteArquivoJson extends ConverteArquivo {

	@Override
	public void LerArquivo() {
		Gson gson = new Gson();
		try {
			JsonReader reader = new JsonReader(new FileReader("remessa.json"));
			PagamentoGenerico[] pagamento = gson.fromJson(reader, PagamentoGenerico[].class);
			OrganizaPagamento(pagamento);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}