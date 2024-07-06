package iphone;

public class Telefone implements FuncoesTelefone {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + ".");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz ativado.");
	}
}
