package br.ufpb.dcx.gui;

public class FabricaAndroid implements FabricaAbstrata{

	@Override
	public Janela criarJanela() {
		Janela janela = new JanelaAndroid();
		return janela;
	}

	@Override
	public Menu criarMenu() {
		Menu menu = new MenuAndroid();
		return menu;
	}

	@Override
	public Botao criarBotao() {
		Botao botao = new BotaoAndroid();
		return botao;
	}

}
