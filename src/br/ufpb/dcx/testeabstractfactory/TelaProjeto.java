package br.ufpb.dcx.testeabstractfactory;

import br.ufpb.dcx.gui.Botao;
import br.ufpb.dcx.gui.FabricaAbstrata;
import br.ufpb.dcx.gui.FabricaAndroid;
import br.ufpb.dcx.gui.FabricaWindows;
import br.ufpb.dcx.gui.Janela;
import br.ufpb.dcx.gui.Menu;

public class TelaProjeto {
	
	FabricaAbstrata fabrica;
	
	public Janela janela;
	public Menu menu;
	public Botao botao;
	

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
		
	}

	public void montar() {
		janela = this.fabrica.criarJanela();
		menu = this.fabrica.criarMenu();
		botao= this.fabrica.criarBotao();
		
		
	}
	public String desenhar() {
		
		
		return janela.desenhar() + "{"
				+ menu.desenhar()+ "," + botao.desenhar() + "}";
	}

	

	


}
