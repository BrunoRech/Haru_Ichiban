package control.command;

import control.InterfaceController;

//classe do comando de virar uma vitoria regia
public class VirarFlorCommand implements Command{
public InterfaceController controlador;
	
	public VirarFlorCommand(InterfaceController controle) {
		this.controlador = controle;
	}
	@Override
	public void execute() {
		controlador.virarFlor();
		
	}

}
