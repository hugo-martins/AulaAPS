package br.ufpb.dcx.testeabstractfactory;

import br.ufpb.dcx.gui.FabricaAbstrata;
import br.ufpb.dcx.gui.FabricaAndroid;
import br.ufpb.dcx.gui.FabricaWindows;
import br.ufpb.dcx.gui.Janela;
import br.ufpb.dcx.gui.Menu;

public class TelaProjeto {
	
	FabricaAbstrata fabricaWindows = new FabricaWindows();
	FabricaAbstrata fabricaAndroid = new FabricaAndroid();
	

	public FabricaAbstrata getFabricaWindows() {
		return fabricaWindows;
	}

	public void setFabricaWindows(FabricaAbstrata fabricaWindows) {
		this.fabricaWindows = fabricaWindows;
	}

	public FabricaAbstrata getFabricaAndroid() {
		return fabricaAndroid;
	}

	public void setFabricaAndroid(FabricaAbstrata fabricaAndroid) {
		this.fabricaAndroid = fabricaAndroid;
	}

	public String desenhar() {
		String tela = fabricaWindows.criarJanela() + "{"
				+ fabricaWindows.criarMenu() + fabricaWindows.criarBotao();
		
		return tela;
	}

	public void montar() {
		this.fabricaWindows.criarJanela();
		this.fabricaWindows.criarMenu();
		this.fabricaWindows.criarBotao();
		
		
	}

}
