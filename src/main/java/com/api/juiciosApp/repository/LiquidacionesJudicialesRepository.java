package com.api.juiciosApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.juiciosApp.model.LiquidacionesJudiciales;

@Repository
public interface LiquidacionesJudicialesRepository extends JpaRepository<LiquidacionesJudiciales, Long>{

}
