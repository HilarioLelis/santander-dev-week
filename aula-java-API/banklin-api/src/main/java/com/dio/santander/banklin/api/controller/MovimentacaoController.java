package com.dio.santander.banklin.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklin.api.dto.NovaMovimentacao;
import com.dio.santander.banklin.api.dto.NovoCorrentista;
import com.dio.santander.banklin.api.model.Correntista;
import com.dio.santander.banklin.api.model.Movimentacao;
import com.dio.santander.banklin.api.repository.CorrentistaRepository;
import com.dio.santander.banklin.api.repository.MovimentacaoRepository;
import com.dio.santander.banklin.api.service.CorrentistaService;
import com.dio.santander.banklin.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")

public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List <Movimentacao> findAll() {
		return repository.findAll();
	}
	
	@PostMapping //metodo usado para adicionar novos "correntistas" e tenho que informar a baixo que isso sera uma tratado como uma requisição
	public void save (@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
