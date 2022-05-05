package com.dio.santander.banklin.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklin.api.dto.NovoCorrentista;
import com.dio.santander.banklin.api.model.Correntista;
import com.dio.santander.banklin.api.repository.CorrentistaRepository;
import com.dio.santander.banklin.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")

public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List <Correntista> findAll() {
		return repository.findAll();
	}
	
	@PostMapping //metodo usado para adicionar novos "correntistas" e tenho que informar a baixo que isso sera uma tratado como uma requisição
	public void save (@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
	}
}
