package com.api.juiciosApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;


@Entity
@Table(name = "liquidacionesjudiciales5")
//@Table(name = "liquidacionesjudiciales", schema = "judiciales")
@Builder
public class LiquidacionesJudiciales {
	
	@Id
	@Column(name="idJuicio")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idJuicio;
	
	@Column(name="cuit")
	private String cuit;
	
	@Column(name="liquidacion")
	private String liquidacion;
	
	@Column(name="tipo")
	private String tipo;

	
	public LiquidacionesJudiciales() {

	}
	
	public LiquidacionesJudiciales(Long idJuicio, String cuit, String liquidacion, String tipo) {
		super();
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
