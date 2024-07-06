package iphone;

import java.util.Scanner;

public class Iphone {

	public static void main(String[] args) {
		Musica m = new Musica();
		m.tocar();
		m.selecionarMusica("Black or White");
		
		Navegador n = new Navegador();
		n.exibirPagina("www.facebook.com");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de telefone:");
		String tel = sc.nextLine();
		Telefone t = new Telefone();
		t.ligar(tel);
		t.iniciarCorreioVoz();
		sc.close();
	}
}
