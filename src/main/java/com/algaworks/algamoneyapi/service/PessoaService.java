package com.algaworks.algamoneyapi.service;

import com.algaworks.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa) {
        Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
        if (pessoaSalva.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        Pessoa personSaved = pessoaSalva.get();
        personSaved.setNome(pessoa.getNome());
        personSaved.setEndereco(pessoa.getEndereco());

        return pessoaRepository.save(personSaved);
    }

    public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
        Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
        pessoaSalva.setAtivo(ativo);
        pessoaRepository.save(pessoaSalva);

    }

    private Pessoa buscarPessoaPeloCodigo(Long codigo) {
        Pessoa pessoaSalva = pessoaRepository.getReferenceById(codigo);   //Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
        if (pessoaSalva == null) {                               //if (pessoaSalva.isEmpty())
            throw new EmptyResultDataAccessException(1);
        }
        return pessoaSalva;
    }

}
