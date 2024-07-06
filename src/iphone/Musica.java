package iphone;

public class Musica implements FuncoesMusica {

	@Override
	public void tocar() {
		System.out.println("Tocando m�sica.");
	}

	@Override
	public void pausar() {
		System.out.println("M�sica pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("M�sica " + musica + " selecionada.");
	}
}
