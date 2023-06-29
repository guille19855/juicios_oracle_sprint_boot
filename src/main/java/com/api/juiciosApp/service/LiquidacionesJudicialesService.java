package com.api.juiciosApp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.api.juiciosApp.dto.LiquidacionesJudicialesDto;
import com.api.juiciosApp.dto.LiquidacionesJudicialesResponseDto;
import com.api.juiciosApp.model.LiquidacionesJudiciales;
import com.api.juiciosApp.repository.LiquidacionesJudicialesRepository;

@Service
public class LiquidacionesJudicialesService {
	
	
	@Autowired
	LiquidacionesJudicialesRepository liquidacionesJudicialesRepository;
	
	
	
	
	public LiquidacionesJudicialesResponseDto crearLiquidacion(LiquidacionesJudicialesDto body) {
		
		
		
		LiquidacionesJudiciales liquidacionesJudiciales=new LiquidacionesJudiciales();
		
		liquidacionesJudiciales.setCuit(body.getCuit());
		liquidacionesJudiciales.setLiquidacion(body.getLiquidacion());
		liquidacionesJudiciales.setTipo(body.getTipo());

		
		
		
		liquidacionesJudiciales=liquidacionesJudicialesRepository.save(liquidacionesJudiciales);
		
		LiquidacionesJudicialesResponseDto liquidacionesJudicialesResponseDto=new LiquidacionesJudicialesResponseDto(liquidacionesJudiciales.getIdJuicio(),liquidacionesJudiciales.getCuit(),liquidacionesJudiciales.getLiquidacion(),liquidacionesJudiciales.getTipo());
		
		
		
		return liquidacionesJudicialesResponseDto;
		
		
	
	}
	
	
	
	}




