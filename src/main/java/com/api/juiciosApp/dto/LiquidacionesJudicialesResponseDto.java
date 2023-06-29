package com.api.juiciosApp.dto;



public class LiquidacionesJudicialesResponseDto {
	
	
    private Long idJuicio;
	private String cuit;
	private String liquidacion;
	private String tipo;
	
	
	public LiquidacionesJudicialesResponseDto(Long idJuicio, String cuit, String liquidacion, String tipo) {

		this.idJuicio = idJuicio;
		this.cuit = cuit;
		this.liquidacion = liquidacion;
		this.tipo = tipo;
	}
	public Long getIdJuicio() {
		return idJuicio;
	}
	public void setIdJuicio(Long idJuicio) {
		this.idJuicio = idJuicio;
	}
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
