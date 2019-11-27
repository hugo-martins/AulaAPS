package br.ufpb.dcx.gui;

public class FabricaWindows implements FabricaAbstrata {

	@Override
	public Janela criarJanela() {
		Janela janela = new JanelaWindows();
		return janela;
	}

	@Override
	public Menu criarMenu() {
		Menu menu = new MenuWindows();
		return menu;
	}

	@Override
	public Botao criarBotao() {
		Botao botao = new BotaoWindows();
		return botao;
	}
	
	
}
