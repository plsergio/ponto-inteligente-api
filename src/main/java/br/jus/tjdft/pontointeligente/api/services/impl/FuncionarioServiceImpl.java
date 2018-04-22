package br.jus.tjdft.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tjdft.pontointeligente.api.entities.Funcionario;
import br.jus.tjdft.pontointeligente.api.repositories.FuncionarioRepository;
import br.jus.tjdft.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionário: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando funcionário plelo cpf: {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando funcionario por email: {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
/*
	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando funcionario por id: {}", id);
		return Optional.ofNullable(this.funcionarioRepository.findOne(id));
	}*/

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
