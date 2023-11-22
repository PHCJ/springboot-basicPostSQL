package com.example.spring.aulafatezlspring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.aulafatezlspring.entity.Aluno;
import com.example.spring.aulafatezlspring.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public record AlunoController(AlunoService alunoService) {
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoService.salvar(aluno);
	}
}