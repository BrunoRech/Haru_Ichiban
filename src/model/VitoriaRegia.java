package model;

//classe abstrata de da peca vitoria regia
public abstract class VitoriaRegia extends GameObject{
	
	protected String nomeFlor,ovas,aditivo;
	
	private boolean hasFlor = false;
	private boolean isVirada = false;
	
	protected boolean hasSapo = false;
	protected String sapo;
	
	public VitoriaRegia reset() {
		setVirada(false);
		setHasFlor(false);
		this.hasSapo = false;
		this.sapo = null;
		corFlor = "";
		this.ovas = "";
		this.aditivo = "";
		this.nomeFlor = "Vr_Clara";
		return this;
	}
	
	protected String corFlor = "";
	
	//metodos em comum que nao possuem variacao
	public boolean isVirada() {
		return this.isVirada;
	}
	
	@Override
	public String getImagem() {
		return "imagens/"+nomeFlor+ovas+aditivo+".png";
	}

	public VitoriaRegia getVr() {
		return this;
	}
	
	public String getFlorCor() {
		return corFlor;
	}
	public boolean isHasSapo() {
		return hasSapo;
	}
	public void setHasSapo(boolean hasSapo) {
		this.hasSapo = hasSapo;
	}
	public String getSapo() {
		return sapo;
	}
	public void setSapo(String sapo) {
		this.sapo = sapo;
	}
	public boolean isHasFlor() {
		return hasFlor;
	}
	public void setHasFlor(boolean hasFlor) {
		this.hasFlor = hasFlor;
	}
	public void setVirada(boolean isVirada) {
		this.isVirada = isVirada;
	}
	
	public String getNomeFlor() {
		return nomeFlor;
	}
	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}
	public String getOvas() {
		return ovas;
	}
	public void setOvas(String ovas) {
		this.ovas = ovas;
	}
	public String getAditivo() {
		return aditivo;
	}
	public void setAditivo(String aditivo) {
		this.aditivo = aditivo;
	}
	
	
	
	
	
	
	
	
	

}
