package iphone;

public class Navegador implements FuncoesNavegador {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url + ".");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}
}
