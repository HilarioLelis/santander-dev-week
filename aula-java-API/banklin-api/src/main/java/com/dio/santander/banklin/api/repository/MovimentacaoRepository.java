package com.dio.santander.banklin.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklin.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
