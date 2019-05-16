package control.command;

import control.InterfaceController;

//classe do comando de virar uma vitória régia 
public class VirarFlorCommand implements Command{
public InterfaceController controlador;
	
	public VirarFlorCommand(InterfaceController controle) {
		this.controlador = controle;
	}
	@Override
	public void execute() {
		controlador.virarFlor("execute");
		
	}

	@Override
	public void undo() {
		controlador.desvirarFlor("undo");
		
	}

	@Override
	public void redo() {
		controlador.virarFlor("redo");
		
	}

}