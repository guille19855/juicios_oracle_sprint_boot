package com.api.juiciosApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.juiciosApp.dto.LiquidacionesJudicialesDto;
import com.api.juiciosApp.dto.LiquidacionesJudicialesResponseDto;
import com.api.juiciosApp.service.LiquidacionesJudicialesService;

//import jakarta.validation.Valid;


@RestController
@RequestMapping("/juiciosapp")
public class LiquidacionesJudicialesController {

	 @Autowired
	LiquidacionesJudicialesService liquidacionesJudicialesService;
	 
	 
	 
	 @PostMapping("/crearjuicio")
	 @ResponseBody
	 public LiquidacionesJudicialesResponseDto crearLiquidacion(@RequestBody LiquidacionesJudicialesDto body) {
		 
		 
		 LiquidacionesJudicialesResponseDto liquidacionesJudicialesResponseDto;
		 
		 liquidacionesJudicialesResponseDto=liquidacionesJudicialesService.crearLiquidacion(body);
		 
		 return liquidacionesJudicialesResponseDto;
	 
	 }
	 
	
	
}
