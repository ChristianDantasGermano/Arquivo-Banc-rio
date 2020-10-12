package Validacao;

import br.com.caelum.stella.validation.CPFValidator;

public class ValidarCPF implements Validar {

	@Override
	public boolean Valida(String valor) {
		CPFValidator cpfValidator = new CPFValidator();
		try {
			cpfValidator.assertValid(valor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
