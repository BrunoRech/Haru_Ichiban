package control;

import control.state.GameState;

//interface do observador com a declaracao de cada metodo de notificacao que sera usado
public interface Observador {

	void setState(GameState state);
	
	void nextState();
	
	void reloadState();
	
	void sapoState(boolean empate);
	
	void notificarGanhadorDoJogo(String vencedor);
	
	void notificarMudouTabuleiro();
	
	void notificarVentoDisponivel(boolean disponivel);
	
	void notificarIconesAmarelos();
	
	void notificarIconesVermelhos();
	
	void notificarGanhadorDaRodada(int pontosAmarelo, int pontosVermelho);
	
	void notificarJogadorPescou(int[] mao);
	
	void notificarSapoHabilitado(boolean disponivel);
	
	void notificarEmpateFlor(); //coachar
	
	void notificarSelecaoFlorDisponivel(boolean disponivel);
	
	void notificarVirarFlorHabilitada(boolean disponivel);
	
	void notificarMovimentacaoHabilitada(boolean disponivel);
	
	void notificarSelecaoTabuleiroAprovada(boolean disponivel);
	
	void notificarAdicionarFlorHabilitado(boolean disponivel);
	
}
