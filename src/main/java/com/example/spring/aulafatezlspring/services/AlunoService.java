package com.example.spring.aulafatezlspring.services;

import org.springframework.stereotype.Service;

import com.example.spring.aulafatezlspring.entity.Aluno;
import com.example.spring.aulafatezlspring.repository.AlunoRepository;

@Service
public record AlunoService(AlunoRepository alunoRepository) {
	public Aluno salvar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
