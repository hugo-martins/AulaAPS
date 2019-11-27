package br.ufpb.dcx.testeabstractfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.ufpb.dcx.gui.FabricaWindows;

class TelaProjetoTest {

	@Test
	void criarTela() {
		TelaProjeto tela = new TelaProjeto();	
	}
	
	@Test
	void definirFabrica() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabricaWindows(new FabricaWindows());
	}
	
	@Test
	void desenharTela() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabricaWindows(new FabricaWindows());
		tela.montar();
		tela.desenhar();
		assertEquals("JanelaWindows { MenuWindows, BotaoWindows }" , tela.desenhar());
	}
	


}
