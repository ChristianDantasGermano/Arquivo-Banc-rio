package GerenciaArquivos;

import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import MetodoPagamento.PagamentoGenerico;

public class ConverteArquivoJson extends ConverteArquivo {

	@Override
	public ArrayList<PagamentoGenerico> LerArquivo() {
		Gson gson = new Gson();
		ArrayList<PagamentoGenerico> json = null;
		try {
			JsonReader reader = new JsonReader(new FileReader("remessa.json"));
			json = gson.fromJson(reader, PagamentoGenerico[].class);

		} catch (Exception e) {
			System.out.println(e);
		}
		return json;
	}
}