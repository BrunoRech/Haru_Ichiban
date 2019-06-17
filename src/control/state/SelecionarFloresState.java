package control.state;

import control.Observador;

public class SelecionarFloresState extends GameStateInterface{

	public SelecionarFloresState(Observador view) {
		super(view);
		loadState();
	}

	public SelecionarFloresState(Observador view, GameStateInterface state) {
		super(view, state);
		loadState();
	}

	@Override
	public void nextState() {
		this.view.setState(new PosicionarFlorState(this.view,this));
	}

	@Override
	public void loadState() {
		System.out.println("Selecionar Flores state");
		this.view.notificarSelecaoFlorDisponivel(true);
		this.view.notificarVentoDisponivel(false);
		this.view.notificarMovimentacaoHabilitada(false);
		this.view.notificarSapoHabilitado(false);
		this.view.notificarVirarFlorHabilitada(false);
		this.view.notificarAdicionarFlorHabilitado(false);
		this.view.notificarDesfazerHabilitado(true);
		this.view.notificarSelecaoTabuleiroAprovada(false);
		
	}

	@Override
	public String toString() {
		return "SelecionarFlores";
	}

}