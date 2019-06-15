package model;

//objeto abstrato da peça flor
public abstract class Flor extends GameObject{

	public Flor(int numero,String imagem) {
		setImagem(imagem);
		this.numero = numero;
		
	}
	
	public Flor() {}
	
	private int numero;
	
	public int getNumero() {
		return this.numero;
	}

	public int size() {
		return 1;
	}

}
