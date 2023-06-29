package com.api.juiciosApp.dto;

import javax.persistence.Column;


public class LiquidacionesJudicialesDto {
	
	@Column(name="cuit")
	private String cuit;
	
	@Column(name="liquidacion")
	private String liquidacion;
	
	@Column(name="tipo")
	private String tipo;

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getLiquidacion() {
		return liquidacion;
	}

	public void setLiquidacion(String liquidacion) {
		this.liquidacion = liquidacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	

}
