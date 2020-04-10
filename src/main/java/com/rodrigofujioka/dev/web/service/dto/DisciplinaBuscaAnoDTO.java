package com.rodrigofujioka.dev.web.service.dto;

public class DisciplinaBuscaAnoDTO {
	
	private int anoInicial;
	private int anoFinal;
	
	
	
	
	public DisciplinaBuscaAnoDTO(int anoInicial, int anoFinal) {
		super();
		this.anoInicial = anoInicial;
		this.anoFinal = anoFinal;
	}




	public int getAnoInicial() {
		return anoInicial;
	}




	public void setAnoInicial(int anoInicial) {
		this.anoInicial = anoInicial;
	}




	public int getAnoFinal() {
		return anoFinal;
	}




	public void setAnoFinal(int anoFinal) {
		this.anoFinal = anoFinal;
	}
	

	
	
	

}
