package GerenciaArquivos;

import java.io.FileReader;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import MetodoPagamento.PagamentoGenerico;

public class ConverteArquivoXML extends ConverteArquivo {

	@SuppressWarnings("unchecked")
	@Override
	public void LerArquivo() {
		try {
			FileReader reader = new FileReader("remessa.xml");
			XStream xstream = new XStream(new DomDriver());
			xstream.alias("br.com.pageseguro.RemessaCartaoCredito", PagamentoGenerico.class);
			xstream.alias("br.com.pageseguro.RemessaCartaoDebito", PagamentoGenerico.class);
			xstream.alias("br.com.pageseguro.RemessaBoleto", PagamentoGenerico.class);
			ArrayList<PagamentoGenerico> pagamento = (ArrayList<PagamentoGenerico>) xstream.fromXML(reader);
			OrganizaPagamento(pagamento);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
