package Aplicacao;

import GerenciaArquivos.ConverteArquivoXML;

public class App {

	public static void main(String[] args) {
		ConverteArquivoXML xml = new ConverteArquivoXML();
		xml.LerArquivo();

		// ConverteArquivoJson json = new ConverteArquivoJson();
		// json.LerArquivo();
	}

}
